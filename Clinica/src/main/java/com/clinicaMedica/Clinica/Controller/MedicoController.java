package com.clinicaMedica.Clinica.Controller;

import com.clinicaMedica.Clinica.Model.Medicos;
import com.clinicaMedica.Clinica.Service.MedicoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api/medicos")
@RestController
public class MedicoController {
    @Autowired
    private MedicoService medicoService;

    @GetMapping
    public List<Medicos> GetAllMedicos(){
        return medicoService.GetAll();
    }
    @GetMapping("/{id}")
    public ResponseEntity<Medicos>getById(@PathVariable Long id){
        return medicoService.GetById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
    @PostMapping
    public Medicos Create(Medicos medicos){
        return medicoService.SaveMedico(medicos);
    }
    @PutMapping("/{id}")
    public ResponseEntity<Medicos> Update(@PathVariable Long id, @RequestBody Medicos medicos){
        return medicoService.UpdateMedico(id, medicos)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> Delete(@PathVariable Long id){
        if (medicoService.ExistById(id)){
            medicoService.DeleteById(id);
            return ResponseEntity.noContent().build();
        }else {
            return ResponseEntity.notFound().build();
        }
    }
}
