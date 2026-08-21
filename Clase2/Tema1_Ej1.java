public class Tema1_Ej1 {
    
    /*
     * tablaDeMultiplicar(int n) es un PROCEDIMIENTO según la terminología
     * de Programación I porque no devuelve ningún valor; su tipo de retorno
     * es void y solamente realiza una acción: imprimir la tabla.
     *
     * promedio(int[] valores) es una FUNCIÓN porque devuelve un valor,
     * en este caso un double que representa el promedio de los elementos.
     *
     * En Java esta distinción no existe a nivel de sintaxis. Ambos se
     * implementan como métodos y se diferencian principalmente por su
     * tipo de retorno: void si no devuelven un valor o un tipo de dato
     * si devuelven un resultado.
     */

    public static void tablaDeMultiplicar(int n) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + (n * i));
        }
    }

    public static double promedio(int[] valores) {
        int suma = 0;

        for (int valor : valores) {
            suma += valor;
        }

        return (double) suma / valores.length;
    }

    public static void main(String[] args) {

        int numero = 5;

        System.out.println("Tabla de multiplicar del " + numero + ":");
        tablaDeMultiplicar(numero);

        int[] valores = {10, 8, 7, 9, 6};

        double resultado = promedio(valores);

        System.out.println();
        System.out.println("Promedio: " + resultado);
    }
}