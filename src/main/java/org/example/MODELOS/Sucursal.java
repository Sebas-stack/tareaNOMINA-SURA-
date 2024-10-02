package org.example.MODELOS;

public class Sucursal {
    private Long id;
    private String nombre;
    private String direccion;
    private String pais;
    private String telefoono;
    private String correo;
    private String horarioAtencion;
    private String codigoPostal;
    private String empleado;
    private String nomina;

    public Sucursal() {
    }

    public Sucursal(Long id, String nombre, String direccion, String pais, String telefoono, String correo, String horarioAtencion, String codigoPostal, String empleado, String nomina) {
        this.id = id;
        this.nombre = nombre;
        this.direccion = direccion;
        this.pais = pais;
        this.telefoono = telefoono;
        this.correo = correo;
        this.horarioAtencion = horarioAtencion;
        this.codigoPostal = codigoPostal;
        this.empleado = empleado;
        this.nomina = nomina;
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

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getTelefoono() {
        return telefoono;
    }

    public void setTelefoono(String telefoono) {
        this.telefoono = telefoono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getHorarioAtencion() {
        return horarioAtencion;
    }

    public void setHorarioAtencion(String horarioAtencion) {
        this.horarioAtencion = horarioAtencion;
    }

    public String getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public String getEmpleado() {
        return empleado;
    }

    public void setEmpleado(String empleado) {
        this.empleado = empleado;
    }

    public String getNomina() {
        return nomina;
    }

    public void setNomina(String nomina) {
        this.nomina = nomina;
    }

    @Override
    public String toString() {
        return "Sucursal{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", direccion='" + direccion + '\'' +
                ", pais='" + pais + '\'' +
                ", telefoono='" + telefoono + '\'' +
                ", correo='" + correo + '\'' +
                ", horarioAtencion='" + horarioAtencion + '\'' +
                ", codigoPostal='" + codigoPostal + '\'' +
                ", empleado=" + empleado +
                ", nomina=" + nomina +
                '}';
    }
}
