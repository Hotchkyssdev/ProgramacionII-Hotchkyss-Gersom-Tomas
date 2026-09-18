package Herencia.Tema1.Ejercicio2;

public class Main {
    public static void main(String[] args) {
        Circulo circulo = new Circulo(5);
        Rectangulo rectangulo = new Rectangulo(10, 6);

        System.out.println("Circulo:");
        System.out.println("Nombre: " + circulo.getNombre());
        System.out.println("Radio: " + circulo.getRadio());

        System.out.println();

        System.out.println("Rectangulo:");
        System.out.println("Nombre: " + rectangulo.getNombre());
        System.out.println("Base: " + rectangulo.getBase());
        System.out.println("Altura: " + rectangulo.getAltura());
    }
}