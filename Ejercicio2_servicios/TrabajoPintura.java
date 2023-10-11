
package Ejercicio2_servicios;

import java.time.LocalDate;


public class TrabajoPintura extends Servicio {
    
    //propiedades
    protected double superficie;
    protected double precioPintura;
    
    //constructor
    public TrabajoPintura(String trabajador, LocalDate fechaInicio, String cliente,
            double superficie, double precioPintura){
        super(trabajador, fechaInicio, cliente);
        this.superficie = superficie;
        this.precioPintura=precioPintura;
    }

    //getters y setters
    public double getSuperficie() {
        return superficie;
    }

    public void setSuperficie(double superficie) {
        this.superficie = superficie;
    }

    public double getPrecioPintura() {
        return precioPintura;
    }

    public void setPrecioPintura(double precioPintura) {
        this.precioPintura = precioPintura;
    }
    
    //métodos sobrescritos
    @Override
    public double costeMaterial() {
        return (superficie/7.8)*precioPintura;
    }

    @Override
    public double costeManoObra() {
        return (superficie/10)*9.5;
    }

    @Override
    public double costeTotal() {
        return costeMaterial()+costeManoObra()+costeAdicional();
    }
    private double costeAdicional(){
        if(superficie<50){
            return(costeMaterial()+costeManoObra()*0.15);
        }else{
            return 0;
        }
    }

    @Override
    public String detalleServicio(){
        String cadena = "";
        cadena += "TRABAJO DE PINTURA\n";
        cadena += "Cliente: " + cliente + "\n";
        cadena += "Fecha de inicio: " + fechaInicio + "\n";
        cadena += "-----------------------\n";
        cadena += "Pintor: " + trabajador + "\n";
        cadena += "Coste Material: " + costeMaterial() + "\n";
        cadena += "Coste Mano Obra: " + costeManoObra() + "\n";
        cadena += "Coste Adicional: " + costeAdicional() + "\n";
        cadena += "TOTAL: " + costeTotal() + "\n";
        cadena += "-----------------------\n";
        return cadena;
    }
    
}
