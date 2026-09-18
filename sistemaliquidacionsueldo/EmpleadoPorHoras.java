package sistemaliquidacionsueldo;

public class EmpleadoPorHoras extends Empleado {
    private double horasTrabajadas;
    private double valorHora;

    public EmpleadoPorHoras(String nombre, int legajo, double horasTrabajadas, double valorHora) {
        super(nombre, legajo);
        this.horasTrabajadas = horasTrabajadas;
        this.valorHora = valorHora;
    }

    @Override 
    public double calcularSueldo() {
        return horasTrabajadas * valorHora;
    }
}