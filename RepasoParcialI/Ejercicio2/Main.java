package RepasoParcialI.Ejercicio2;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese DNI: ");
        String DNI = teclado.nextLine();

        System.out.print("Ingrese nombre: ");
        String nombre = teclado.nextLine();

        System.out.print("Ingrese apellido: ");
        String apellido = teclado.nextLine();

        System.out.print("Ingrese edad: ");
        int edad = teclado.nextInt();

        System.out.print("Ingrese sexo (H/M): ");
        char sexo = teclado.next().charAt(0);

        System.out.print("Ingrese peso: ");
        double peso = teclado.nextDouble();

        System.out.print("Ingrese altura: ");
        double altura = teclado.nextDouble();

        // Primer objeto: todos los datos
        Persona persona1 = new Persona(
                DNI, nombre, apellido, edad, sexo, peso, altura
        );

        // Segundo objeto: sin peso ni altura
        Persona persona2 = new Persona(
                DNI, nombre, apellido, edad, sexo
        );

        // Tercer objeto: solamente DNI y nombre
        Persona persona3 = new Persona(
                DNI, nombre
        );

        System.out.println("\n--- PERSONA 1 ---");
        mostrarInformacion(persona1);

        System.out.println("\n--- PERSONA 2 ---");
        mostrarInformacion(persona2);

        System.out.println("\n--- PERSONA 3 ---");
        mostrarInformacion(persona3);

        teclado.close();
    }

    public static void mostrarInformacion(Persona persona) {

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

        System.out.println(persona);
    }
}