package Unidad3.Clase13.Tema2.Ejercicio2;

public class PilaOperadores {
    private class Nodo {
        char dato;
        Nodo siguiente;

        public Nodo(char dato) {
            this.dato = dato;
            this.siguiente = null;
        }
    }

    private Nodo tope;

    public PilaOperadores() {
        tope = null;
    }

    public void push(char valor) {
        Nodo nuevo = new Nodo(valor);
        nuevo.siguiente = tope;
        tope = nuevo;
    }

    public char pop() {
        if (estaVacia()) {
            throw new IllegalStateException("La pila está vacía.");
        }

        char valor = tope.dato;
        tope = tope.siguiente;

        return valor;
    }

    public char peek() {
        if (estaVacia()) {
            throw new IllegalStateException("La pila está vacía.");
        }

        return tope.dato;
    }

    public boolean estaVacia() {
        return tope == null;
    }
}
