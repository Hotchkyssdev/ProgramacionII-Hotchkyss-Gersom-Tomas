public class Papel {

    private String texto;

    // Constructor
    public Papel() {
        texto = "";
    }

    // Escribe y agrega texto al papel
    public void escribir(String texto) {
        this.texto += texto;
    }

    @Override
    public String toString() {
        return texto;
    }
}