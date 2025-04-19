package com.clinicaMedica.Clinica.Controller;

import com.clinicaMedica.Clinica.Model.Pacientes;
import com.clinicaMedica.Clinica.Service.PacienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/pacientes")
public class PacienteController {
    @Autowired
    private PacienteService pacienteService;
    @GetMapping
    public List<Pacientes> GetAllPacientes(){
        return pacienteService.GetAll();
    }
    @GetMapping("/{id}")
    public ResponseEntity<Pacientes> getById(@PathVariable Long id){
        return pacienteService.GetById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
    @PostMapping
    public Pacientes Create(@RequestBody Pacientes pacientes){
        return pacienteService.SavePaciente(pacientes);
    }
    @PutMapping("{id}")
    public ResponseEntity<Pacientes> Update(@PathVariable Long id, @RequestBody Pacientes pacientes){
        return pacienteService.UpdatePaciente(id, pacientes)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
    @DeleteMapping("{id}")
    public ResponseEntity<Void> Delete(@PathVariable Long id){
        if (pacienteService.ExistById(id)){
            pacienteService.DeleteById(id);
            return ResponseEntity.notFound().build();
        }else{
            return ResponseEntity.notFound().build();
        }

    }
}
