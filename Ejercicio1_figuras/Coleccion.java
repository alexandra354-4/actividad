
package Ejercicio1_figuras;

import java.util.ArrayList;

public class Coleccion {
    
    //propiedades
    private String nombreColeccion;
    private ArrayList<Figura>listaFiguras;
    
    //constrctor 
    public Coleccion(String nombreColeccion){
        this.nombreColeccion=nombreColeccion;
        listaFiguras = new ArrayList<>();
    }
    
    //getters y setters

    public String getNombreColeccion() {
        return nombreColeccion;
    }

    public void setNombreColeccion(String nombreColeccion) {
        this.nombreColeccion = nombreColeccion;
    }

    public ArrayList<Figura> getListaFiguras() {
        return listaFiguras;
    }

    public void setListaFiguras(ArrayList<Figura> listaFiguras) {
        this.listaFiguras = listaFiguras;
    }
    
   
    //metodo modificadores
    public void añadirFigura(Figura fig){
        listaFiguras.add(fig); 
    }
    
    public void subirPrecio(double cantidad, String id){
        for(Figura fig:listaFiguras){
            if(fig.getCodigo().equals(id)){
                fig.subirPrecio(cantidad);
            }
        }
    }
    
    //metodo toString y similares
    @Override
    public String toString() {
        String cadena = "Coleccion " + nombreColeccion + "\n-------------------------\n";
        for(Figura fig:listaFiguras){
            cadena += fig +"\n";
        }
        
        return cadena;
    }
    
    public String conCapa(){
        String cadena = "Figura de superheroes con capa \n---------------------\n";
        for(Figura fig: listaFiguras){
            if(fig.getSuperheroe().isCapa()){
                cadena += fig + "\n";
            }
        }
        return cadena;
    }
    
    //otros metodos observadores
    public Figura masValioso(){
        double precioMayor = 0.0;
        Figura figMayor = null;
        for(Figura fig: listaFiguras){
            if (fig.getPrecio()>precioMayor){
                precioMayor =fig.getPrecio();
                figMayor = fig;
            }
        }
        return figMayor;
    }
    
    public double getValorColeccion(){
        double valor = 0;
        for(Figura fig:listaFiguras){
            valor += fig.getPrecio();
        }
        return valor;
    }
    
    public double getVolumenColeccion(){
        double volumen = 0;
        for (Figura fig: listaFiguras){
            volumen += fig.getDimension().getVolumen();
        }
        return volumen + 200;
    }
    
    
}
