package Ejercicio8;

import java.util.Scanner;

public class AplicacionPersona {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Pedir datos por teclado
        System.out.print("Ingrese el nombre: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingrese la edad: ");
        int edad = scanner.nextInt();

        System.out.print("Ingrese el sexo (H/M): ");
        char sexo = scanner.next().charAt(0);

        System.out.print("Ingrese el peso en kg: ");
        double peso = scanner.nextDouble();

        System.out.print("Ingrese la altura en metros: ");
        double altura = scanner.nextDouble();

        // Crear primer objeto con todos los datos
        Persona persona1 = new Persona(
                nombre,
                edad,
                sexo,
                peso,
                altura
        );

        // Crear segundo objeto con nombre, edad y sexo
        Persona persona2 = new Persona(
                nombre,
                edad,
                sexo
        );

        // Crear tercer objeto mediante constructor por defecto
        Persona persona3 = new Persona();

        // Asignar datos utilizando setters
        persona3.setNombre("Persona 3");
        persona3.setEdad(25);
        persona3.setSexo('H');
        persona3.setPeso(80);
        persona3.setAltura(1.80);

        // Comprobar IMC
        System.out.println("\n--- PERSONA 1 ---");
        mostrarResultados(persona1);

        System.out.println("\n--- PERSONA 2 ---");
        mostrarResultados(persona2);

        System.out.println("\n--- PERSONA 3 ---");
        mostrarResultados(persona3);

        scanner.close();
    }

    // Método para mostrar los resultados de cada persona
    public static void mostrarResultados(Persona persona) {

        int resultadoIMC = persona.calcularIMC();

        if (resultadoIMC == -1) {
            System.out.println("La persona está por debajo de su peso ideal.");
        } else if (resultadoIMC == 0) {
            System.out.println("La persona está en su peso ideal.");
        } else {
            System.out.println("La persona tiene sobrepeso.");
        }

        if (persona.esMayorDeEdad()) {
            System.out.println("Es mayor de edad.");
        } else {
            System.out.println("Es menor de edad.");
        }

        System.out.println("\nInformación:");
        System.out.println(persona);
    }
}