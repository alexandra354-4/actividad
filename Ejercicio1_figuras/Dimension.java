
package Ejercicio1_figuras;

public class Dimension {
    
    //propiedades
    private double alto;
    private double ancho;
    private double profundidad;
    
    //constructores
    public Dimension(){
        this.alto=0;
        this.ancho=0;
        this.profundidad=0;   
    }
    
    public Dimension(double alto, double ancho, double profundidad){
        this.alto=alto;
        this.ancho=ancho;
        this.profundidad=profundidad;
    }
    
    //getters y setters
    public double getAlto() {
        return alto;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getProfundidad() {
        return profundidad;
    }

    public void setProfundidad(double profundidad) {
        this.profundidad = profundidad;
    }
    
    //método de cálculo
    public double getVolumen(){
        return alto*ancho*profundidad;
    }
    
    //método toString
    @Override
    public String toString() {
        return "Dimension:" + "Alto = " + alto + ", Ancho = " + ancho + ", Profundidad = " + profundidad ;
    }
    
    
}
