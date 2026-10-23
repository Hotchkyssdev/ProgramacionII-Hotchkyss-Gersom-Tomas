package Unidad3.Clase15.Tema2.Ejercicio2;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Alumno> alumnos = new ArrayList<>();

        alumnos.add(new Alumno("40111222", "Ana"));
        alumnos.add(new Alumno("40222333", "Bruno"));
        alumnos.add(new Alumno("40333444", "Agustina"));
        alumnos.add(new Alumno("40444555", "Carlos"));
        alumnos.add(new Alumno("40555666", "Andrés"));
        alumnos.add(new Alumno("40666777", "Lucía"));

        System.out.println("Alumnos originales:");

        for (Alumno alumno : alumnos) {
            System.out.println(alumno);
        }

        char letra = 'a';

        int cantidadEliminados =
            GestorAlumnos.eliminarPorInicial(alumnos, letra);

        System.out.println("\nLetra buscada: " + letra);
        System.out.println("Alumnos eliminados: " + cantidadEliminados);

        System.out.println("\nAlumnos restantes:");

        for (Alumno alumno : alumnos) {
            System.out.println(alumno);
        }
    }
}