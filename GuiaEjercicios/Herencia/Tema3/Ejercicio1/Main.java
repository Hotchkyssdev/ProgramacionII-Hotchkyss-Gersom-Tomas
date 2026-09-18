package Herencia.Tema3.Ejercicio1;

import Herencia.Tema2.Ejercicio1.Empleado;
import Herencia.Tema2.Ejercicio1.EmpleadoAsalariado;
import Herencia.Tema2.Ejercicio1.EmpleadoPorHoras;

public class Main {
    public static void main(String[] args) {
        Empleado[] empleados = {
                new EmpleadoPorHoras("Juan", 101, 40, 5000),
                new EmpleadoAsalariado("Maria", 102, 500000, 100000),
                new EmpleadoPorHoras("Pedro", 103, 30, 6000),
                new EmpleadoAsalariado("Ana", 104, 600000, 150000)
        };

        for (Empleado empleado : empleados) {
            System.out.println(empleado.getNombre() + " - Sueldo: " + empleado.calcularSueldo());
        }
    }
}