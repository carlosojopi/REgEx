package laberinto;

import java.util.Scanner;

import Laberinto.Config;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Session session = new Session();

        System.out.println(Config.WELCOME);

        while (true) {
            if (!session.isLogged()) {
                System.out.println(Config.UNLOGGED_MENU);
                int option = scanner.nextInt();

                switch (option) {
                case 1:
                    // ...
                    break;
                case 2:
                    System.out.println("Registro de nuevo usuario:");
                    System.out.print("Ingrese nombre de usuario: ");
                    String signupUsername = scanner.next();
                    System.out.print("Ingrese contraseña: ");
                    String signupPassword = scanner.next();
                    System.out.print("Ingrese nombre completo: ");
                    String signupName = scanner.next();
                    System.out.print("Ingrese NIF: ");
                    String signupNif = scanner.next();
                    System.out.print("Ingrese email: ");
                    String signupEmail = scanner.next();
                    System.out.print("Ingrese dirección: ");
                    String signupAddress = scanner.next();
                    System.out.print("Ingrese fecha de nacimiento (dd/MM/yyyy): ");
                    String signupBirthdate = scanner.next();

                    if (session.signup(signupUsername, signupPassword, signupName, signupNif, signupEmail, signupAddress, signupBirthdate)) {
                        // Puedes agregar lógica adicional después de un registro exitoso si es necesario
                    }
                    break;
                case 0:
                        System.out.println(Config.GOODBYE);
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Opción no válida. Inténtalo de nuevo.");
                }
            } else {
                // ...
            }
        }
    }

}