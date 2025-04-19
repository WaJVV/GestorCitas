package com.clinicaMedica.Clinica.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalTime;
@Table(name = "Citas")
@Entity
@Getter
@Setter
public class Citas {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCita;

    @ManyToOne
    @JoinColumn(name = "medico_id")
    private Medicos medico;

    @ManyToOne
    @JoinColumn(name = "paciente_id")
    private Pacientes paciente;

    private LocalDate fechaCita;
    private LocalTime horaFecha;
    private String estado;
    private String notas;

    public Citas() {
    }

    public Citas(Long idCita, Medicos medico, Pacientes paciente, LocalDate fechaCita, LocalTime horaFecha, String estado, String notas) {
        this.idCita = idCita;
        this.medico = medico;
        this.paciente = paciente;
        this.fechaCita = fechaCita;
        this.horaFecha = horaFecha;
        this.estado = estado;
        this.notas = notas;
    }

    public Long getIdCita() {
        return idCita;
    }

    public void setIdCita(Long idCita) {
        this.idCita = idCita;
    }

    public Medicos getMedico() {
        return medico;
    }

    public void setMedico(Medicos medico) {
        this.medico = medico;
    }

    public Pacientes getPaciente() {
        return paciente;
    }

    public void setPaciente(Pacientes paciente) {
        this.paciente = paciente;
    }

    public LocalDate getFechaCita() {
        return fechaCita;
    }

    public void setFechaCita(LocalDate fechaCita) {
        this.fechaCita = fechaCita;
    }

    public LocalTime getHoraFecha() {
        return horaFecha;
    }

    public void setHoraFecha(LocalTime horaFecha) {
        this.horaFecha = horaFecha;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getNotas() {
        return notas;
    }

    public void setNotas(String notas) {
        this.notas = notas;
    }
}
