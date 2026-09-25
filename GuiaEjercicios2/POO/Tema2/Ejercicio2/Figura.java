package GuiaEjercicios2.POO.Tema2.Ejercicio2;

public abstract class Figura implements Comparable<Figura> {
    protected String nombre;

    public Figura(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public abstract double calcularArea();

    @Override
    public int compareTo(Figura otraFigura) {
        return Double.compare(this.calcularArea(), otraFigura.calcularArea());
    }

    @Override
    public String toString() {
        return nombre + " - Área: " + calcularArea();
    }
}