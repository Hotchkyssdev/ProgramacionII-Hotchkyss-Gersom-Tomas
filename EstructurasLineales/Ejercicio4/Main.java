package EstructurasLineales.Ejercicio4;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        ListaSimple lista = new ListaSimple();

        char caracter;

        for (int i = 0; i < 5; i++) {
            System.out.print("Ingrese el caracter " + (i + 1) + ": ");
            caracter = teclado.next().charAt(0);

            lista.insertarAlInicio(caracter);
        }

        System.out.println("Lista en orden inverso:");
        lista.mostrar();

        teclado.close();
    }
}