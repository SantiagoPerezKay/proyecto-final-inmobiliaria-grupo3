
package inmobiliaria.entidades;

import java.sql.Date;
import java.time.LocalDate;




public class Contrato {
    
    private int idContrato;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private double monto;
    private boolean estado; 
    private Inquilino inquilino;
    private Inmueble inmueble;

    public Contrato(int idContrato, LocalDate fechaInicio, LocalDate fechaFin, double monto, boolean estado, Inquilino inquilino, Inmueble inmueble) {
        this.idContrato = idContrato;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.monto = monto;
        this.estado = estado;
        this.inquilino = inquilino;
        this.inmueble = inmueble;
    }

    public Contrato() {
    }

    public Contrato(LocalDate fechaInicio, LocalDate fechaFin, double monto, boolean estado, Inquilino inquilino, Inmueble inmueble) {
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.monto = monto;
        this.estado = estado;
        this.inquilino = inquilino;
        this.inmueble = inmueble;
    }

    public int getIdContrato() {
        return idContrato;
    }

    public void setIdContrato(int idContrato) {
        this.idContrato = idContrato;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(LocalDate fechaFin) {
        this.fechaFin = fechaFin;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public Inquilino getInquilino() {
        return inquilino;
    }

    public void setInquilino(Inquilino inquilino) {
        this.inquilino = inquilino;
    }

    public Inmueble getInmueble() {
        return inmueble;
    }

    public void setInmueble(Inmueble inmueble) {
        this.inmueble = inmueble;
    }

    @Override
    public String toString() {
        return "Contrato{" + "idContrato=" + idContrato + ", fechaInicio=" + fechaInicio + ", fechaFin=" + fechaFin + ", monto=" + monto + ", estado=" + estado + ", inquilino=" + inquilino.getIdInquilino() + ", inmueble=" + inmueble.getIdInmueble() + '}';
    }
    
    
    
}
