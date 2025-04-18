package com.clinicaMedica.Clinica.Dto;

import java.time.LocalDate;
import java.time.LocalTime;

public record CitasDTO(Long id_cita,  LocalDate fecha_cita,LocalTime hora_fecha ,String estado,String notas) {
}
