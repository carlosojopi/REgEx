package Reserva;

public class Reserva {
		
	//Variables
    private String codigoReserva;
    private String nombrePasajero;
    private String destino;
    
    //Constructor
    public Reserva(String codigoReserva, String nombrePasajero, String destino) {
        this.codigoReserva = codigoReserva;
        this.nombrePasajero = nombrePasajero;
        this.destino = destino;
    }

    //getters and setters
    public String getCodigoReserva() {
        return codigoReserva;
    }

    public void setCodigoReserva(String codigoReserva) {
        this.codigoReserva = codigoReserva;
    }

    public String getNombrePasajero() {
        return nombrePasajero;
    }

    public void setNombrePasajero(String nombrePasajero) {
        this.nombrePasajero = nombrePasajero;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public void mostrarReserva() {
        System.out.println("Código de Reserva: " + codigoReserva);
        System.out.println("Nombre del Pasajero: " + nombrePasajero);
        System.out.println("Destino: " + destino);
    }
}
	
	
	
	
	
	
	
	
	
	
	
		
	

