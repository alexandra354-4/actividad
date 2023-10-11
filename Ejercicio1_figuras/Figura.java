
package Ejercicio1_figuras;

public class Figura {
    
    //Propiedades
    private String codigo;
    private double precio;
    private Superheroe superheroe;
    private Dimension dimension;
    
    //constructor
    public Figura(String codigo, double precio, Superheroe superheroe, Dimension dimension){
        this.codigo=codigo;
        this.precio=precio;
        this.superheroe=superheroe;
        this.dimension=dimension;   
    }
    
    //getters y setters
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Superheroe getSuperheroe() {
        return superheroe;
    }

    public void setSuperheroe(Superheroe superheroe) {
        this.superheroe = superheroe;
    }

    public Dimension getDimension() {
        return dimension;
    }

    public void setDimension(Dimension dimension) {
        this.dimension = dimension;
    }
    
    //método toString
    @Override
    public String toString() {
        return "Datos de la Figura\n codigo = " + codigo + " Precio = " + precio + 
                " \n Datos del Superheroe = " + superheroe.getNombre() + " Descripcion = "+
                superheroe.getDescripcion() + "capa = " + superheroe.isCapa()
                + "\n Dimensión del la figura = " + " Altura = " + dimension.getAlto()
                + " Ancho = " + dimension.getAncho() + " Profundidad = " 
                + dimension.getProfundidad();          
    }
    
    //método modificador adicional
    public void subirPrecio(double altaPrecio){
        this.precio += altaPrecio;
    }
    
    
}
