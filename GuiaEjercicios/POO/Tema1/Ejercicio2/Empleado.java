package POO.Tema1.Ejercicio2;

public class Empleado {
    private String nombre;
    private int legajo;

    public Empleado(String nombre, int legajo) {
        this.nombre = nombre;
        this.legajo = legajo;
    }

    public int calcularSueldo() {
        return 0;
    }

    public int getLegajo() {
        return legajo;
    }
}