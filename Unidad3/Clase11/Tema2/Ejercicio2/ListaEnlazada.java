package Unidad3.Clase11.Tema2.Ejercicio2;

public class ListaEnlazada {
    private class Nodo {
        int dato;
        Nodo siguiente;

        public Nodo(int dato) {
            this.dato = dato;
            this.siguiente = null;
        }
    }

    private Nodo inicio;
    private int cantidad;

    public ListaEnlazada() {
        inicio = null;
        cantidad = 0;
    }

    public void insertarInicio(int dato) {
        Nodo nuevo = new Nodo(dato);

        nuevo.siguiente = inicio;
        inicio = nuevo;

        cantidad++;
    }

    public void insertarFinal(int dato) {
        Nodo nuevo = new Nodo(dato);

        if (inicio == null) {
            inicio = nuevo;
        } else {
            Nodo actual = inicio;

            while (actual.siguiente != null) {
                actual = actual.siguiente;
            }
            actual.siguiente = nuevo;
        }
        cantidad++;
    }

    public boolean buscar(int valor) {
        Nodo actual = inicio;

        while (actual != null) {
            if (actual.dato == valor) {
                return true;
            }
            actual = actual.siguiente;
        }
        return false;
    }

    public int tamanio() {
        return cantidad;
    }

    public void mostrar() {
        Nodo actual = inicio;
        System.out.print("[");

        while (actual != null) {
            System.out.print(actual.dato);

            if (actual.siguiente != null) {
                System.out.print(", ");
            }

            actual = actual.siguiente;
        }

        System.out.print("]");
    }

    public int contarOcurrencias(int valor) {
        int contador = 0;
        Nodo actual = inicio;

        while (actual != null) {
            if (actual.dato == valor) {
                contador++;
            }
            actual = actual.siguiente;
        }

        return contador;
    }

    public void eliminarTodas(int valor) {
        while (inicio != null && inicio.dato == valor) {
            inicio = inicio.siguiente;
            cantidad--;
        }

        Nodo actual = inicio;
        while (actual != null && actual.siguiente != null) {
            if (actual.siguiente.dato == valor) {
                actual.siguiente = actual.siguiente.siguiente;
                cantidad--;
            } else {
                actual = actual.siguiente;
            }
        }
    }
}