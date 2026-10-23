package Unidad3.Clase12.Tema1.Ejercicio2;

public class Main {
    public static void main(String[] args) {
        ListaCircular lista = new ListaCircular();

        lista.insertarFinal(10);
        lista.insertarFinal(20);
        lista.insertarFinal(30);
        lista.insertarFinal(40);

        System.out.println("Lista original:");
        lista.mostrar(1);

        lista.eliminarPrimero();

        System.out.println("Despues de eliminar el primero:");
        lista.mostrar(1);

        ListaCircular listaUnica = new ListaCircular();
        listaUnica.insertarFinal(99);

        System.out.println("Lista con un unico modo:");
        listaUnica.mostrar(1);

        listaUnica.eliminarPrimero();

        System.out.println("Despues de eliminarlo:");
        listaUnica.mostrar(1);

        ListaCircular listaVacia = new ListaCircular();

        try {
            listaVacia.eliminarPrimero();
        } catch (IllegalStateException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}