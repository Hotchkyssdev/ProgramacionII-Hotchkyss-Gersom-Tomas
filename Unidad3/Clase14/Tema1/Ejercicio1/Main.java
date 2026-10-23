package Unidad3.Clase14.Tema1.Ejercicio1;

public class Main {
    public static void main(String[] args) {
        ColaCircular cola = new ColaCircular(4);

        // Llenar la cola
        cola.encolar(10);
        cola.encolar(20);
        cola.encolar(30);
        cola.encolar(40);

        System.out.println("¿Está llena? " + cola.estaLlena());
        System.out.println("Frente: " + cola.frente());

        // Liberar dos posiciones
        System.out.println("\nDesencolando: " + cola.desencolar());
        System.out.println("Desencolando: " + cola.desencolar());

        // Reutilizar las posiciones liberadas
        cola.encolar(50);
        cola.encolar(60);

        System.out.println("\nFrente después de encolar: " + cola.frente());
        System.out.println("¿Está llena? " + cola.estaLlena());

        // Mostrar todos los elementos en orden FIFO
        System.out.println("\nElementos desencolados:");

        while (!cola.estaVacia()) {
            System.out.println(cola.desencolar());
        }

        System.out.println("\n¿Está vacía? " + cola.estaVacia());
    }
}