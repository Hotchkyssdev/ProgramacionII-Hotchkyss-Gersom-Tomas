package GuiaEjercicios2.Modelado.Tema1.Ejercicio1;

public class EmpleadoAsalariado extends Empleado{
    public EmpleadoAsalariado(String nombre, int edad, double salario) {
        super(nombre, edad, salario);
    }

    @Override
    public void mostrarSalario() {
        System.out.println("Empleado asalariado");
        System.out.println("Salario mensual: $" + salario);
    }
}