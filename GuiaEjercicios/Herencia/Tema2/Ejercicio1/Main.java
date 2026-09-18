package Herencia.Tema2.Ejercicio1;

public class Main {
    public static void main(String[] args) {
        EmpleadoPorHoras empleado1 = new EmpleadoPorHoras("Juan", 101, 40, 5000);
        EmpleadoAsalariado empleado2 = new EmpleadoAsalariado("Maria", 102, 500000, 100000);

        System.out.println("Empleado por horas:");
        System.out.println("Sueldo calculado: " + empleado1.calcularSueldo());

        System.out.println();

        System.out.println("Empleado asalariado:");
        System.out.println("Sueldo calculado: " + empleado2.calcularSueldo());
    }
}