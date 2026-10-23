package Unidad3.Clase15.Tema1.Ejercicio1;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        final int CANTIDAD = 50000;

        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();

        // Cargar los 50.000 enteros en ArrayList
        for (int i = 0; i < CANTIDAD; i++) {
            arrayList.add(i);
        }

        // Cargar los 50.000 enteros en LinkedList
        for (int i = 0; i < CANTIDAD; i++) {
            linkedList.add(i);
        }

        // Recorrer ArrayList por índice
        long inicioArrayList = System.nanoTime();

        long sumaArrayList = 0;

        for (int i = 0; i < arrayList.size(); i++) {
            sumaArrayList += arrayList.get(i);
        }

        long finArrayList = System.nanoTime();

        // Recorrer LinkedList por índice
        long inicioLinkedList = System.nanoTime();

        long sumaLinkedList = 0;

        for (int i = 0; i < linkedList.size(); i++) {
            sumaLinkedList += linkedList.get(i);
        }

        long finLinkedList = System.nanoTime();

        // Calcular tiempos
        long tiempoArrayList = finArrayList - inicioArrayList;
        long tiempoLinkedList = finLinkedList - inicioLinkedList;

        // Mostrar resultados
        System.out.println("Cantidad de elementos: " + CANTIDAD);

        System.out.println("\n--- ArrayList ---");
        System.out.println("Suma: " + sumaArrayList);
        System.out.println("Tiempo: " + tiempoArrayList + " ns");
        System.out.println("Tiempo: " + (tiempoArrayList / 1_000_000.0) + " ms");

        System.out.println("\n--- LinkedList ---");
        System.out.println("Suma: " + sumaLinkedList);
        System.out.println("Tiempo: " + tiempoLinkedList + " ns");
        System.out.println("Tiempo: " + (tiempoLinkedList / 1_000_000.0) + " ms");
    }
}