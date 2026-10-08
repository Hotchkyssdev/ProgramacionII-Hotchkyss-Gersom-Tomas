package RepasoParcialI.Modelo2.app;

import RepasoParcialI.Modelo2.modelo.Curso;

import java.util.ArrayList;

public class Instituto {

    private ArrayList<Curso> cursos;

    public Instituto() {
        cursos = new ArrayList<>();
    }

    public void registrarCurso(Curso curso) {
        cursos.add(curso);
    }

    public void mostrarReporte() {

        System.out.println("===== REPORTE DE CURSOS =====");

        for (Curso curso : cursos) {

            System.out.println("Tipo: "
                    + curso.getClass().getSimpleName());

            System.out.println("Código: "
                    + curso.getCodigo());

            System.out.println("Nombre: "
                    + curso.getNombre());

            System.out.println("Capacidad máxima: "
                    + curso.getCantidadMaximaAlumnos());

            System.out.println("Disponible: "
                    + curso.estaDisponible());

            System.out.println("Costo: $"
                    + curso.calcularCosto());

            System.out.println("-----------------------------");
        }
    }

    public double calcularRecaudacionTotal() {

        double total = 0;

        for (Curso curso : cursos) {

            if (curso.estaDisponible()) {
                total += curso.calcularCosto();
            }
        }

        return total;
    }
}