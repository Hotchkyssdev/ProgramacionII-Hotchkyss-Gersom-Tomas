package Unidad3.Clase12.Tema3.Ejercicio1;

public class Main {
    public static void main(String[] args) {
        int n = 7;
        int k = 3;

        ListaCircular lista = new ListaCircular();

        for (int i = 1; i <= n; i++) {
            lista.insertarFinal(i);
        }

        System.out.println("Problema de Josephus");
        System.out.println("Personas: " + n);
        System.out.println("Posiciones para contar: " + k);
        System.out.println();

        lista.simularJosephus(k);
    }
}