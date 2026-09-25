package GuiaEjercicios2.Modelado.Tema1.Ejercicio1;

public class EmpleadoPorHoras extends Empleado {    
    private double pagoPorHora;
    private int horasTrabajadas;

    public EmpleadoPorHoras(String nombre, int edad, double pagoPorHora, int horasTrabajadas) {
        super(nombre, edad, pagoPorHora * horasTrabajadas);

        this.pagoPorHora = pagoPorHora;
        this.horasTrabajadas = horasTrabajadas;
    }

    @Override
    public void mostrarSalario() {
        System.out.println("Empleado por horas");
        System.out.println("Pago por hora: $" + pagoPorHora);
        System.out.println("Horas trabajadas: " + horasTrabajadas);
        System.out.println("Salario: $" + salario);
    }
}
