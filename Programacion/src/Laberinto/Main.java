package Laberinto;

import java.util.Scanner;

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
                        System.out.print("Ingrese nombre de usuario: ");
                        String loginUsername = scanner.next();
                        System.out.print("Ingrese contraseña: ");
                        String loginPassword = scanner.next();
                        if (session.login(loginUsername, loginPassword)) {
                            System.out.println("Inicio de sesión exitoso.");
                        } else {
                            System.out.println("Nombre de usuario y/o contraseña incorrectos. Inténtalo de nuevo.");
                        }
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
                        

                        if (session.signup(signupUsername, signupPassword, signupName, signupNif, signupEmail, signupAddress)) {
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
                System.out.println(Config.LOGGED_MENU);
                int option = scanner.nextInt();

                switch (option) {
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                        System.out.println("Próximamente");
                        break;
                    case 5:
                        session.showUser();
                        break;
                    case 6:
                        session.logout();
                        break;
                    case 0:
                        System.out.println(Config.GOODBYE);
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Opción no válida. Inténtalo de nuevo.");
                }
            }
        }
    }
}
