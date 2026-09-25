package GuiaEjercicios2.Modelado.Tema1;

import GuiaEjercicios2.Modelado.Tema1.Ejercicio1.Persona;
import GuiaEjercicios2.Modelado.Tema1.Ejercicio1.CuentaBancaria;
import GuiaEjercicios2.Modelado.Tema1.Ejercicio1.Empleado;
import GuiaEjercicios2.Modelado.Tema1.Ejercicio1.EmpleadoPorHoras;
import GuiaEjercicios2.Modelado.Tema1.Ejercicio1.EmpleadoAsalariado;
import GuiaEjercicios2.Modelado.Tema1.Ejercicio2.Factura;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== MODELO ===");

        Persona persona = new Persona("Juan", 20);
        persona.mostrarInformacion();

        System.out.println();

        CuentaBancaria cuenta =
                new CuentaBancaria("Juan", 50000);

        cuenta.depositar(10000);
        cuenta.mostrarSaldo();

        System.out.println();

        Empleado empleado =
                new Empleado("Carlos", 30, 500000);

        empleado.mostrarInformacion();
        empleado.mostrarSalario();

        System.out.println();

        EmpleadoPorHoras empleadoPorHoras =
                new EmpleadoPorHoras("Pedro", 25, 5000, 40);

        empleadoPorHoras.mostrarInformacion();
        empleadoPorHoras.mostrarSalario();

        System.out.println();

        EmpleadoAsalariado empleadoAsalariado =
                new EmpleadoAsalariado("Luis", 35, 700000);

        empleadoAsalariado.mostrarInformacion();
        empleadoAsalariado.mostrarSalario();

        System.out.println();
        System.out.println("=== FACTURACIÓN ===");

        Factura factura = new Factura(1001, 10);

        factura.agregarItem(1000);
        factura.agregarItem(2000);
        factura.agregarItem(500);

        System.out.println(factura.generarComprobante());
    }
}