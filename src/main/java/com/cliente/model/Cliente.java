package com.cliente.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

import java.time.LocalDate;

@Entity
@Table(name = "CLIENTE")
public class Cliente {

	@Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "cliente_seq")
    @SequenceGenerator(
            name = "cliente_seq",
            sequenceName = "SEQ_CLIENTE",
            allocationSize = 1
    )
    @Column(name = "ID_CLIENTE")
    private Long idCliente;

    @NotBlank(message = "El nombre es obligatorio")
    @Size(max = 100)
    @Column(name = "NOMBRE", nullable = false, length = 100)
    private String nombre;

    @NotNull(message = "La fecha de nacimiento es obligatoria")
    @Column(name = "FECHA_NACIMIENTO")
    private java.time.LocalDate fechaNacimiento;

    @Pattern(regexp = "\\d{10}", message = "El celular debe tener 10 dígitos")
    @Column(name = "CELULAR", length = 10)
    private String celular;

    @Email(message = "Correo inválido")
    @Column(name = "CORREO", length = 100)
    private String correo;

    @Size(min = 11, max = 11)
    @Column(name = "NSS", length = 11)
    private String nss;

    @Size(min = 18, max = 18)
    @Column(name = "CURP", length = 18)
    private String curp;

    // Constructor
    public Cliente() {
    }
    
    // Getters y Setters
    public Long getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Long idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getNss() {
        return nss;
    }

    public void setNss(String nss) {
        this.nss = nss;
    }

    public String getCurp() {
        return curp;
    }

    public void setCurp(String curp) {
        this.curp = curp;
    }
}