package Unidad3.Clase12.Tema1.Ejercicio1;

public class Main {
    public static void main(String[] args) {
        ListaCircular lista = new ListaCircular();

        lista.insertarFinal(10);
        lista.insertarFinal(20);
        lista.insertarFinal(30);
        lista.insertarFinal(40);

        System.out.println("Lista circular: dos vueltas completas");
        lista.mostrar(2);
    }
}