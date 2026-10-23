package Unidad3.Clase14.Tema1.Ejercicio2;

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
    private int cantidad;

    public ColaEnlazada() {
        frente = null;
        fin = null;
        cantidad = 0;
    }

    // Agregar un elemento al final de la cola
    public void encolar(int valor) {
        Nodo nuevo = new Nodo(valor);

        if (estaVacia()) {
            frente = nuevo;
            fin = nuevo;
        } else {
            fin.siguiente = nuevo;
            fin = nuevo;
        }

        cantidad++;
    }

    // Quitar y devolver el primer elemento
    public int desencolar() {
        if (estaVacia()) {
            throw new IllegalStateException(
                "No se puede desencolar: la cola está vacía."
            );
        }

        int valor = frente.dato;
        frente = frente.siguiente;
        cantidad--;

        // Si se eliminó el último nodo, actualizar también fin
        if (frente == null) {
            fin = null;
        }

        return valor;
    }

    // Consultar el primer elemento sin eliminarlo
    public int frente() {
        if (estaVacia()) {
            throw new IllegalStateException(
                "No se puede consultar: la cola está vacía."
            );
        }

        return frente.dato;
    }

    // Verificar si la cola está vacía
    public boolean estaVacia() {
        return cantidad == 0;
    }

    // Obtener la cantidad de elementos
    public int tamanio() {
        return cantidad;
    }

    // Eliminar todos los elementos y devolver cuántos había
    public int vaciar() {
        int elementosEliminados = cantidad;

        while (!estaVacia()) {
            desencolar();
        }

        return elementosEliminados;
    }
}