package EstructurasLineales.Ejercicio1;

public class ListaSimpleCircular {
    private class Nodo {
        int dato;
        Nodo siguiente;

        public Nodo(int dato) {
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
    
    public void insertar(int dato) {
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

    public boolean eliminar(int dato) {
        if (ultimo == null) {
            return false;
        }

        Nodo anterior = ultimo;
        Nodo actual = ultimo.siguiente;

        do {
            if (actual.dato == dato) {
                if (actual == anterior) {
                    ultimo = null;
                } else {
                    anterior.siguiente = actual.siguiente;

                    if (actual == ultimo) {
                        ultimo = anterior;
                    }
                }

                cantidad--;
                return true;
            }

            anterior = actual;
            actual = actual.siguiente;
        } while (actual != ultimo.siguiente);

        return false;
    }

    public boolean buscar(int dato) {
        if (ultimo == null) {
            return false;
        }

        Nodo actual = ultimo.siguiente;

        do {
            if (actual.dato == dato) {
                return true;
            }

            actual = actual.siguiente;
        } while (actual != ultimo.siguiente);

        return false;
    }

    public boolean estaVacia() {
        return ultimo == null;
    }

    public int tamanio() {
        return cantidad;
    }

    public void mostrar() {
        if (ultimo == null) {
            System.out.println("Lista vacia.");
            return;
        }

        Nodo actual = ultimo.siguiente;

        do {
            System.out.print(actual.dato + " -> ");
            actual = actual.siguiente;
        } while (actual != ultimo.siguiente);

        System.out.println("(vuelve al inicio)");
    }
}