package Unidad3.Clase14.Tema3.Ejercicio2;

public class PilaEnlazada {
    private class Nodo {
        int dato;
        Nodo siguiente;

        public Nodo(int dato) {
            this.dato = dato;
            this.siguiente = null;
        }
    }

    private Nodo tope;

    public PilaEnlazada() {
        tope = null;
    }

    // Apilar un elemento
    public void push(int valor) {
        Nodo nuevo = new Nodo(valor);
        nuevo.siguiente = tope;
        tope = nuevo;
    }

    // Desapilar y devolver el elemento superior
    public int pop() {
        if (estaVacia()) {
            throw new IllegalStateException("La pila está vacía.");
        }

        int valor = tope.dato;
        tope = tope.siguiente;

        return valor;
    }

    // Verificar si está vacía
    public boolean estaVacia() {
        return tope == null;
    }
}