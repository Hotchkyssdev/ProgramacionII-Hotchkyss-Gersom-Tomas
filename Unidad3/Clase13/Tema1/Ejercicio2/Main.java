package Unidad3.Clase13.Tema1.Ejercicio2;

public class Main {
    public static void main(String[] args) {

        PilaEnlazada pila = new PilaEnlazada();

        // Apilar cuatro elementos
        pila.push(10);
        pila.push(20);
        pila.push(30);
        pila.push(40);

        System.out.println("Tamaño original: " + pila.tamanio());
        System.out.println("Tope original: " + pila.peek());

        // Clonar la pila
        PilaEnlazada copia = pila.clonar();

        System.out.println("\nTamaño de la copia: " + copia.tamanio());
        System.out.println("Tope de la copia: " + copia.peek());

        // Modificar la copia
        copia.push(50);
        copia.pop();

        System.out.println("\nDespués de modificar la copia:");
        System.out.println("Tamaño original: " + pila.tamanio());
        System.out.println("Tope original: " + pila.peek());

        System.out.println("Tamaño de la copia: " + copia.tamanio());
        System.out.println("Tope de la copia: " + copia.peek());

        // Desapilar la original para comprobar el orden
        System.out.println("\nOrden de desapilado de la original:");

        while (!pila.estaVacia()) {
            System.out.println(pila.pop());
        }
    }
}