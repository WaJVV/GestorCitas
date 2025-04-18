package com.clinicaMedica.Clinica.Dto;

import java.time.LocalDate;
import java.util.Date;

public record PacientesDTO(Long id_paciente, String nombre,
                           String p_apellido, String m_apellido, LocalDate fecha_nacimiento, String genero, int telefono, String correo ) {
}