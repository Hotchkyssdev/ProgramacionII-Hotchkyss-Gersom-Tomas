package Unidad3.Clase14.Tema1.Ejercicio1;

public class ColaCircular {
    private int[] datos;
    private int frente;
    private int fin;
    private int cantidad;

    public ColaCircular(int capacidad) {
        if (capacidad <= 0) {
            throw new IllegalArgumentException(
                "La capacidad debe ser mayor que cero."
            );
        }

        datos = new int[capacidad];
        frente = 0;
        fin = 0;
        cantidad = 0;
    }

    // Agregar un elemento al final de la cola
    public void encolar(int valor) {
        if (estaLlena()) {
            throw new IllegalStateException(
                "No se puede encolar: la cola está llena."
            );
        }

        datos[fin] = valor;
        fin = (fin + 1) % datos.length;
        cantidad++;
    }

    // Quitar y devolver el primer elemento
    public int desencolar() {
        if (estaVacia()) {
            throw new IllegalStateException(
                "No se puede desencolar: la cola está vacía."
            );
        }

        int valor = datos[frente];
        frente = (frente + 1) % datos.length;
        cantidad--;

        return valor;
    }

    // Consultar el primer elemento sin quitarlo
    public int frente() {
        if (estaVacia()) {
            throw new IllegalStateException(
                "No se puede consultar: la cola está vacía."
            );
        }

        return datos[frente];
    }

    // Verificar si la cola está vacía
    public boolean estaVacia() {
        return cantidad == 0;
    }

    // Verificar si la cola está llena
    public boolean estaLlena() {
        return cantidad == datos.length;
    }
}