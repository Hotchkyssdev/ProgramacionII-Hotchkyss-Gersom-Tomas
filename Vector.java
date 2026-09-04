import java.util.Arrays;

public class Vector {

    private int[] elementos;

    // Constructor
    public Vector(int[] elementos) {
        this.elementos = elementos;
    }

    // Getter
    public int[] getElementos() {
        return elementos;
    }

    // Setter
    public void setElementos(int[] elementos) {
        this.elementos = elementos;
    }

    // Multiplica todos los elementos por un número
    public Vector multiplicar(int numero) {

        int[] resultado = new int[elementos.length];

        for (int i = 0; i < elementos.length; i++) {
            resultado[i] = elementos[i] * numero;
        }

        return new Vector(resultado);
    }

    // Suma dos vectores
    public Vector sumar(Vector otro) {

        if (this.elementos.length != otro.elementos.length) {
            System.out.println("Error: los vectores tienen diferente cantidad de elementos.");
            return otro;
        }

        int[] resultado = new int[elementos.length];

        for (int i = 0; i < elementos.length; i++) {
            resultado[i] = this.elementos[i] + otro.elementos[i];
        }

        return new Vector(resultado);
    }

    @Override
    public String toString() {
        return Arrays.toString(elementos);
    }

    public static void main(String[] args) {

        Vector vector1 = new Vector(new int[]{1, 2, 3});
        Vector vector2 = new Vector(new int[]{4, 5, 6});

        System.out.println("Vector 1: " + vector1);
        System.out.println("Vector 2: " + vector2);

        Vector multiplicado = vector1.multiplicar(2);
        System.out.println("Vector 1 multiplicado por 2: " + multiplicado);

        Vector suma = vector1.sumar(vector2);
        System.out.println("Suma: " + suma);
    }
}