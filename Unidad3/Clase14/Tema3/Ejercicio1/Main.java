package Unidad3.Clase14.Tema3.Ejercicio1;

public class Main {
    public static void main(String[] args) {
        PilaConDosColas pila = new PilaConDosColas();

        System.out.println("Apilando elementos:");

        pila.push(10);
        System.out.println("push(10)");

        pila.push(20);
        System.out.println("push(20)");

        pila.push(30);
        System.out.println("push(30)");

        pila.push(40);
        System.out.println("push(40)");

        System.out.println("\nDesapilando elementos:");

        while (!pila.estaVacia()) {
            System.out.println(pila.pop());
        }

        System.out.println("\n¿Está vacía? " + pila.estaVacia());

        // Probar el error al desapilar una pila vacía
        try {
            pila.pop();
        } catch (IllegalStateException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}