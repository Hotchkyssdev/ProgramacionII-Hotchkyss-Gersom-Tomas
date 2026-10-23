package Unidad3.Clase12.Tema1.Ejercicio1;

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

    public ListaCircular() {
        primero = null;
        ultimo = null;
    }

    public void insertarFinal(int dato) {
        Nodo nuevo = new Nodo(dato);

        if (primero == null) {
            primero = nuevo;
            ultimo = nuevo;

            ultimo.siguiente = primero;
        } else {
            ultimo.siguiente = nuevo;
            ultimo = nuevo;

            ultimo.siguiente = primero;
        }
    }

    public void mostrar(int vueltas) {
        if (vueltas < 0) {
            throw new IllegalArgumentException("La cantidad de vueltas no puede ser negativa");
        }

        if (primero == null) {
            System.out.println("La lista esta vacia.");
            return;
        }

        Nodo actual = primero;
        for (int i = 0; i < vueltas; i++) {
            do {
                System.out.print(actual.dato + " ");
                actual = actual.siguiente;
            } while (actual != primero);

            System.out.println();
        }
    }
}