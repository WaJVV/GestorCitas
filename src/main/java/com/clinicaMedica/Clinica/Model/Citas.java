package com.clinicaMedica.Clinica.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalTime;


@Entity
@Setter
@Getter
@AllArgsConstructor
public class Citas {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_cita;
    @ManyToOne
    @JoinColumn(name = "medico_id")
    private Medicos medicos;
    @ManyToOne
    @JoinColumn(name = "paciente_id")
    private Pacientes pacientes;
    private LocalDate fecha_cita;
    private LocalTime hora_fecha;
    private String estado;
    private String notas;
}
