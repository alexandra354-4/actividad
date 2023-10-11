
package Ejercicio2_servicios;

import java.time.LocalDate;

public abstract class Servicio {
    
    //propiedades
    protected String trabajador;
    protected LocalDate fechaInicio;
    protected String cliente;
    
    //constructor
    public Servicio(String trabajador, LocalDate fechaInicio, String cliente) {
        this.trabajador = trabajador;
        this.fechaInicio = fechaInicio;
        this.cliente = cliente;
    }
    
    //getter y setter
    public String getTrabajador() {
        return trabajador;
    }

    public void setTrabajador(String trabajador) {
        this.trabajador = trabajador;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }
    
    //métodos
    
    public abstract double costeMaterial();
    
    public abstract double costeManoObra();
    
    public abstract double costeTotal();
    
    public abstract String detalleServicio();
    
    
    
    
    
}
