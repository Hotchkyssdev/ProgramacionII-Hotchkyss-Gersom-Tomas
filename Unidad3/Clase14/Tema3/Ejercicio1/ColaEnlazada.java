package Unidad3.Clase14.Tema3.Ejercicio1;

public class ColaEnlazada {
    private class Nodo {
        int dato;
        Nodo siguiente;

        public Nodo(int dato) {
            this.dato = dato;
            this.siguiente = null;
        }
    }

    private Nodo frente;
    private Nodo fin;

    public ColaEnlazada() {
        frente = null;
        fin = null;
    }

    public void encolar(int valor) {
        Nodo nuevo = new Nodo(valor);

        if (estaVacia()) {
            frente = nuevo;
            fin = nuevo;
        } else {
            fin.siguiente = nuevo;
            fin = nuevo;
        }
    }

    public int desencolar() {
        if (estaVacia()) {
            throw new IllegalStateException("La cola está vacía.");
        }

        int valor = frente.dato;
        frente = frente.siguiente;

        if (frente == null) {
            fin = null;
        }

        return valor;
    }

    public boolean estaVacia() {
        return frente == null;
    }
}