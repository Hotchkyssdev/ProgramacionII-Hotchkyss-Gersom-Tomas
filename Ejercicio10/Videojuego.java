package Ejercicio10;

public class Videojuego {

    private String titulo;
    private int horasEstimadas;
    private boolean entregado;
    private String genero;
    private String compania;

    // Constructor por defecto
    public Videojuego() {
        titulo = "";
        horasEstimadas = 10;
        entregado = false;
        genero = "";
        compania = "";
    }

    // Constructor con título y horas estimadas
    public Videojuego(String titulo, int horasEstimadas) {
        this.titulo = titulo;
        this.horasEstimadas = horasEstimadas;
        entregado = false;
        genero = "";
        compania = "";
    }

    // Constructor con todos los atributos excepto entregado
    public Videojuego(String titulo, int horasEstimadas,
                      String genero, String compania) {

        this.titulo = titulo;
        this.horasEstimadas = horasEstimadas;
        this.entregado = false;
        this.genero = genero;
        this.compania = compania;
    }

    // Getters
    public String getTitulo() {
        return titulo;
    }

    public int getHorasEstimadas() {
        return horasEstimadas;
    }

    public String getGenero() {
        return genero;
    }

    public String getCompania() {
        return compania;
    }

    // Setters
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setHorasEstimadas(int horasEstimadas) {
        this.horasEstimadas = horasEstimadas;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setCompania(String compania) {
        this.compania = compania;
    }

    // Entregar
    public void entregar() {
        entregado = true;
    }

    // Devolver
    public void devolver() {
        entregado = false;
    }

    // Comprobar si está entregado
    public boolean isEntregado() {
        return entregado;
    }

    @Override
    public String toString() {

        return "Título: " + titulo
                + "\nHoras estimadas: " + horasEstimadas
                + "\nEntregado: " + entregado
                + "\nGénero: " + genero
                + "\nCompañía: " + compania;
    }
}
