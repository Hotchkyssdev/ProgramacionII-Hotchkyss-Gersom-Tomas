public class Empleado {
    private String nombre;
    private int legajo;

    public Empleado(String nombre, int legajo) {
        this.nombre = nombre;
        this.legajo = legajo;
    }

    public double calcularSueldo() {
        return 0;
    }

    public String getNombre() {
        return nombre;
    }

    public int getLegajo() {
        return legajo;
    }

    public String toString() {
        return "Nombre: " + nombre
            + ", Legajo: " + legajo;
    }
}