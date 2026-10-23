package Unidad3.Clase12.Tema2.Ejercicio2;

public class Main {
    public static void main(String[] args) {
        ListaDoble lista = new ListaDoble();
        
        lista.insertarFinal(10);
        lista.insertarFinal(20);
        lista.insertarFinal(30);
        lista.insertarFinal(40);

        System.out.println("Antes de invertir:");
        lista.mostrarAdelante();
        lista.mostrarAtras();

        lista.invertirRecorrido();

        System.out.println("\nDespues de invertir:");
        lista.mostrarAdelante();
        lista.mostrarAtras();
    }
}