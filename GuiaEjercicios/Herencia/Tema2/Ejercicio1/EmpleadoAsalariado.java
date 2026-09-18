package Herencia.Tema2.Ejercicio1;

public class EmpleadoAsalariado extends Empleado {

    private double sueldoBasico;
    private double bono;

    public EmpleadoAsalariado(String nombre, int legajo, double sueldoBasico, double bono) {
        super(nombre, legajo);
        this.sueldoBasico = sueldoBasico;
        this.bono = bono;
    }

    public double getSueldoBasico() {
        return sueldoBasico;
    }

    public double getBono() {
        return bono;
    }

    @Override
    public double calcularSueldo() {
        return sueldoBasico + bono;
    }
}
