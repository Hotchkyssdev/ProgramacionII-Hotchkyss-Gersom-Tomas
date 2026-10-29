package EstructurasLineales.Ejercicio3;

public class ListaDoble {

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

    public ListaDoble() {
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
            nuevo.anterior = ultimo;
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

        if (actual.anterior != null) {
            actual.anterior.siguiente = actual.siguiente;
        } else {
            primero = actual.siguiente;
        }

        if (actual.siguiente != null) {
            actual.siguiente.anterior = actual.anterior;
        } else {
            ultimo = actual.anterior;
        }

        cantidad--;
        return actual.dato;
    }

    public void mostrarAdelante() {
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

    public void mostrarAtras() {
        Nodo actual = ultimo;

        while (actual != null) {
            System.out.print(actual.dato);

            if (actual.anterior != null) {
                System.out.print(" -> ");
            }

            actual = actual.anterior;
        }

        System.out.println();
    }

    public int tamanio() {
        return cantidad;
    }
}