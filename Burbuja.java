import java.util.Arrays;
 
public class Burbuja {
    public static void burbuja(int[] arreglo) {
        for(int i = 0; i < arreglo.length - 1; i++) {
            for(int j = 0; j < arreglo.length - 1 - i; j++) {
                if(arreglo[j] > arreglo[j + 1]) {
                    int aux = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = aux;
                }
            }
        }
    }

    public static void burbujaMatriz(int[][] matriz) {
        for(int fila = 0; fila < matriz.length; fila++) {
            for(int i = 0; i < matriz[fila].length - 1; i++) {
                for(int j = 0; j < matriz[fila].length - 1 - i; j++) {
                    if(matriz[fila][j] > matriz[fila][j+1]) {
                        int aux = matriz[fila][j];
                        matriz[fila][j] = matriz[fila][j+1];
                        matriz[fila][j+1] = aux;
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arreglo = {3,5,9,2,1,6,0,7};
        System.out.println("Antes del ordenamiento: " + Arrays.toString(arreglo));
        burbuja(arreglo);
        System.out.println("Despues del ordenamiento: " + Arrays.toString(arreglo));

        int[][] matriz = {
            {3,5,9,2,1,6,0,7},
            {3,5,2,1,6,0,7,9},
            {3,2,1,5,0,6,7}
        };

        System.out.println("Matriz antes del ordenamiento:");
        for (int[] fila : matriz) {
            System.out.println(Arrays.toString(fila));
        }
        burbujaMatriz(matriz);
        
        System.out.println("\nMatriz luego del ordenamiento:");
        for (int[] fila : matriz) {
            System.out.println(Arrays.toString(fila));
        }
    }
}