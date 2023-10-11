
package Ejercicio1_figuras;

public class Principal {

    public static void main(String[] args) {
        
        //prueba clase superheroe.
        Superheroe super1 = new Superheroe("Spider-Man ");
        Superheroe super2 = new Superheroe("Batman ");
        Superheroe super3 = new Superheroe("SuperMan ");
        
        super1.setDescripcion("El hombre araña ");
        super2.setDescripcion("El hombre murcielago ");
        super3.setDescripcion("El hombre de acero ");
        
        super2.setCapa(true);
        super3.setCapa(true);
        
        System.out.println(super1);
        System.out.println(super2);
        System.out.println(super3);
        
        
        //prueba clase dimension
        Dimension dimPequeña = new Dimension();
        Dimension dimGrande = new Dimension(2.5, 2.8, 0.6);
        
        System.out.println(dimPequeña);
        System.out.println(dimGrande);
        
        System.out.println("El volumen total es: " + dimGrande.getVolumen() + " Cm3");
        
        //prueba clase figura
        System.out.println("\n");
        Figura fig1 = new Figura("10ABC", 40000, super2, dimGrande);
        Figura fig2 = new Figura("20ABCD", 89600, super1, dimGrande);
        
        System.out.println(fig1);
        System.out.println("\n");
        System.out.println(fig2);
        
        
        fig1.subirPrecio(20000);
        fig2.subirPrecio(15000);
        
        System.out.println(fig1);
        System.out.println("\n");
        System.out.println(fig2);
        System.out.println("\n");
  
        
        
        //instanciar objeto de tipo coleccion
        Coleccion col1 = new Coleccion("Marvel");
        
        System.out.println(col1);
        
        System.out.println("la cantidad de elementos en el array es: " + " " + col1.getListaFiguras().size());
        
        col1.getListaFiguras().add(fig1);
        col1.getListaFiguras().add(fig2);
        
        System.out.println(col1);
        
        System.out.println("la cantidad de elementos en el array es: " + " " + col1.getListaFiguras().size());
        
        //recorrer el arraylist
        System.out.println("\n");
        
        col1.subirPrecio(0, "1");
      
        
        System.out.println(col1.conCapa());
        
        Figura figMasValiosa = col1.masValioso();
        System.out.println("figra de más valor: " + figMasValiosa);
        
        System.out.println("Valor de la coleccion: " + col1.getValorColeccion());
        
        System.out.println("volumen de la coleccion: "+col1.getVolumenColeccion());
        
        
    }
    
}
