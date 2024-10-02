package org.example.MODELOS;

import java.time.LocalDate;

public class Nomina {
    private Long id;
    private String nombre;
    private Integer bonificacion;
    private String empleado;
    private String sucursal;
    private String area;
    private LocalDate fechaPago;
    private String estadoNomina;
    private String cargo;
    private String beneficios;

    public Nomina() {
    }

    public Nomina(Long id, String nombre, Integer bonificacion, String empleado, String sucursal, String area, LocalDate fechaPago, String estadoNomina, String cargo, String beneficios) {
        this.id = id;
        this.nombre = nombre;
        this.bonificacion = bonificacion;
        this.empleado = empleado;
        this.sucursal = sucursal;
        this.area = area;
        this.fechaPago = fechaPago;
        this.estadoNomina = estadoNomina;
        this.cargo = cargo;
        this.beneficios = beneficios;
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

    public Integer getBonificacion() {
        return bonificacion;
    }

    public void setBonificacion(Integer bonificacion) {
        this.bonificacion = bonificacion;
    }

    public String getEmpleado() {
        return empleado;
    }

    public void setEmpleado(String empleado) {
        this.empleado = empleado;
    }

    public String getSucursal() {
        return sucursal;
    }

    public void setSucursal(String sucursal) {
        this.sucursal = sucursal;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public LocalDate getFechaPago() {
        return fechaPago;
    }

    public void setFechaPago(LocalDate fechaPago) {
        this.fechaPago = fechaPago;
    }

    public String getEstadoNomina() {
        return estadoNomina;
    }

    public void setEstadoNomina(String estadoNomina) {
        this.estadoNomina = estadoNomina;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getBeneficios() {
        return beneficios;
    }

    public void setBeneficios(String beneficios) {
        this.beneficios = beneficios;
    }

    @Override
    public String toString() {
        return "Nomina{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", bonificacion=" + bonificacion +
                ", empleado=" + empleado +
                ", sucursal=" + sucursal +
                ", area=" + area +
                ", fechaPago=" + fechaPago +
                ", estadoNomina='" + estadoNomina + '\'' +
                ", cargo='" + cargo + '\'' +
                ", beneficios='" + beneficios + '\'' +
                '}';
    }
}
