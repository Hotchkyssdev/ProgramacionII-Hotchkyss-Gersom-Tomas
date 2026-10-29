package EstructurasLineales.Ejercicio5;

public class ColaDinamica {

    private class Nodo {
        int horaLlegada;
        Nodo siguiente;

        public Nodo(int horaLlegada) {
            this.horaLlegada = horaLlegada;
            this.siguiente = null;
        }
    }

    private Nodo primero;
    private Nodo ultimo;
    private int cantidad;

    public ColaDinamica() {
        primero = null;
        ultimo = null;
        cantidad = 0;
    }

    public void encolar(int horaLlegada) {
        Nodo nuevo = new Nodo(horaLlegada);

        if (primero == null) {
            primero = nuevo;
            ultimo = nuevo;
        } else {
            ultimo.siguiente = nuevo;
            ultimo = nuevo;
        }

        cantidad++;
    }

    public int desencolar() {
        if (estaVacia()) {
            throw new IllegalStateException("La cola está vacía");
        }

        int hora = primero.horaLlegada;
        primero = primero.siguiente;
        cantidad--;

        if (primero == null) {
            ultimo = null;
        }

        return hora;
    }

    public boolean estaVacia() {
        return primero == null;
    }

    public int tamanio() {
        return cantidad;
    }

    public int consultarPrimero() {
        if (estaVacia()) {
            throw new IllegalStateException("La cola está vacía");
        }

        return primero.horaLlegada;
    }
}