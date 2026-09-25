package GuiaEjercicios2.POO.Tema1.Ejercicio2;

public class EmpleadoPorHoras extends Empleado {
    private int horasTrabajadas;
    private double valorHora;

    public EmpleadoPorHoras(String nombre, int legajo, int horasTrabajadas, double valorHora) {
        super(nombre, legajo);
        this.horasTrabajadas = horasTrabajadas;
        this.valorHora = valorHora;
    }

    @Override
    public double calcularSueldo() {
        return horasTrabajadas * valorHora;
    }
}