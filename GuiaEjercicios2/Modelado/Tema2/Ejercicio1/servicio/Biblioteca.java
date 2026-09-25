package GuiaEjercicios2.Modelado.Tema2.Ejercicio1.servicio;

import java.util.ArrayList;
import GuiaEjercicios2.Modelado.Tema2.Ejercicio1.modelo.Libro;

public class Biblioteca {
    private ArrayList<Libro> libros;

    public Biblioteca() {
        libros = new ArrayList<>();
    }

    public void agregarLibro(Libro libro) {
        libros.add(libro);
    }

    public void mostrarLibros() {

        for (Libro libro : libros) {
            System.out.println(libro);
        }
    }
}