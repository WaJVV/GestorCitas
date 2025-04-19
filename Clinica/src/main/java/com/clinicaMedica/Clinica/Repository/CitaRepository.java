package com.clinicaMedica.Clinica.Repository;

import com.clinicaMedica.Clinica.Model.Citas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Repository
public interface CitaRepository extends JpaRepository<Citas, Long> {

    List<Citas>findByFechaCita(LocalDate fechaCita);
}
