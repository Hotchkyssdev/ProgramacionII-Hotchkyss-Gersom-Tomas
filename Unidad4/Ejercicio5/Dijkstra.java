package Unidad4.Ejercicio5;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class Dijkstra {
    private List<List<int[]>> adyacencia; // cada arista: {vecino, peso}
    private int cantidadVertices;

    public Dijkstra(int cantidadVertices) {
        this.cantidadVertices = cantidadVertices;
        adyacencia = new ArrayList<>();
        for (int i = 0; i < cantidadVertices; i++) {
            adyacencia.add(new ArrayList<>());
        }
    }

    public void agregarArista(int origen, int destino, int peso) {
        adyacencia.get(origen).add(new int[]{destino, peso});
        adyacencia.get(destino).add(new int[]{origen, peso});
    }

    public int[] calcularDistancias(int origen) {
        int[] distancias = new int[cantidadVertices];
        java.util.Arrays.fill(distancias, Integer.MAX_VALUE);
        distancias[origen] = 0;

        // Cola de prioridad: siempre procesa primero el vértice con menor distancia acumulada
        PriorityQueue<int[]> cola = new PriorityQueue<>((a, b) -> a[1] - b[1]);
        cola.add(new int[]{origen, 0});
        boolean[] finalizado = new boolean[cantidadVertices];

        while (!cola.isEmpty()) {
            int[] actual = cola.poll();
            int vertice = actual[0];
            if (finalizado[vertice]) continue;
            finalizado[vertice] = true;

            for (int[] arista : adyacencia.get(vertice)) {
                int vecino = arista[0], peso = arista[1];
                if (distancias[vertice] + peso < distancias[vecino]) {
                    distancias[vecino] = distancias[vertice] + peso;
                    cola.add(new int[]{vecino, distancias[vecino]});
                }
            }
        }
        return distancias;
    }

    public static void main(String[] args) {
        Dijkstra grafo = new Dijkstra(5);
        grafo.agregarArista(0, 1, 4);
        grafo.agregarArista(0, 2, 1);
        grafo.agregarArista(2, 1, 2);
        grafo.agregarArista(1, 3, 1);
        grafo.agregarArista(2, 3, 5);
        grafo.agregarArista(3, 4, 3);

        int[] distancias = grafo.calcularDistancias(0);
        System.out.println(java.util.Arrays.toString(distancias)); // [0, 3, 1, 4, 7]
    }
}