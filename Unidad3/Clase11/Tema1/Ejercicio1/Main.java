package Unidad3.Clase11.Tema1.Ejercicio1;

public class Main {
    public static void main(String[] args) {
        ListaEstatica lista = new ListaEstatica(6);

        lista.insertar(10);
        lista.insertar(20);
        lista.insertar(30);
        lista.insertar(40);

        System.out.println("Lista inicial: ");
        lista.mostrar();

        System.out.println("Indice del 30: " + lista.buscar(30));
        System.out.println("Indice del 99: " + lista.buscar(99));
    }
}