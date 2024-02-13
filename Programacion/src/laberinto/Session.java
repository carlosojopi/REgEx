package laberinto;

import java.time.LocalDate;

public class Session {
    private User user;
    private boolean logged;

    public Session() {
        this.logged = false;
    }

    public boolean isLogged() {
        return logged;
    }

    public void showUser() {
        // Muestra la información del usuario actual
    }

    public void logout() {
        System.out.println("Cerrando sesión...");
        this.logged = false;
        this.user = null;
        System.out.println("Sesión cerrada. Volviendo al menú principal.");
    }
}
