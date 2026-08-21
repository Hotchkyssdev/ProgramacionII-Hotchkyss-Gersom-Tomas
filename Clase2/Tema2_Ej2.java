import java.util.Arrays;

public class Tema2_Ej2 {

    /*
     * Los arreglos se pasan por valor en Java, pero lo que se copia
     * es la referencia al mismo objeto arreglo.
     *
     * Por eso, tanto la variable original como el parámetro arr
     * apuntan al mismo arreglo en memoria. Al modificar sus elementos
     * dentro del método, los cambios se reflejan en el arreglo original.
     *
     * Sin embargo, si dentro del método se asignara:
     *
     * arr = new int[]{...};
     *
     * solamente se modificaría la copia de la referencia que posee
     * el parámetro. El arreglo original seguiría apuntando al objeto
     * anterior.
     */

    public static void duplicarValores(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] * 2;
        }
    }

    public static void main(String[] args) {

        int[] valores = {1, 2, 3, 4, 5};

        System.out.println("Arreglo antes de llamar al método:");
        System.out.println(Arrays.toString(valores));

        duplicarValores(valores);

        System.out.println();
        System.out.println("Arreglo después de llamar al método:");
        System.out.println(Arrays.toString(valores));
    }
}
