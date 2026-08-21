public class Tema2_Ej1 {

    /*
     * Este método intenta intercambiar los valores de a y b.
     *
     * En Java, los parámetros de tipo primitivo como int se pasan por valor.
     * Esto significa que el método recibe una copia de los valores originales.
     *
     * Por lo tanto, aunque dentro del método se intercambien las copias,
     * las variables originales de main no cambian.
     */

    public static void intercambiar(int a, int b) {
        int auxiliar = a;
        a = b;
        b = auxiliar;

        System.out.println("Dentro del método:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }

    public static void main(String[] args) {

        int a = 10;
        int b = 20;

        System.out.println("Antes de llamar al método:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        intercambiar(a, b);

        System.out.println();
        System.out.println("Después de llamar al método:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
