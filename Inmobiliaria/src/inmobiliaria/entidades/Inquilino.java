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
public class Inquilino {
    
    private int idInquilino;
    private String cuit;
    private String nombre;
    private String apellido;
    private String lugarTrabajo;
    private String nombreGarante;
    private String dniGarante;

    public Inquilino() {
    }
    
    public Inquilino(int idInquilino, String cuit, String nombre, String apellido, String lugarTrabajo, String nombreGarante, String dniGarante) {
        this.idInquilino = idInquilino;
        this.cuit = cuit;
        this.nombre = nombre;
        this.apellido = apellido;
        this.lugarTrabajo = lugarTrabajo;
        this.nombreGarante = nombreGarante;
        this.dniGarante = dniGarante;
    } 
    
      public Inquilino(String cuit, String nombre, String apellido, String lugarTrabajo, String nombreGarante, String dniGarante) {
    
        this.cuit = cuit;
        this.nombre = nombre;
        this.apellido = apellido;
        this.lugarTrabajo = lugarTrabajo;
        this.nombreGarante = nombreGarante;
        this.dniGarante = dniGarante;
    
        }
    public int getIdInquilino() {
        return idInquilino;
    }

    public void setIdInquilino(int idInquilino) {
        this.idInquilino = idInquilino;
    }

    public String getCuit() {
        return cuit;
    }

    public void setCuit(String cuit) {
        this.cuit = cuit;
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

    public String getLugarTrabajo() {
        return lugarTrabajo;
    }

    public void setLugarTrabajo(String lugarTrabajo) {
        this.lugarTrabajo = lugarTrabajo;
    }

    public String getNombreGarante() {
        return nombreGarante;
    }

    public void setNombreGarante(String nombreGarante) {
        this.nombreGarante = nombreGarante;
    }

    public String getDniGarante() {
        return dniGarante;
    }

    public void setDniGarante(String dniGarante) {
        this.dniGarante = dniGarante;
    }

    @Override
    public String toString() {
        return "Inquilino{" + "idInquilino=" + idInquilino + ", cuit=" + cuit + ", nombre=" + nombre + ", apellido=" + apellido + ", lugarTrabajo=" + lugarTrabajo + ", nombreGarante=" + nombreGarante + ", dniGarante=" + dniGarante + '}';
    }

    
}