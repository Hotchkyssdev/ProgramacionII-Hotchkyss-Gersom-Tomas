package Unidad3.Clase11.Tema2.Ejercicio1;

public class Main {
    public static void main(String[] args) {
        ListaEnlazada lista = new ListaEnlazada();

        lista.insertarFinal(20);
        lista.insertarFinal(30);

        lista.insertarInicio(10);
        lista.insertarInicio(5);

        lista.insertarFinal(40);

        System.out.println("Lista Enlazada: ");
        lista.mostrar();

        System.out.println("Tamaño: " + lista.tamanio());

        System.out.println("Existe el 20? " + lista.buscar(20));
        System.out.println("Existe el 99? " + lista.buscar(99));
    }
}
