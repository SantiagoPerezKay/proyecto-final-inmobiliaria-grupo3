/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inmobiliaria.entidades;

/**
 *
 * @author Agente Sosa
 */
public class Inmueble {

    private int idInmueble;
    private String direccion;
    private int altura;
    private String tipo;
    private double superficie;
    private double precio;
    private String disponibilidad;
    private Propietario propietario;
    private boolean estado;

    public Inmueble(int idInmueble, String direccion, int altura, String tipo, double superficie, double precio, String disponibilidad, Propietario propietario,boolean estado) {
        this.idInmueble = idInmueble;
        this.direccion = direccion;
        this.altura = altura;
        this.tipo = tipo;
        this.superficie = superficie;
        this.precio = precio;
        this.disponibilidad = disponibilidad;
        this.propietario = propietario;
        this.estado =  estado;
    }

    public Inmueble() {
    }

    public Inmueble(String direccion, int altura, String tipo, double superficie, double precio, String disponibilidad, Propietario propietario,boolean estado) {
        this.direccion = direccion;
        this.altura = altura;
        this.tipo = tipo;
        this.superficie = superficie;
        this.precio = precio;
        this.disponibilidad = disponibilidad;
        this.propietario = propietario;
        this.estado =  estado;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public int getIdInmueble() {
        return idInmueble;
    }

    public void setIdInmueble(int idInmueble) {
        this.idInmueble = idInmueble;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getSuperficie() {
        return superficie;
    }

    public void setSuperficie(double superficie) {
        this.superficie = superficie;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(String disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

  

    public Propietario getPropietario() {
        return propietario;
    }

    public void setPropietario(Propietario propietario) {
        this.propietario = propietario;
    }

    @Override
    public String toString() {
        return "Inmueble{" + "idInmueble=" + idInmueble + ", direccion=" + direccion + ", altura=" + altura + ", tipo=" + tipo + ", superficie=" + superficie + ", precio=" + precio + ", disponibilidad=" + disponibilidad + ", propietario=" + propietario + '}';
    }

}
