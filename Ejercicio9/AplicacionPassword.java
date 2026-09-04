package Ejercicio9;

import java.util.Scanner;

public class AplicacionPassword {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Indicar cantidad de contraseñas
        System.out.print("Ingrese la cantidad de contraseñas: ");
        int cantidad = scanner.nextInt();

        // Indicar longitud de las contraseñas
        System.out.print("Ingrese la longitud de las contraseñas: ");
        int longitud = scanner.nextInt();

        // Crear arrays
        Password[] passwords = new Password[cantidad];
        boolean[] fuertes = new boolean[cantidad];

        // Crear cada contraseña y comprobar si es fuerte
        for (int i = 0; i < passwords.length; i++) {

            passwords[i] = new Password(longitud);

            fuertes[i] = passwords[i].esFuerte();
        }

        // Mostrar resultados
        System.out.println("\nResultados:");

        for (int i = 0; i < passwords.length; i++) {

            System.out.println(
                    passwords[i].getContraseña()
                    + " "
                    + fuertes[i]
            );
        }

        scanner.close();
    }
}
