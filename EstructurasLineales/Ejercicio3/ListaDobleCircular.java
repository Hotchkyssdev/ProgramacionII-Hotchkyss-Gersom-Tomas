package EstructurasLineales.Ejercicio3;

public class ListaDobleCircular {
    private class Nodo {
        String dato;
        Nodo siguiente;
        Nodo anterior;

        public Nodo(String dato) {
            this.dato = dato;
            this.siguiente = null;
            this.anterior = null;
        }
    }

    private Nodo primero;
    private Nodo ultimo;
    private int cantidad;

    public ListaDobleCircular() {
        primero = null;
        ultimo = null;
        cantidad = 0;
    }

    public void insertar(String dato) {
        Nodo nuevo = new Nodo(dato);

        if (primero == null) {
            primero = nuevo;
            ultimo = nuevo;

            nuevo.siguiente = nuevo;
            nuevo.anterior = nuevo;
        } else {
            nuevo.anterior = ultimo;
            nuevo.siguiente = primero;

            ultimo.siguiente = nuevo;
            primero.anterior = nuevo;

            ultimo = nuevo;
        }

        cantidad++;
    }

    public String eliminarEnPosicion(int posicion) {
        if (posicion < 0 || posicion >= cantidad) {
            throw new IndexOutOfBoundsException(
                "Posición inválida: " + posicion
            );
        }

        Nodo actual;

        if (posicion < cantidad / 2) {
            actual = primero;

            for (int i = 0; i < posicion; i++) {
                actual = actual.siguiente;
            }
        } else {
            actual = ultimo;

            for (int i = cantidad - 1; i > posicion; i--) {
                actual = actual.anterior;
            }
        }

        if (cantidad == 1) {
            primero = null;
            ultimo = null;
        } else {
            actual.anterior.siguiente = actual.siguiente;
            actual.siguiente.anterior = actual.anterior;

            if (actual == primero) {
                primero = actual.siguiente;
            }

            if (actual == ultimo) {
                ultimo = actual.anterior;
            }
        }

        cantidad--;
        return actual.dato;
    }

    public void mostrarAdelante() {
        if (primero == null) {
            System.out.println("Lista vacía");
            return;
        }

        Nodo actual = primero;

        do {
            System.out.print(actual.dato);
            actual = actual.siguiente;

            if (actual != primero) {
                System.out.print(" -> ");
            }
        } while (actual != primero);

        System.out.println(" (circular)");
    }

    public void mostrarAtras() {
        if (ultimo == null) {
            System.out.println("Lista vacía");
            return;
        }

        Nodo actual = ultimo;

        do {
            System.out.print(actual.dato);
            actual = actual.anterior;

            if (actual != ultimo) {
                System.out.print(" -> ");
            }
        } while (actual != ultimo);

        System.out.println(" (circular)");
    }

    public int tamanio() {
        return cantidad;
    }
}