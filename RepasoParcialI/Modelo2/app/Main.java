package RepasoParcialI.Modelo2.app;

import RepasoParcialI.Modelo2.modelo.CursoPresencial;
import RepasoParcialI.Modelo2.modelo.CursoVirtual;

public class Main {

    public static void main(String[] args) {

        Instituto instituto = new Instituto();

        CursoPresencial presencial1 = new CursoPresencial(
                "P001",
                "Java Inicial",
                30000,
                25,
                5000
        );

        CursoPresencial presencial2 = new CursoPresencial(
                "P002",
                "Bases de Datos",
                35000,
                20,
                7000
        );

        CursoVirtual virtual1 = new CursoVirtual(
                "V001",
                "Programación Web",
                25000,
                30,
                3000,
                true
        );

        CursoVirtual virtual2 = new CursoVirtual(
                "V002",
                "Python Avanzado",
                40000,
                15,
                5000,
                false
        );

        instituto.registrarCurso(presencial1);
        instituto.registrarCurso(presencial2);
        instituto.registrarCurso(virtual1);
        instituto.registrarCurso(virtual2);

        // Sobrecarga: primera versión
        presencial1.actualizarCapacidad(30);

        // Sobrecarga: segunda versión
        virtual1.actualizarCapacidad(35, true);

        // Prueba de excepción
        try {

            CursoPresencial cursoInvalido = new CursoPresencial(
                    "",
                    "Curso inválido",
                    20000,
                    20,
                    3000
            );

        } catch (IllegalArgumentException e) {

            System.out.println(
                    "Error: " + e.getMessage()
            );
        }

        System.out.println();

        instituto.mostrarReporte();

        System.out.println();

        double total = instituto.calcularRecaudacionTotal();

        System.out.println(
                "Recaudación total: $" + total
        );
    }
}