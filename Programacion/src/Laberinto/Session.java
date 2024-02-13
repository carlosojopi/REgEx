package Laberinto;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Session {
    private User user;
    private boolean logged;
    private static final String FILE_PATH = "ruta/del/fichero";  // Reemplaza con la ruta correcta
    private static final String USERS_FILE = "usuarios.txt";  // Reemplaza con el nombre correcto del fichero

    public Session() {
        this.logged = false;
    }

    public boolean login(String enteredUsername, String enteredPassword) {
        // Lógica para verificar el inicio de sesión y cargar información del usuario
        // Devuelve true si el inicio de sesión es exitoso, false si no
    }

    public boolean signup(String username, String password, String name, String nif, String email, String address, String birthdate) {
        // Lógica para registrar un nuevo usuario
        // Devuelve true si el registro es exitoso, false si no
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

    private boolean checkIfUsernameExists(String usernameToCheck) {
        // Lógica para verificar si el nombre de usuario ya existe
        return false;  // Placeholder
    }
}
