package com.clinicaMedica.Clinica.Repository;

import com.clinicaMedica.Clinica.Model.Medicos;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MedicoRepository extends JpaRepository<Medicos, Long> {
}
