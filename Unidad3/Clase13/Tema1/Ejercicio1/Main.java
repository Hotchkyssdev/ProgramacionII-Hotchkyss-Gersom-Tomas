package Unidad3.Clase13.Tema1.Ejercicio1;

public class Main {
    
    public static void main(String[] args) {

        PilaArreglo pila = new PilaArreglo(4);

        // Apilar cuatro valores
        pila.push(10);
        pila.push(20);
        pila.push(30);
        pila.push(40);

        System.out.println("¿Está vacía? " + pila.estaVacia());
        System.out.println("¿Está llena? " + pila.estaLlena());

        // Consultar el elemento superior
        System.out.println("Elemento superior: " + pila.peek());

        // Desapilar todos los elementos
        System.out.println("Orden de desapilado:");

        while (!pila.estaVacia()) {
            System.out.println(pila.pop());
        }

        System.out.println("¿Está vacía? " + pila.estaVacia());

        // Probar una operación inválida
        try {
            pila.pop();
        } catch (IllegalStateException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}