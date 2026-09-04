public class Libro {

    private String ISBN;
    private String titulo;
    private String autor;
    private int numeroPaginas;

    // Constructor
    public Libro(String ISBN, String titulo, String autor, int numeroPaginas) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
    }

    // Getters
    public String getISBN() {
        return ISBN;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    // Setters
    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    @Override
    public String toString() {
        return "El libro con ISBN " + ISBN + " creado por " + autor
                + " tiene " + numeroPaginas + " páginas";
    }

    public static void main(String[] args) {

        Libro libro1 = new Libro(
                "978-950-04-1234-5",
                "El Principito",
                "Antoine de Saint-Exupéry",
                96
        );

        Libro libro2 = new Libro(
                "978-987-566-7890-1",
                "Don Quijote de la Mancha",
                "Miguel de Cervantes",
                863
        );

        System.out.println(libro1);
        System.out.println(libro2);

        if (libro1.getNumeroPaginas() > libro2.getNumeroPaginas()) {
            System.out.println("El libro 1 tiene más páginas.");
        } else if (libro2.getNumeroPaginas() > libro1.getNumeroPaginas()) {
            System.out.println("El libro 2 tiene más páginas.");
        } else {
            System.out.println("Ambos libros tienen la misma cantidad de páginas.");
        }
    }
}