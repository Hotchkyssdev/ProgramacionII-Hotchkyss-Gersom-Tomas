package Unidad3.Clase14.Tema3.Ejercicio2;

public class ColaConDosPilas {
    private PilaEnlazada entrada;
    private PilaEnlazada salida;

    public ColaConDosPilas() {
        entrada = new PilaEnlazada();
        salida = new PilaEnlazada();
    }

    // Agregar siempre a la pila de entrada
    public void encolar(int valor) {
        entrada.push(valor);
    }

    // Quitar el elemento más antiguo
    public int desencolar() {

        // Trasvasar solamente si la pila de salida está vacía
        if (salida.estaVacia()) {

            while (!entrada.estaVacia()) {
                salida.push(entrada.pop());
            }
        }

        if (salida.estaVacia()) {
            throw new IllegalStateException(
                "No se puede desencolar: la cola está vacía."
            );
        }

        return salida.pop();
    }

    public boolean estaVacia() {
        return entrada.estaVacia() && salida.estaVacia();
    }
}