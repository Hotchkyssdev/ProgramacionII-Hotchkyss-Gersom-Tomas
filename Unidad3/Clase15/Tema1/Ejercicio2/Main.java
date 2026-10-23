package Unidad3.Clase15.Tema1.Ejercicio2;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        final int CANTIDAD = 50000;

        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();

        // Cargar las listas
        for (int i = 0; i < CANTIDAD; i++) {
            arrayList.add(i);
            linkedList.add(i);
        }

        long sumaArrayIndice = 0;
        long sumaArrayIterator = 0;
        long sumaLinkedIndice = 0;
        long sumaLinkedIterator = 0;

        // 1. ArrayList con acceso por índice
        long inicio = System.nanoTime();

        for (int i = 0; i < arrayList.size(); i++) {
            sumaArrayIndice += arrayList.get(i);
        }

        long tiempoArrayIndice = System.nanoTime() - inicio;

        // 2. ArrayList con for-each
        inicio = System.nanoTime();

        for (int valor : arrayList) {
            sumaArrayIterator += valor;
        }

        long tiempoArrayIterator = System.nanoTime() - inicio;

        // 3. LinkedList con acceso por índice
        inicio = System.nanoTime();

        for (int i = 0; i < linkedList.size(); i++) {
            sumaLinkedIndice += linkedList.get(i);
        }

        long tiempoLinkedIndice = System.nanoTime() - inicio;

        // 4. LinkedList con for-each
        inicio = System.nanoTime();

        for (int valor : linkedList) {
            sumaLinkedIterator += valor;
        }

        long tiempoLinkedIterator = System.nanoTime() - inicio;

        // Mostrar resultados
        System.out.println("Cantidad de elementos: " + CANTIDAD);

        System.out.println("\n--- Tiempos de recorrido ---");

        mostrarTiempo("ArrayList con índice", tiempoArrayIndice);
        mostrarTiempo("ArrayList con for-each", tiempoArrayIterator);
        mostrarTiempo("LinkedList con índice", tiempoLinkedIndice);
        mostrarTiempo("LinkedList con for-each", tiempoLinkedIterator);

        System.out.println("\n--- Verificación de resultados ---");

        System.out.println("ArrayList con índice: " + sumaArrayIndice);
        System.out.println("ArrayList con for-each: " + sumaArrayIterator);
        System.out.println("LinkedList con índice: " + sumaLinkedIndice);
        System.out.println("LinkedList con for-each: " + sumaLinkedIterator);
    }

    public static void mostrarTiempo(String descripcion, long nanosegundos) {
        System.out.println(
            descripcion + ": " + nanosegundos + " ns (" +
            (nanosegundos / 1_000_000.0) + " ms)"
        );
    }
}