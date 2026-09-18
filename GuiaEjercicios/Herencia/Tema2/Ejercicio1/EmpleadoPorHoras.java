package Herencia.Tema2.Ejercicio1;

public class EmpleadoPorHoras extends Empleado {
    private int horasTrabajadas;
    private double valorHora;

    public EmpleadoPorHoras(String nombre, int legajo, int horasTrabajadas, double valorHora) {
        super(nombre, legajo);
        this.horasTrabajadas = horasTrabajadas;
        this.valorHora = valorHora;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public double getValorHora() {
        return valorHora;
    }

    @Override
    public double calcularSueldo() {
        return horasTrabajadas * valorHora;
    }
}
