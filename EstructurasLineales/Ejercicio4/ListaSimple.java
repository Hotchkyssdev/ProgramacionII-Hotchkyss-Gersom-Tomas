package EstructurasLineales.Ejercicio4;

public class ListaSimple {

    private class Nodo {
        char dato;
        Nodo siguiente;

        public Nodo(char dato) {
            this.dato = dato;
            this.siguiente = null;
        }
    }

    private Nodo primero;

    public ListaSimple() {
        primero = null;
    }

    public void insertarAlInicio(char dato) {
        Nodo nuevo = new Nodo(dato);

        nuevo.siguiente = primero;
        primero = nuevo;
    }

    public void mostrar() {
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
}