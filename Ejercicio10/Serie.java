package Ejercicio10;

public class Serie {

    private String titulo;
    private int numeroTemporadas;
    private boolean entregado;
    private String genero;
    private String creador;

    // Constructor por defecto
    public Serie() {
        titulo = "";
        numeroTemporadas = 3;
        entregado = false;
        genero = "";
        creador = "";
    }

    // Constructor con título y creador
    public Serie(String titulo, String creador) {
        this.titulo = titulo;
        this.creador = creador;
        numeroTemporadas = 3;
        entregado = false;
        genero = "";
    }

    // Constructor con todos los atributos excepto entregado
    public Serie(String titulo, int numeroTemporadas,
                 String genero, String creador) {

        this.titulo = titulo;
        this.numeroTemporadas = numeroTemporadas;
        this.entregado = false;
        this.genero = genero;
        this.creador = creador;
    }

    // Getters
    public String getTitulo() {
        return titulo;
    }

    public int getNumeroTemporadas() {
        return numeroTemporadas;
    }

    public String getGenero() {
        return genero;
    }

    public String getCreador() {
        return creador;
    }

    // Setters
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setNumeroTemporadas(int numeroTemporadas) {
        this.numeroTemporadas = numeroTemporadas;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setCreador(String creador) {
        this.creador = creador;
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
                + "\nNúmero de temporadas: " + numeroTemporadas
                + "\nEntregado: " + entregado
                + "\nGénero: " + genero
                + "\nCreador: " + creador;
    }
}