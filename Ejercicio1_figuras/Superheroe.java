
package Ejercicio1_figuras;

public class Superheroe {
    
    //atributos
    private String nombre;
    private String descripcion;
    private boolean capa;
    
    //constructor por defecto
    public Superheroe(){
        
    }
    
    //constructor con parametros
    public Superheroe(String nombre){
        this.nombre=nombre;
        this.descripcion="";
        this.capa=false;
        
    }
    
    //los getters setters
    
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public String getDescripcion(){
        return descripcion;
    }
    public void setDescripcion(String descripcion){
        this.descripcion=descripcion;
    }
    public boolean isCapa(){
        return capa;
    }
    public void setCapa(boolean capa){
        this.capa=capa;
        
    }
   
    //metodo toString
    @Override
    public String toString (){
        return "Superheroe: " + "nombre=" + nombre + ", descripcion=" + descripcion + ", capa=" + capa ;
    }

    
    
    
    
    
}
