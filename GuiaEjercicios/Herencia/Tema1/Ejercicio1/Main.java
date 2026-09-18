package Herencia.Tema1.Ejercicio1;

public class Main {
    public static void main(String[] args) {
        EmpleadoPorHoras empleado1 = new EmpleadoPorHoras("Juan", 101, 40, 5000);
        EmpleadoAsalariado empleado2 = new EmpleadoAsalariado("Maria", 102, 500000, 100000);

        System.out.println("Empleado por horas:");
        System.out.println("Nombre: " + empleado1.getNombre());
        System.out.println("Legajo: " + empleado1.getLegajo());
        System.out.println("Horas Trabajadas: " + empleado1.getHorasTrabajadas());
        System.out.println("Valor por hora: " + empleado1.getValorHora());

        System.out.println();

        System.out.println("Empleado Asalariado:");
        System.out.println("Nombre: " + empleado2.getNombre());
        System.out.println("Legajo: " + empleado2.getLegajo());
        System.out.println("Sueldo Basico: " + empleado2.getSueldoBasico());
        System.out.println("Bono: " + empleado2.getBono());
    }
}