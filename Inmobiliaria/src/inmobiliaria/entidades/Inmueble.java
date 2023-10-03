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
    private Character tipo;
    private double superficie;
    private double precio;
    private boolean disponibilidad; 

    public Inmueble(int idInmueble, String direccion, int altura, Character tipo, double superficie, double precio, boolean disponibilidad) {
        this.idInmueble = idInmueble;
        this.direccion = direccion;
        this.altura = altura;
        this.tipo = tipo;
        this.superficie = superficie;
        this.precio = precio;
        this.disponibilidad = disponibilidad;
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

    public Character getTipo() {
        return tipo;
    }

    public void setTipo(Character tipo) {
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

    public boolean isDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(boolean disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    @Override
    public String toString() {
        return "Inmueble{" + "idInmueble=" + idInmueble + ", direccion=" + direccion + ", altura=" + altura + ", tipo=" + tipo + ", superficie=" + superficie + ", precio=" + precio + ", disponibilidad=" + disponibilidad + '}';
    }
    
    
    
}
