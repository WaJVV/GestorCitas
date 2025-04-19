package com.clinicaMedica.Clinica.Service;

import com.clinicaMedica.Clinica.Model.Citas;
import com.clinicaMedica.Clinica.Repository.CitaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
public class CitaService {
    @Autowired
    private CitaRepository repository;

    public List<Citas> GetAll(){
        return repository.findAll();
    }
    public Optional<Citas> GetById(Long id){
        return repository.findById(id);
    }
    public Citas SaveCita(Citas citas){
        return repository.save(citas);
    }
    public Optional<Citas> UpdateCita(Long id, Citas nuevaCita){
        return repository.findById(id).map(citaExistente -> {

            citaExistente.setFechaCita(nuevaCita.getFechaCita());
            citaExistente.setHoraFecha(nuevaCita.getHoraFecha());
            citaExistente.setEstado(nuevaCita.getEstado());
            citaExistente.setNotas(nuevaCita.getNotas());


            return repository.save(citaExistente);
        });
    }
    public void DeleteById(Long id){
        repository.deleteById(id);
    }
    public List<Citas> GetByDate(LocalDate fecha){
        return repository.findByFechaCita(fecha);
    }
    public boolean ExistById(Long id){
        return repository.existsById(id);
    }

}
