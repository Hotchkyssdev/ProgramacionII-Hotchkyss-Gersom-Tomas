package GuiaEjercicios2.Modelado.Tema1.Ejercicio1;

public class Empleado extends Persona{
    protected double salario;

    public Empleado(String nombre, int edad, double salario) {
        super(nombre, edad);
        this.salario = salario;
    }

    public void mostrarSalario() {
        System.out.println("Salario: $" + salario);
    }  
}
