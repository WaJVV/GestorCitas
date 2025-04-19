package com.clinicaMedica.Clinica.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Table(name = "Medicos")
@Entity
@Getter
@Setter

public class Medicos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idMedico;

    private String nombre;
    private int codigoP;
    private String pApellido;
    private String mApellido;
    private String especialidad;
    private int telefono;
    private String correo;

    public Medicos() {
    }

    public Medicos(Long idMedico, String nombre, int codigoP, String pApellido, String mApellido, String especialidad, int telefono, String correo) {
        this.idMedico = idMedico;
        this.nombre = nombre;
        this.codigoP = codigoP;
        this.pApellido = pApellido;
        this.mApellido = mApellido;
        this.especialidad = especialidad;
        this.telefono = telefono;
        this.correo = correo;
    }

    public Long getIdMedico() {
        return idMedico;
    }

    public void setIdMedico(Long idMedico) {
        this.idMedico = idMedico;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCodigoP() {
        return codigoP;
    }

    public void setCodigoP(int codigoP) {
        this.codigoP = codigoP;
    }

    public String getpApellido() {
        return pApellido;
    }

    public void setpApellido(String pApellido) {
        this.pApellido = pApellido;
    }

    public String getmApellido() {
        return mApellido;
    }

    public void setmApellido(String mApellido) {
        this.mApellido = mApellido;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

}
