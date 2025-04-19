package com.clinicaMedica.Clinica.Service;

import com.clinicaMedica.Clinica.Model.Pacientes;
import com.clinicaMedica.Clinica.Repository.PacientesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PacienteService{
    @Autowired
    private PacientesRepository repository;

    public List<Pacientes>GetAll(){
        return repository.findAll();
    }
    public Optional<Pacientes>GetById(Long id){
        return repository.findById(id);
    }
    public Pacientes SavePaciente(Pacientes pacientes){
        return repository.save(pacientes);
    }
    public Optional<Pacientes> UpdatePaciente(Long id, Pacientes nuevoPaciente){
        return repository.findById(id).map(pacientesExistente -> {
            pacientesExistente.setNombre(nuevoPaciente.getNombre());
            pacientesExistente.setpApellido(nuevoPaciente.getpApellido());
            pacientesExistente.setmApellido(nuevoPaciente.getmApellido());
            pacientesExistente.setGenero(nuevoPaciente.getGenero());
            pacientesExistente.setTelefono(nuevoPaciente.getTelefono());
            pacientesExistente.setCorreo(nuevoPaciente.getCorreo());
            pacientesExistente.setFechaNacimiento(nuevoPaciente.getFechaNacimiento());

            return repository.save(pacientesExistente);
        });
    }
    public void DeleteById(Long id){
        repository.deleteById(id);
    }
    public boolean ExistById(Long id){
        return repository.existsById(id);
    }
}
