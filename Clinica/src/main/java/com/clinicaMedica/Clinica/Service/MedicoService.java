package com.clinicaMedica.Clinica.Service;

import com.clinicaMedica.Clinica.Model.Medicos;
import com.clinicaMedica.Clinica.Repository.MedicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MedicoService {
    @Autowired
    private MedicoRepository repository;

    public List<Medicos> GetAll(){
        return repository.findAll();
    }
    public Optional<Medicos> GetById(Long id){
        return repository.findById(id);
    }
    public Medicos SaveMedico(Medicos medicos){
        return repository.save(medicos);
    }
    public Optional<Medicos> UpdateMedico(Long id, Medicos medicosNuevo){
        return repository.findById(id).map(medicosExistente -> {
            medicosExistente.setNombre(medicosNuevo.getNombre());
            medicosExistente.setpApellido(medicosNuevo.getpApellido());
            medicosExistente.setmApellido(medicosNuevo.getmApellido());
            medicosExistente.setCodigoP(medicosNuevo.getCodigoP());
            medicosExistente.setEspecialidad(medicosNuevo.getEspecialidad());
            medicosExistente.setCorreo(medicosNuevo.getCorreo());
            medicosExistente.setTelefono(medicosNuevo.getTelefono());

            return repository.save(medicosExistente);
        });
    }
    public void DeleteById(Long id){
        repository.deleteById(id);
    }
    public boolean ExistById(Long id){
        return repository.existsById(id);
    }
}
