package Unidad3.Clase14.Tema2.Ejercicio1;

public class ColaClientes {
    private class Nodo {
        Cliente dato;
        Nodo siguiente;

        public Nodo(Cliente dato) {
            this.dato = dato;
            this.siguiente = null;
        }
    }

    private Nodo frente;
    private Nodo fin;

    public ColaClientes() {
        frente = null;
        fin = null;
    }

    public boolean estaVacia() {
        return frente == null;
    }

    public void encolar(Cliente cliente) {
        Nodo nuevo = new Nodo(cliente);

        if (estaVacia()) {
            frente = nuevo;
            fin = nuevo;
        } else {
            fin.siguiente = nuevo;
            fin = nuevo;
        }
    }

    public Cliente desencolar() {
        if (estaVacia()) {
            throw new IllegalStateException("La cola está vacía.");
        }

        Cliente cliente = frente.dato;
        frente = frente.siguiente;

        if (frente == null) {
            fin = null;
        }

        return cliente;
    }
}