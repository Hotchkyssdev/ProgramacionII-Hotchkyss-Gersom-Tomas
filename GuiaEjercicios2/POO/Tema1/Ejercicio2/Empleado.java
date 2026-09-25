package GuiaEjercicios2.POO.Tema1.Ejercicio2;

public class Empleado {
    private String nombre;
    private int legajo;

    public Empleado(String nombre, int legajo) {
        this.nombre = nombre;
        this.legajo = legajo;
    }

    public String getNombre() {
        return nombre;
    }

    public int getLegajo() {
        return legajo;
    }

    public double calcularSueldo() {
        return 0;
    }
}