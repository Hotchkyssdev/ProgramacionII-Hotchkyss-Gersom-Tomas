package Herencia.Tema3.Ejercicio2;

public class Main {
    public static void main(String[] args) {
        Figura[] figuras = {
                new Circulo(5),
                new Rectangulo(10, 6),
                new Triangulo(3, 4, 5),
                new Circulo(3),
        };

        double areaTotal = calcularAreaTotal(figuras);
        System.out.println("Area total: " + areaTotal);
    }

    public static double calcularAreaTotal(Figura[] figuras) {
        double total = 0;

        for (Figura figura : figuras) {
            total += figura.calcularArea();
        }

        return total;
    }
}