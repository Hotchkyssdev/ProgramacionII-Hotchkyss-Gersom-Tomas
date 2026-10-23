package Unidad3.Clase12.Tema3.Ejercicio2;

public class Main {
    public static void main(String[] args) {
        int n = 6;
        int ganadorBuscado = 1;

        System.out.println("Problema de Josephus");
        System.out.println("Cantidad de personas: " + n);
        System.out.println("Buscando valores k cuyo ganador sea la persona 1:");
        System.out.println();
        System.out.print("Valores de k encontrados: ");

        for (int k = 1; k <= n; k++) {
            ListaCircular lista = new ListaCircular();

            for (int i = 1; i <= n; i++) {
                lista.insertarFinal(i);
            }

            int ganador = lista.simularJosephus(k);

            System.out.println("k = " + k + " -> Ganador: " + ganador);
        }

        System.out.println();
        System.out.print("Valores de k para los que gana la persona 1: ");

        for (int k = 1; k <= n; k++) {
            ListaCircular lista = new ListaCircular();

            for (int i = 1; i <= n; i++) {
                lista.insertarFinal(i);
            }

            if (lista.simularJosephus(k) == ganadorBuscado) {
                System.out.print(k + " ");
            }
        }

        System.out.println();
    }
}