package org.example.MODELOS;

import java.time.LocalDate;

public class Beneficiario {
    private Long id;
    private String nombre;
    private String identificacion;
    private LocalDate fechaNacimiento;
    private String genero;
    private String telefono;
    private String correo;
    private String direccion;
    private String parentesco;
    private String empleado;

    public Beneficiario() {
    }

    public Beneficiario(Long id, String nombre, String identificacion, LocalDate fechaNacimiento, String genero, String telefono, String correo, String direccion, String parentesco, String empleado) {
        this.id = id;
        this.nombre = nombre;
        this.identificacion = identificacion;
        this.fechaNacimiento = fechaNacimiento;
        this.genero = genero;
        this.telefono = telefono;
        this.correo = correo;
        this.direccion = direccion;
        this.parentesco = parentesco;
        this.empleado = empleado;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getParentesco() {
        return parentesco;
    }

    public void setParentesco(String parentesco) {
        this.parentesco = parentesco;
    }

    public String getEmpleado() {
        return empleado;
    }

    public void setEmpleado(String empleado) {
        this.empleado = empleado;
    }

    @Override
    public String toString() {
        return "Beneficiario{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", identificacion='" + identificacion + '\'' +
                ", fechaNacimiento=" + fechaNacimiento +
                ", genero='" + genero + '\'' +
                ", telefono='" + telefono + '\'' +
                ", correo='" + correo + '\'' +
                ", direccion='" + direccion + '\'' +
                ", parentesco='" + parentesco + '\'' +
                ", empleado=" + empleado +
                '}';
    }
}
