package com.clinicaMedica.Clinica.Controller;

import com.clinicaMedica.Clinica.Model.Citas;
import com.clinicaMedica.Clinica.Service.CitaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/citas")
public class CitaController {
    @Autowired
    private CitaService citaService;

    @GetMapping
    public List<Citas> GetAllCitas(){
        return citaService.GetAll();
    }
    @GetMapping("/{id}")
    public ResponseEntity<Citas> getById(@PathVariable Long id){
        return citaService.GetById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
    @PostMapping
    public Citas Create(@RequestBody Citas citas){
        return citaService.SaveCita(citas);
    }
    @PutMapping("/{id}")
    public ResponseEntity<Citas> Update(@PathVariable Long id, @RequestBody Citas citas){
        return citaService.UpdateCita(id, citas)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> Delete(@PathVariable Long id) {
        if (citaService.ExistById(id)) {
            citaService.DeleteById(id);
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
