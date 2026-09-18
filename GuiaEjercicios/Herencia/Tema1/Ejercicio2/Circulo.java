package Herencia.Tema1.Ejercicio2;

public class Circulo extends Figura {
    private double radio;

    public Circulo(double radio) {
        super("Círculo");
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }
}
