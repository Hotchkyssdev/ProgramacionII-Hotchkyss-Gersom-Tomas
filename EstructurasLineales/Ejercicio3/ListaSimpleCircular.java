package EstructurasLineales.Ejercicio3;

public class ListaSimpleCircular {

    private class Nodo {
        String dato;
        Nodo siguiente;

        public Nodo(String dato) {
            this.dato = dato;
            this.siguiente = null;
        }
    }

    private Nodo ultimo;
    private int cantidad;

    public ListaSimpleCircular() {
        ultimo = null;
        cantidad = 0;
    }

    public void insertar(String dato) {
        Nodo nuevo = new Nodo(dato);

        if (ultimo == null) {
            ultimo = nuevo;
            nuevo.siguiente = nuevo;
        } else {
            nuevo.siguiente = ultimo.siguiente;
            ultimo.siguiente = nuevo;
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

        Nodo eliminado;

        if (cantidad == 1) {
            eliminado = ultimo;
            ultimo = null;
        } else if (posicion == 0) {
            eliminado = ultimo.siguiente;
            ultimo.siguiente = eliminado.siguiente;
        } else {
            Nodo anterior = ultimo.siguiente;

            for (int i = 0; i < posicion - 1; i++) {
                anterior = anterior.siguiente;
            }

            eliminado = anterior.siguiente;
            anterior.siguiente = eliminado.siguiente;

            if (eliminado == ultimo) {
                ultimo = anterior;
            }
        }

        cantidad--;
        return eliminado.dato;
    }

    public void mostrar() {
        if (ultimo == null) {
            System.out.println("Lista vacía");
            return;
        }

        Nodo actual = ultimo.siguiente;

        do {
            System.out.print(actual.dato);
            actual = actual.siguiente;

            if (actual != ultimo.siguiente) {
                System.out.print(" -> ");
            }
        } while (actual != ultimo.siguiente);

        System.out.println(" (circular)");
    }

    public int tamanio() {
        return cantidad;
    }
}