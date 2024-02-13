package Reserva;

public class SistemaReservas {
    private Reserva[] reservas;

    public SistemaReservas(int tamanoArray) {
        this.reservas = new Reserva[tamanoArray];
    }

    public void realizarReserva(Reserva nuevaReserva) {
        for (int i = 0; i < reservas.length; i++) {
            if (reservas[i] == null) {
                reservas[i] = nuevaReserva;
                System.out.println("Reserva realizada correctamente.");
                return;
            }
        }
        System.out.println("No hay espacio disponible para más reservas.");
    }

    public void buscarReserva(String codigoReserva) {
        for (Reserva reserva : reservas) {
            if (reserva != null && reserva.getCodigoReserva().equals(codigoReserva)) {
                System.out.println("Reserva encontrada:");
                reserva.mostrarReserva();
                return;
            }
        }
        System.out.println("No se encontró ninguna reserva con ese código.");
    }

    public void cancelarReserva(String codigoReserva) {
        for (int i = 0; i < reservas.length; i++) {
            if (reservas[i] != null && reservas[i].getCodigoReserva().equals(codigoReserva)) {
                reservas[i] = null;
                System.out.println("Reserva cancelada correctamente.");
                return;
            }
        }
        System.out.println("No se encontró ninguna reserva con ese código.");
    }

    public void mostrarReservas() {
        System.out.println("Reservas existentes:");
        for (Reserva reserva : reservas) {
            if (reserva != null) {
                reserva.mostrarReserva();
                System.out.println("----------");
            }
        }
    } 
}
