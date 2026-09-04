package Ejercicio10;

public class AplicacionSerieVideojuego {

    public static void main(String[] args) {

        // Arrays de 5 posiciones
        Serie[] series = new Serie[5];
        Videojuego[] videojuegos = new Videojuego[5];

        // Crear las series
        series[0] = new Serie(
                "Breaking Bad",
                5,
                "Drama",
                "Vince Gilligan"
        );

        series[1] = new Serie(
                "Stranger Things",
                4,
                "Ciencia ficción",
                "Los Hermanos Duffer"
        );

        series[2] = new Serie(
                "The Office",
                "Greg Daniels"
        );

        series[3] = new Serie();

        series[4] = new Serie(
                "Game of Thrones",
                8,
                "Fantasía",
                "David Benioff y D. B. Weiss"
        );

        // Crear los videojuegos
        videojuegos[0] = new Videojuego(
                "The Witcher 3",
                100,
                "RPG",
                "CD Projekt Red"
        );

        videojuegos[1] = new Videojuego(
                "God of War",
                30,
                "Acción",
                "Santa Monica Studio"
        );

        videojuegos[2] = new Videojuego(
                "Minecraft",
                50,
                "Sandbox",
                "Mojang"
        );

        videojuegos[3] = new Videojuego(
                "Dark Souls",
                60
        );

        videojuegos[4] = new Videojuego();

        // Entregar algunas series
        series[0].entregar();
        series[2].entregar();
        series[4].entregar();

        // Entregar algunos videojuegos
        videojuegos[0].entregar();
        videojuegos[2].entregar();

        // Contar series entregadas
        int seriesEntregadas = 0;

        for (Serie serie : series) {

            if (serie.isEntregado()) {
                seriesEntregadas++;
            }
        }

        // Contar videojuegos entregados
        int videojuegosEntregados = 0;

        for (Videojuego videojuego : videojuegos) {

            if (videojuego.isEntregado()) {
                videojuegosEntregados++;
            }
        }

        System.out.println("Series entregadas: " + seriesEntregadas);
        System.out.println("Videojuegos entregados: " + videojuegosEntregados);

        // Buscar el videojuego con más horas
        Videojuego videojuegoMayor = videojuegos[0];

        for (int i = 1; i < videojuegos.length; i++) {

            if (videojuegos[i].getHorasEstimadas()
                    > videojuegoMayor.getHorasEstimadas()) {

                videojuegoMayor = videojuegos[i];
            }
        }

        // Buscar la serie con más temporadas
        Serie serieMayor = series[0];

        for (int i = 1; i < series.length; i++) {

            if (series[i].getNumeroTemporadas()
                    > serieMayor.getNumeroTemporadas()) {

                serieMayor = series[i];
            }
        }

        // Mostrar resultados
        System.out.println("\n--- VIDEOJUEGO CON MÁS HORAS ---");
        System.out.println(videojuegoMayor);

        System.out.println("\n--- SERIE CON MÁS TEMPORADAS ---");
        System.out.println(serieMayor);
    }
}
