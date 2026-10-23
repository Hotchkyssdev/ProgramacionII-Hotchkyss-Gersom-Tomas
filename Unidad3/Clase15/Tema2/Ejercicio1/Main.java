package Unidad3.Clase15.Tema2.Ejercicio1;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        // Primera prueba: eliminación incorrecta
        ArrayList<Integer> lista = new ArrayList<>();

        for (int i = 1; i <= 10; i++) {
            lista.add(i);
        }
        
        System.out.println("Lista original: " + lista);

        System.out.println("\n--- Intento con for-each ---");

        try {
            for (Integer numero : lista) {
                if (numero % 2 == 0) {
                    lista.remove(numero);
                }
            }

            System.out.println("Lista resultante: " + lista);

        } catch (java.util.ConcurrentModificationException e) {
            System.out.println("Se produjo ConcurrentModificationException.");
            System.out.println("No se debe modificar directamente la lista");
            System.out.println("mientras se la recorre con for-each.");
        }

        // Segunda prueba: solución correcta con Iterator
        lista.clear();

        for (int i = 1; i <= 10; i++) {
            lista.add(i);
        }

        System.out.println("\n--- Solución con Iterator ---");

        Iterator<Integer> iterador = lista.iterator();

        while (iterador.hasNext()) {
            Integer numero = iterador.next();

            if (numero % 2 == 0) {
                iterador.remove();
            }
        }

        System.out.println("Lista sin números pares: " + lista);
    }
}