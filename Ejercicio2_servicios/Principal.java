
package Ejercicio2_servicios;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        
        TrabajoPintura tp1 = new TrabajoPintura("Jose", LocalDate.of(2022, 9, 10), "Moda jess", 20, 4);
       
        //System.out.println(tp1.detalleServicio());
        
        RevisionAlarma Ral = new RevisionAlarma(LocalDate.of(2022, 9, 6), "institucion sagrado corazon", 20);
       
        //System.out.println(Ral.detalleServicio());
        
        TrabajoPintura tp2 = new TrabajoPintura("Fernanda", LocalDate.of(2023, 8, 23), "almacen santa maria", 10, 3);
        TrabajoPintura tp3 = new TrabajoPintura("leonela", LocalDate.of(2022, 10, 19), "restaurante punto verde", 150, 2.5);
        RevisionAlarma Ra2 = new RevisionAlarma(LocalDate.of(2022, 8, 7), "hotel las palmeras", 80);
        
        ArrayList<Servicio> trabajos = new ArrayList<>();
        trabajos.add(tp1);
        trabajos.add(Ral);
        trabajos.add(tp2);
        trabajos.add(tp3);
        trabajos.add(Ra2);
        
        double costeTotal = 0;
        double costeManoObra = 0;
        
        for(Servicio t:trabajos){
            costeTotal += t.costeTotal();
            costeManoObra += t.costeManoObra();
            
            System.out.println(t.detalleServicio()+"\n\n");
        }
        System.out.println("Coste total de todos los trabajos: " + costeTotal);
        System.out.println("Coste total de mano de obra: " + costeManoObra);
        
        
        
        
        //menu
        // arrayList - guarda los objetos de tipo pintura o revision alarma...
        Scanner entrada = new Scanner(System.in);
   
        System.out.println(
                """
                |   Menu de opciones   |
                |_______________________ |
                |1. Trabajo de pintura   |
                |2. Revision de alarma   |
                |3. Reporte              |
                |4. Salir                |
                |_______________________ |
                
                Elige la opcion que desea:
                """);
        
        int opcion = entrada.nextInt();
        switch (opcion) {
            case 1:
                {
                    System.out.print("Ingrese el nombre del cliente: ");
                    entrada.nextLine();
                    String cliente = entrada.nextLine();
                    System.out.print("Ingrese la superficie a pintar: ");
                    int superficie = entrada.nextInt();
                    System.out.print("Ingrese el precio de la pintura: ");
                    int precioPintura = entrada.nextInt();
                    TrabajoPintura obje1 = new TrabajoPintura("Pintura", LocalDate.now(), cliente, superficie, precioPintura);
                    trabajos.add(obje1);
                    System.out.println(obje1.detalleServicio());
                    break;
                }
            case 2:
                {
                    System.out.print("Ingrese el nombre del cliente: ");
                    entrada.nextLine();
                    String cliente = entrada.nextLine();
                    RevisionAlarma Ra3 = new RevisionAlarma(LocalDate.of(2022, 8, 7), "hotel las palmeras", 80);;
                    trabajos.add(Ra3);
                    System.out.println(Ra3.detalleServicio());
                    break;
                }
            case 3:
                System.out.println("Sistema cerrado");
                break;
            default:
                break;
        }
    }
    
}
