package Unidad3.Clase14.Tema1.Ejercicio2;

public class Main {
    public static void main(String[] args) {
        ColaEnlazada cola = new ColaEnlazada();

        // Encolar cuatro elementos
        cola.encolar(10);
        cola.encolar(20);
        cola.encolar(30);
        cola.encolar(40);

        System.out.println("Tamaño inicial: " + cola.tamanio());
        System.out.println("Frente: " + cola.frente());

        // Desencolar un elemento
        System.out.println("\nElemento desencolado: " + cola.desencolar());
        System.out.println("Tamaño actual: " + cola.tamanio());
        System.out.println("Nuevo frente: " + cola.frente());

        // Vaciar la cola
        int eliminados = cola.vaciar();

        System.out.println("\nElementos eliminados al vaciar: " + eliminados);
        System.out.println("Tamaño después de vaciar: " + cola.tamanio());
        System.out.println("¿Está vacía? " + cola.estaVacia());

        // Comprobar que también puede volver a utilizarse
        cola.encolar(50);

        System.out.println("\nDespués de volver a encolar:");
        System.out.println("Frente: " + cola.frente());
        System.out.println("Tamaño: " + cola.tamanio());

        // Comprobar vaciar una cola con un solo elemento
        System.out.println("Elementos eliminados: " + cola.vaciar());

        // Comprobar vaciar una cola ya vacía
        System.out.println("Elementos eliminados nuevamente: " + cola.vaciar());
    }
}