package Herencia.Tema3.Ejercicio2;

public class Triangulo extends Figura {
    private double lado1;
    private double lado2;
    private double lado3;

    public Triangulo(double lado1, double lado2, double lado3) {
        super("Triangulo");

        if(lado1 + lado2 <= lado3 || lado1 + lado3 <= lado2 || lado2 + lado3 <= lado1) {
            throw new IllegalArgumentException("Los lados no forman un triangulo valido");
        }

        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    @Override
    public double calcularArea() {
        double semiperimetro = (lado1 + lado2 + lado3) / 2;

        return Math.sqrt(semiperimetro *
                (semiperimetro - lado1) *
                (semiperimetro - lado2) *
                (semiperimetro - lado3));
    }
}