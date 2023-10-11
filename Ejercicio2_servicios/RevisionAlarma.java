
package Ejercicio2_servicios;

import java.time.LocalDate;

public class RevisionAlarma extends Servicio {
    
    //propiedad
    protected int num_alarmas;
    
    //constructor
    public RevisionAlarma(LocalDate fechaInicio, String cliente, int num_alarmas ) {
        super("Revision Especialista Contraincendios", fechaInicio, cliente);
        this.num_alarmas = num_alarmas;
    }
    
    //getter y setter
    public int getNum_alarmas() {
        return num_alarmas;
    }

    public void setNum_alarmas(int num_alarmas) {
        this.num_alarmas = num_alarmas;
    }
    
    //metodos sobrescritos
    @Override
    public double costeMaterial() {
        return 0;
    }

    @Override
    public double costeManoObra() {
        return (num_alarmas/3)*40;
    }

    @Override
    public double costeTotal() {
        return costeManoObra();
    }

    @Override
    public String detalleServicio() {
        String cadena = "";
        cadena += "REVISIÓN PERIÓDICA ALARMAS CONTRAINCENDIOS\n";
        cadena += "Cliente: " + cliente + "\n";
        cadena += "Fecha revisión: " + fechaInicio +"\n";
        cadena += "------------------------------\n";
        cadena += "TOTAL: " + costeTotal() +"\n";
        cadena += "------------------------------\n";
        return cadena;
    }
    
}
