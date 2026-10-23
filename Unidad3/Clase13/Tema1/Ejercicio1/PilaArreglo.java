package Unidad3.Clase13.Tema1.Ejercicio1;

public class PilaArreglo {
    private int[] datos;
    private int tope;

    public PilaArreglo(int capacidad) {
        if (capacidad <= 0) {
            throw new IllegalArgumentException(
                "La capacidad debe ser mayor que cero."
            );
        }

        datos = new int[capacidad];
        tope = -1;
    }
    
    // Apilar un elemento
    public void push(int valor) {
        if (estaLlena()) {
            throw new IllegalStateException(
                "No se puede apilar: la pila está llena."
            );
        }

        tope++;
        datos[tope] = valor;
    }

    // Desapilar y devolver el elemento superior
    public int pop() {
        if (estaVacia()) {
            throw new IllegalStateException(
                "No se puede desapilar: la pila está vacía."
            );
        }

        int valor = datos[tope];
        tope--;

        return valor;
    }

    // Consultar el elemento superior sin eliminarlo
    public int peek() {
        if (estaVacia()) {
            throw new IllegalStateException(
                "No se puede consultar: la pila está vacía."
            );
        }

        return datos[tope];
    }

    // Verificar si la pila está vacía
    public boolean estaVacia() {
        return tope == -1;
    }

    // Verificar si la pila está llena
    public boolean estaLlena() {
        return tope == datos.length - 1;
    }
}
