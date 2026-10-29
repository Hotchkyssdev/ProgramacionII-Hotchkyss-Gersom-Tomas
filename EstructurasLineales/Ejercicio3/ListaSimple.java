package EstructurasLineales.Ejercicio3;

public class ListaSimple {

    private class Nodo {
        String dato;
        Nodo siguiente;

        public Nodo(String dato) {
            this.dato = dato;
            this.siguiente = null;
        }
    }

    private Nodo primero;
    private Nodo ultimo;
    private int cantidad;

    public ListaSimple() {
        primero = null;
        ultimo = null;
        cantidad = 0;
    }

    public void insertar(String dato) {
        Nodo nuevo = new Nodo(dato);

        if (primero == null) {
            primero = nuevo;
            ultimo = nuevo;
        } else {
            ultimo.siguiente = nuevo;
            ultimo = nuevo;
        }

        cantidad++;
    }

    public String eliminarEnPosicion(int posicion) {
        if (posicion < 0 || posicion >= cantidad) {
            throw new IndexOutOfBoundsException(
                "Posicion fuera de rango: " + posicion
            );
        }

        String eliminado;

        if (posicion == 0) {
            eliminado = primero.dato;
            primero = primero.siguiente;

            if (primero == null) {
                ultimo = null;
            }
        } else {
            Nodo anterior = primero;

            for (int i = 0; i < posicion - 1; i++) {
                anterior = anterior.siguiente;
            }

            Nodo actual = anterior.siguiente;
            eliminado = actual.dato;
            anterior.siguiente = actual.siguiente;

            if (actual == ultimo) {
                ultimo = anterior;
            }
        }

        cantidad--;
        return eliminado;
    }

    public void mostrar() {
        if (primero == null) {
            System.out.println("Lista vacia.");
            return;
        }

        Nodo actual = primero;

        while (actual != null) {
            System.out.print(actual.dato);

            if (actual.siguiente != null) {
                System.out.print(" -> ");
            }

            actual = actual.siguiente;
        }

        System.out.println();
    }

    public int tamanio() {
        return cantidad;
    }
}