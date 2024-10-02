package org.example.MODELOS;

import java.time.LocalDate;

public class Empleado {
    private Long id;
    private  String nombre;
    private String apellido;
    private LocalDate fechaNacimiento;
    private String identificacion;
    private String cargo;
    private LocalDate fechaIngreso;
    private String experienciaLaboral;
    private String habilidades;
    private String estadoCilvil;
    private Boolean tieneHijos;
    private String area;
    private String beneficiario;
    private String nomina;
    private String sucursal;

    public Empleado() {
    }

    public Empleado(Long id, String nombre, String apellido, LocalDate fechaNacimiento, String identificacion, String cargo, LocalDate fechaIngreso, String experienciaLaboral, String habilidades, String estadoCilvil, Boolean tieneHijos, String area, String beneficiario, String nomina, String sucursal) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
        this.identificacion = identificacion;
        this.cargo = cargo;
        this.fechaIngreso = fechaIngreso;
        this.experienciaLaboral = experienciaLaboral;
        this.habilidades = habilidades;
        this.estadoCilvil = estadoCilvil;
        this.tieneHijos = tieneHijos;
        this.area = area;
        this.beneficiario = beneficiario;
        this.nomina = nomina;
        this.sucursal = sucursal;
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

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public LocalDate getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(LocalDate fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public String getExperienciaLaboral() {
        return experienciaLaboral;
    }

    public void setExperienciaLaboral(String experienciaLaboral) {
        this.experienciaLaboral = experienciaLaboral;
    }

    public String getHabilidades() {
        return habilidades;
    }

    public void setHabilidades(String habilidades) {
        this.habilidades = habilidades;
    }

    public String getEstadoCilvil() {
        return estadoCilvil;
    }

    public void setEstadoCilvil(String estadoCilvil) {
        this.estadoCilvil = estadoCilvil;
    }

    public Boolean getTieneHijos() {
        return tieneHijos;
    }

    public void setTieneHijos(Boolean tieneHijos) {
        this.tieneHijos = tieneHijos;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getBeneficiario() {
        return beneficiario;
    }

    public void setBeneficiario(String beneficiario) {
        this.beneficiario = beneficiario;
    }

    public String getNomina() {
        return nomina;
    }

    public void setNomina(String nomina) {
        this.nomina = nomina;
    }

    public String getSucursal() {
        return sucursal;
    }

    public void setSucursal(String sucursal) {
        this.sucursal = sucursal;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", fechaNacimiento=" + fechaNacimiento +
                ", identificacion='" + identificacion + '\'' +
                ", cargo='" + cargo + '\'' +
                ", fechaIngreso=" + fechaIngreso +
                ", experienciaLaboral='" + experienciaLaboral + '\'' +
                ", habilidades='" + habilidades + '\'' +
                ", estadoCilvil='" + estadoCilvil + '\'' +
                ", tieneHijos=" + tieneHijos +
                ", area=" + area +
                ", beneficiario=" + beneficiario +
                ", nomina=" + nomina +
                ", sucursal=" + sucursal +
                '}';
    }
}
