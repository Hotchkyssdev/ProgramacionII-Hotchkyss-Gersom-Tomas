package Unidad3.Clase12.Tema2.Ejercicio1;

public class ListaDoble {
    private class Nodo {
        int dato;
        Nodo anterior;
        Nodo siguiente;

        public Nodo(int dato) {
            this.dato = dato;
            this.anterior = null;
            this.siguiente = null;
        }
    }
    
    private Nodo primero;
    private Nodo ultimo;

    public ListaDoble() {
        primero = null;
        ultimo = null;
    }

    public void insertarInicio(int dato) {
        Nodo nuevo = new Nodo(dato);

        if (primero == null) {
            primero = nuevo;
            ultimo = nuevo;
        } else {
            nuevo.siguiente = primero;
            primero.anterior = nuevo;
            primero = nuevo;
        }
    }

    public void insertarFinal(int dato) {
        Nodo nuevo = new Nodo(dato);

        if (ultimo == null) {
            primero = nuevo;
            ultimo = nuevo;
        } else {
            nuevo.anterior = ultimo;
            ultimo.siguiente = nuevo;
            ultimo = nuevo;
        }
    }

    public void mostrarAdelante() {
        Nodo actual = primero; 

        System.out.println("Adelante: ");

        while (actual != null) {
            System.out.print(actual.dato + " ");
            actual = actual.siguiente;
        }

        System.out.println();
    }

    public void mostrarAtras() {
        Nodo actual = ultimo;

        System.out.println("Atras: ");

        while (actual != null) {
            System.out.print(actual.dato + " ");
            actual = actual.anterior;
        }

        System.out.println();
    }
}