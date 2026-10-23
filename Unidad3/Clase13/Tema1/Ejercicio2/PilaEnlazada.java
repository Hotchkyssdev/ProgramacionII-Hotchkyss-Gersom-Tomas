package Unidad3.Clase13.Tema1.Ejercicio2;

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
    private int cantidad;

    public PilaEnlazada() {
        tope = null;
        cantidad = 0;
    }

    // Apilar un elemento
    public void push(int valor) {
        Nodo nuevo = new Nodo(valor);

        nuevo.siguiente = tope;
        tope = nuevo;

        cantidad++;
    }

    // Desapilar y devolver el elemento superior
    public int pop() {
        if (estaVacia()) {
            throw new IllegalStateException(
                "No se puede desapilar: la pila está vacía."
            );
        }

        int valor = tope.dato;
        tope = tope.siguiente;

        cantidad--;

        return valor;
    }

    // Consultar el elemento superior sin eliminarlo
    public int peek() {
        if (estaVacia()) {
            throw new IllegalStateException(
                "No se puede consultar: la pila está vacía."
            );
        }

        return tope.dato;
    }

    // Verificar si está vacía
    public boolean estaVacia() {
        return tope == null;
    }

    // Obtener la cantidad de elementos
    public int tamanio() {
        return cantidad;
    }

    // Crear una copia independiente de la pila
    public PilaEnlazada clonar() {
        PilaEnlazada copia = new PilaEnlazada();
        PilaEnlazada auxiliar = new PilaEnlazada();

        // Pasar los elementos a una pila auxiliar
        Nodo actual = tope;

        while (actual != null) {
            auxiliar.push(actual.dato);
            actual = actual.siguiente;
        }

        // Pasarlos a la copia para recuperar el orden original
        while (!auxiliar.estaVacia()) {
            copia.push(auxiliar.pop());
        }

        return copia;
    }
}