package org.example.MODELOS;

public class Area {
    private Long id;
    private String nombre;
    private String empleado;
    private String sucursal;
    private String nomina;
    private String ubicacion;
    private Integer numeroEmpleados;
    private String horario;
    private String responsabilidades;
    private String objetivos;

    public Area() {
    }

    public Area(Long id, String nombre, String empleado, String sucursal, String nomina, String ubicacion, Integer numeroEmpleados, String horario, String responsabilidades, String objetivos) {
        this.id = id;
        this.nombre = nombre;
        this.empleado = empleado;
        this.sucursal = sucursal;
        this.nomina = nomina;
        this.ubicacion = ubicacion;
        this.numeroEmpleados = numeroEmpleados;
        this.horario = horario;
        this.responsabilidades = responsabilidades;
        this.objetivos = objetivos;
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

    public String getNomina() {
        return nomina;
    }

    public void setNomina(String nomina) {
        this.nomina = nomina;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public Integer getNumeroEmpleados() {
        return numeroEmpleados;
    }

    public void setNumeroEmpleados(Integer numeroEmpleados) {
        this.numeroEmpleados = numeroEmpleados;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getResponsabilidades() {
        return responsabilidades;
    }

    public void setResponsabilidades(String responsabilidades) {
        this.responsabilidades = responsabilidades;
    }

    public String getObjetivos() {
        return objetivos;
    }

    public void setObjetivos(String objetivos) {
        this.objetivos = objetivos;
    }

    @Override
    public String toString() {
        return "Area{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", empleado=" + empleado +
                ", sucursal=" + sucursal +
                ", nomina=" + nomina +
                ", ubicacion='" + ubicacion + '\'' +
                ", numeroEmpleados=" + numeroEmpleados +
                ", horario='" + horario + '\'' +
                ", responsabilidades='" + responsabilidades + '\'' +
                ", objetivos='" + objetivos + '\'' +
                '}';
    }
}
