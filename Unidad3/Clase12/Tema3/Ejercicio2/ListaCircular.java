package Unidad3.Clase12.Tema3.Ejercicio2;

public class ListaCircular {
    private class Nodo {
        int dato;
        Nodo siguiente;

        public Nodo(int dato) {
            this.dato = dato;
            this.siguiente = null;
        }
    }

    private Nodo primero;
    private Nodo ultimo;
    private int cantidad;

    public ListaCircular() {
        primero = null;
        ultimo = null;
        cantidad = 0;
    }

    public void insertarFinal(int dato) {
        Nodo nuevo = new Nodo(dato); 

        if (primero == null) {
            primero = nuevo;
            ultimo = nuevo;
            nuevo.siguiente = primero;
        } else {
            ultimo.siguiente = nuevo;
            ultimo = nuevo;
            ultimo.siguiente = primero;
        }

        cantidad++;
    }

    public int simularJosephus(int k) {
        if (cantidad == 0) {
            throw new IllegalStateException("La lista esta vacia.");
        }

        if (k <= 0) {
            throw new IllegalArgumentException("k debe ser mayor que cero.");
        }

        Nodo actual = primero;
        Nodo anterior = ultimo;

        while (cantidad > 1) {
            for (int i = 1; i < k; i++) {
                anterior = actual;
                actual = actual.siguiente;
            }

            anterior.siguiente = actual.siguiente;

            if (actual == primero) {
                primero = actual.siguiente;
            }

            if (actual == ultimo) {
                ultimo = anterior;
            }

            ultimo.siguiente = primero;
            cantidad--;

            actual = anterior.siguiente;
        }

        return primero.dato;
    }
}