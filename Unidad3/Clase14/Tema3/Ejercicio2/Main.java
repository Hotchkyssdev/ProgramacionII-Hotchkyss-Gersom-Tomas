package Unidad3.Clase14.Tema3.Ejercicio2;

public class Main {
    public static void main(String[] args) {
        ColaConDosPilas cola = new ColaConDosPilas();

        // Encolar tres elementos
        cola.encolar(10);
        cola.encolar(20);
        cola.encolar(30);

        // Desencolar el primero
        System.out.println("Desencolado: " + cola.desencolar());

        // Agregar otro elemento mientras quedan elementos en salida
        cola.encolar(40);

        System.out.println("Desencolado: " + cola.desencolar());
        System.out.println("Desencolado: " + cola.desencolar());
        System.out.println("Desencolado: " + cola.desencolar());

        System.out.println("¿Está vacía? " + cola.estaVacia());

        // Probar el error al desencolar una cola vacía
        try {
            cola.desencolar();
        } catch (IllegalStateException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}