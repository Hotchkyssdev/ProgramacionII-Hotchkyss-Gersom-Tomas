package Unidad3.Clase12.Tema2.Ejercicio1;

public class Main {
    public static void main(String[] args) {
        ListaDoble lista = new ListaDoble();

        lista.insertarFinal(20);
        lista.insertarFinal(30);

        lista.insertarInicio(10);
        lista.insertarInicio(5);

        lista.insertarFinal(40);

        System.out.println("Recorridos de la lista doblemente enlazada:");
        lista.mostrarAdelante();
        lista.mostrarAtras();
    }
}