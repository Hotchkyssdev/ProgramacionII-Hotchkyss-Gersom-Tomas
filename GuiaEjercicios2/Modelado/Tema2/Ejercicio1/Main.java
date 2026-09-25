package GuiaEjercicios2.Modelado.Tema2.Ejercicio1;

import GuiaEjercicios2.Modelado.Tema2.Ejercicio1.modelo.Libro;
import GuiaEjercicios2.Modelado.Tema2.Ejercicio1.servicio.Biblioteca;
import GuiaEjercicios2.Modelado.Tema2.Ejercicio1.servicio.Concesionaria;

public class Main {

    public static void main(String[] args) {
        System.out.println("=== BIBLIOTECA ===");

        Libro libro1 = new Libro(
                "1984",
                "George Orwell"
        );

        Libro libro2 = new Libro(
                "El Principito",
                "Antoine de Saint-Exupéry"
        );

        Biblioteca biblioteca = new Biblioteca();

        biblioteca.agregarLibro(libro1);
        biblioteca.agregarLibro(libro2);

        biblioteca.mostrarLibros();

        System.out.println();
        System.out.println("=== CONCESIONARIA ===");

        Concesionaria concesionaria = new Concesionaria();

        concesionaria.mostrarAutos();
    }
}