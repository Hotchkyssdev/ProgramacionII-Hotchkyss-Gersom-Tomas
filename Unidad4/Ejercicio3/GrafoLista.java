package Unidad4.Ejercicio3;

import java.util.ArrayList;
import java.util.List;

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

    public static void main(String[] args) {
        GrafoLista grafo = new GrafoLista(5);
        grafo.agregarArista(0, 1);
        grafo.agregarArista(0, 2);
        grafo.agregarArista(1, 3);
        grafo.agregarArista(2, 4);
        grafo.mostrar();
    }
}