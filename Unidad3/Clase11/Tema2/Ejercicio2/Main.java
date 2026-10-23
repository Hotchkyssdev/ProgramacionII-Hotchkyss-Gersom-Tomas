package Unidad3.Clase11.Tema2.Ejercicio2;

public class Main {
    public static void main(String[] args) {
        ListaEnlazada lista = new ListaEnlazada();

        lista.insertarFinal(20);
        lista.insertarFinal(10);
        lista.insertarFinal(20);
        lista.insertarFinal(30);
        lista.insertarFinal(20);
        lista.insertarFinal(40);
        lista.insertarFinal(20);

        System.out.println("Lista original: ");
        lista.mostrar();

        System.out.println("\nOcurrencias del 20: " + lista.contarOcurrencias(20));
        lista.eliminarTodas(20);

        System.out.println("Lista despues de eliminar el 20: ");
        lista.mostrar();

        System.out.println("\nTamaño final: " + lista.tamanio());

        System.out.println("Ocurrencias restantes del 20: " + lista.contarOcurrencias(20));
    }
}