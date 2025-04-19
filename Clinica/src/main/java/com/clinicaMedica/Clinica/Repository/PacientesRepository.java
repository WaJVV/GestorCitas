package com.clinicaMedica.Clinica.Repository;

import com.clinicaMedica.Clinica.Model.Pacientes;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface PacientesRepository extends JpaRepository<Pacientes, Long> {
    @Override
    List<Pacientes> findAll();

    @Override
    Optional<Pacientes> findById(Long aLong);

    @Override
    List<Pacientes> findAllById(Iterable<Long> longs);
}
