package Unidad3.Clase15.Tema3.Ejercicio1;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        HashMap<Alumno, Double> hashMap = new HashMap<>();

        TreeMap<Alumno, Double> treeMap = new TreeMap<>(
            Comparator.comparing(
                Alumno::getNombre,
                String.CASE_INSENSITIVE_ORDER
            )
        );

        // Crear alumnos
        Alumno a1 = new Alumno("40111222", "Lucia", "Sistemas");
        Alumno a2 = new Alumno("40222333", "Bruno", "Programacion");
        Alumno a3 = new Alumno("40333444", "Ana", "Sistemas");
        Alumno a4 = new Alumno("40444555", "Carlos", "Programacion");
        Alumno a5 = new Alumno("40555666", "Marta", "Sistemas");

        // DNI repetido: mismo DNI que a1, pero distinto nombre y carrera
        Alumno a6 = new Alumno("40111222", "Zoe", "Programacion");

        // Cargar los mismos pares clave-valor en ambos mapas
        cargar(hashMap, a1, 8.5);
        cargar(hashMap, a2, 7.0);
        cargar(hashMap, a3, 9.0);
        cargar(hashMap, a4, 6.5);
        cargar(hashMap, a5, 8.0);
        cargar(hashMap, a6, 9.5);

        cargar(treeMap, a1, 8.5);
        cargar(treeMap, a2, 7.0);
        cargar(treeMap, a3, 9.0);
        cargar(treeMap, a4, 6.5);
        cargar(treeMap, a5, 8.0);
        cargar(treeMap, a6, 9.5);

        // Recorrer HashMap
        System.out.println("--- HashMap ---");

        for (Map.Entry<Alumno, Double> entrada : hashMap.entrySet()) {
            System.out.println(
                entrada.getKey() + " | Promedio: " + entrada.getValue()
            );
        }

        // Recorrer TreeMap
        System.out.println("\n--- TreeMap ---");

        for (Map.Entry<Alumno, Double> entrada : treeMap.entrySet()) {
            System.out.println(
                entrada.getKey() + " | Promedio: " + entrada.getValue()
            );
        }

        // Comparar cantidad de entradas
        System.out.println("\n--- Comparacion ---");
        System.out.println("Entradas en HashMap: " + hashMap.size());
        System.out.println("Entradas en TreeMap: " + treeMap.size());
    }

    public static void cargar(
            Map<Alumno, Double> mapa, Alumno alumno, double promedio) {

        mapa.put(alumno, promedio);
    }
}