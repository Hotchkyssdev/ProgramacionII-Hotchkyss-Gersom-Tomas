package Herencia.Tema2.Ejercicio2;

public class Main {
    public static void main(String[] args) {
        Auto auto = new Auto("Toyota", "Corolla", 2022, 4);
        Moto moto = new Moto("Honda", "CB190R", 2023, 184);

        System.out.println("Auto:");
        System.out.println(auto);

        System.out.println();

        System.out.println("Moto:");
        System.out.println(moto);
    }
}
