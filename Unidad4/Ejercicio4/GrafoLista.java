package Unidad4.Ejercicio4;

import java.util.ArrayList;
import java.util.List;
import java.util.LinkedList;
import java.util.Queue;

public class GrafoLista {
    private List<List<Integer>> adyacencia;
    private int cantidadVertices;

    public GrafoLista(int cantidadVertices) {
        this.cantidadVertices = cantidadVertices;
        adyacencia = new ArrayList<>();
        for (int i = 0; i < cantidadVertices; i++) {
            adyacencia.add(new ArrayList<>());
        }
    }

    public void agregarArista(int origen, int destino) {
        adyacencia.get(origen).add(destino);
        adyacencia.get(destino).add(origen); // grafo no dirigido: la conexión va en los dos sentidos
    }

    public List<Integer> vecinosDe(int vertice) { 
        return adyacencia.get(vertice); 
    }

    public void mostrar() {
        for (int i = 0; i < cantidadVertices; i++) {
            System.out.println(i + ": " + adyacencia.get(i));
        }
    }

    // BFS: distancia mínima en cantidad de aristas desde el origen a cada vértice
    public int[] bfs(int origen) {
        int[] distancias = new int[cantidadVertices];
        java.util.Arrays.fill(distancias, -1); // -1 = todavía no visitado
        distancias[origen] = 0;

        Queue<Integer> cola = new LinkedList<>();
        cola.add(origen);

        while (!cola.isEmpty()) {
            int actual = cola.poll();
            for (int vecino : adyacencia.get(actual)) {
                if (distancias[vecino] == -1) { // no visitado
                    distancias[vecino] = distancias[actual] + 1;
                    cola.add(vecino);
                }
            }
        }
        return distancias;
    }

    // DFS: recorrido en profundidad, recursivo (misma lógica que los recorridos del Paso 1)
    public void dfs(int origen) {
        boolean[] visitado = new boolean[cantidadVertices];
        dfs(origen, visitado);
        System.out.println();
    }

    private void dfs(int actual, boolean[] visitado) {
        visitado[actual] = true;
        System.out.print(actual + " ");
        for (int vecino : adyacencia.get(actual)) {
            if (!visitado[vecino]) dfs(vecino, visitado); // caso recursivo
        }
        // caso base implícito: cuando todos los vecinos ya están visitados, el método retorna
    }

    public static void main(String[] args) {
        GrafoLista grafo = new GrafoLista(5);
        grafo.agregarArista(0, 1);
        grafo.agregarArista(0, 2);
        grafo.agregarArista(1, 3);
        grafo.agregarArista(2, 4);
        grafo.mostrar();
    }
}