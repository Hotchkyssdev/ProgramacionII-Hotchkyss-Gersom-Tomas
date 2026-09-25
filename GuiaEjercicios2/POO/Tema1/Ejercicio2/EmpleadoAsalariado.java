package GuiaEjercicios2.POO.Tema1.Ejercicio2;

public class EmpleadoAsalariado extends Empleado {
    private double sueldoBasico;
    private double bono;

    // Constructor original
    public EmpleadoAsalariado(String nombre, int legajo, double sueldoBasico, double bono) {
        super(nombre, legajo);
        this.sueldoBasico = sueldoBasico;
        this.bono = bono;
    }

    // Constructor sobrecargado
    public EmpleadoAsalariado(String nombre, int legajo) {
        super(nombre, legajo);
        this.sueldoBasico = 0;
        this.bono = 0;
    }

    @Override
    public double calcularSueldo() {
        return sueldoBasico + bono;
    }
}