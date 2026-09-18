package sistemaliquidacionsueldo;

public class EmpleadoPorComisiones extends Empleado {
    private double sueldoBase;
    private double ventas;
    private double porcentajeComision;
    
    public EmpleadoPorComisiones(String nombre, int legajo, double sueldoBase, double ventas, double porcentajeComision) {
        super(nombre, legajo);
        this.sueldoBase = sueldoBase;
        this.ventas = ventas;
        this.porcentajeComision = porcentajeComision;
    }

    @Override 
    public double calcularSueldo() {
        return sueldoBase + (ventas * porcentajeComision / 100);
    }
}