
package Ejercicio3_parking;

public class ParkingException extends Exception {
    
    //propiedades
    private final String mensaje;
    private final String matricula;
    
    //constructor
    public ParkingException(String mensaje, String matricula) {
        this.mensaje = mensaje;
        this.matricula = matricula;
    }

    //metodos
    public String getMensaje() {
        return mensaje;
    }

    public String getMatricula() {
        return matricula;
    }
}
