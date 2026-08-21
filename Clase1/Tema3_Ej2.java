import java.util.Scanner;

public class Tema3_Ej2 {
    public static boolean esPrimo(int n) {
        if (n < 0) {
            return false;
        }

        if (n < 2) {
            return false;
        }

        for(int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un numero entero: ");
        int numero = scanner.nextInt();

        if (numero < 0) {
            System.out.println("Error: el numero no puede ser negativo.");
        } else if (esPrimo(numero)) {
            System.out.println(numero + " es primo.");
        } else {
            System.out.println(numero + " no es primo.");
        } 

        scanner.close();
    }
}