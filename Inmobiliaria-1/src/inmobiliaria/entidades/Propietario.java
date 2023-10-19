package inmobiliaria.entidades;

public class Propietario {

    private Integer idPropietario;
    private String nombre;
    private String apellido;
    private String telefono;
    private String dni;
    private String domicilio;
    private boolean estado;

    public Propietario() {
    }

    ;
    public Propietario(Integer idPropietario, String nombre, String apellido, String domicilio, String telefono, String dni, boolean estado) {
        this.idPropietario = idPropietario;
        this.nombre = nombre;
        this.apellido = apellido;
        this.domicilio = domicilio;
        this.telefono = telefono;
        this.dni = dni;
        this.estado = estado;
    }

    public Propietario(String nombre, String apellido, String domicilio, String telefono, String dni, boolean estado) {

        this.nombre = nombre;
        this.apellido = apellido;
        this.domicilio = domicilio;
        this.telefono = telefono;
        this.dni = dni;
        this.estado = estado;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public Integer getIdPropietario() {
        return idPropietario;
    }

    public void setIdPropietario(Integer idPropietario) {
        this.idPropietario = idPropietario;
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

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    @Override
    public String toString() {
        return "id:" + idPropietario + ", " + nombre + ", " + apellido + ", " + dni;
    }

}
