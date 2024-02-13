package Reserva;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Tamaño de la lista de reserva
        System.out.print("Ingrese el tamaño del sistema de reservas: ");
        int tamanoSistema = scanner.nextInt();
        SistemaReservas sistemaReservas = new SistemaReservas(tamanoSistema);

        // Añadir Reservas
        for (int i = 0; i < tamanoSistema; i++) {
            System.out.println("Ingrese los detalles de la reserva " + (i + 1) + ":");
            System.out.print("Código de Reserva: ");
            String codigoReserva = scanner.next();
            System.out.print("Nombre del Pasajero: ");
            String nombrePasajero = scanner.next();
            System.out.print("Destino: ");
            String destino = scanner.next();

            sistemaReservas.realizarReserva(new Reserva(codigoReserva, nombrePasajero, destino));
        }

        // Buscar una reserva existente
        System.out.print("Ingrese el código de reserva a buscar: ");
        String codigoBuscar = scanner.next();
        sistemaReservas.buscarReserva(codigoBuscar);

        // Borrar una reserva existente
        System.out.print("Ingrese el código de reserva a cancelar: ");
        String codigoCancelar = scanner.next();
        sistemaReservas.cancelarReserva(codigoCancelar);

        // Mostrar todas las reservas existentes
        sistemaReservas.mostrarReservas();

        scanner.close();
    }
}