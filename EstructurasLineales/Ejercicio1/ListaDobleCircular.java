package EstructurasLineales.Ejercicio1;

public class ListaDobleCircular {
    private class Nodo {
        int dato;
        Nodo siguiente;
        Nodo anterior;

        public Nodo(int dato) {
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

    public void insertar(int dato) {
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

    public boolean eliminar(int dato) {
        if (primero == null) {
            return false;
        }

        Nodo actual = primero;

        do {
            if (actual.dato == dato) {
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
                return true;
            }
            actual = actual.siguiente;
        } while (actual != primero);

        return false;
    }

    public boolean buscar(int dato) {
        if (primero == null) {
            return false;
        }

        Nodo actual = primero;

        do {
            if (actual.dato == dato) {
                return true;
            }

            actual = actual.siguiente;
        } while (actual != primero);

        return false;
    }

    public boolean estaVacia() {
        return primero == null;
    }

    public int tamanio() {
        return cantidad;
    }

    public void mostrarAdelante() {
        if (primero == null) {
            System.out.println("Lista vacia.");
            return;
        }

        Nodo actual = primero;

        do {
            System.out.print(actual.dato + " <-> ");
            actual = actual.siguiente;
        } while (actual != primero);

        System.out.println("(vuelve al inicio)");
    }

    public void mostrarAtras() {
        if (ultimo == null) {
            System.out.println("Lista vacia.");
            return;
        }

        Nodo actual = ultimo;

        do {
            System.out.print(actual.dato + " <-> ");
            actual = actual.anterior;
        } while (actual != ultimo);

        System.out.println("(vuelve al final)");
    }
}