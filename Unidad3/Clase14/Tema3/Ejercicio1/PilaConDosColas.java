package Unidad3.Clase14.Tema3.Ejercicio1;

public class PilaConDosColas {
    private ColaEnlazada principal;
    private ColaEnlazada auxiliar;

    public PilaConDosColas() {
        principal = new ColaEnlazada();
        auxiliar = new ColaEnlazada();
    }

    // Agregar un elemento al tope de la pila
    public void push(int valor) {

        // Primero, colocar el nuevo valor en la auxiliar
        auxiliar.encolar(valor);

        // Pasar todos los elementos de la principal a la auxiliar
        while (!principal.estaVacia()) {
            auxiliar.encolar(principal.desencolar());
        }

        // Intercambiar las colas
        ColaEnlazada temporal = principal;
        principal = auxiliar;
        auxiliar = temporal;
    }

    // Quitar y devolver el elemento del tope
    public int pop() {
        if (principal.estaVacia()) {
            throw new IllegalStateException("La pila está vacía.");
        }

        return principal.desencolar();
    }

    public boolean estaVacia() {
        return principal.estaVacia();
    }
}