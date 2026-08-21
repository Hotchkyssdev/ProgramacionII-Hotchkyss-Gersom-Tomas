public class Tema3_Ej1 {
    
    /*
     * Método recursivo que calcula la suma de los dígitos de un
     * número entero positivo.
     *
     * Ejemplo:
     * 1234 -> 1 + 2 + 3 + 4 = 10
     */

    public static int sumarDigitos(int n) {

        // CASO BASE: cuando el número tiene un solo dígito,
        // se devuelve directamente ese dígito.
        if (n < 10) {
            return n;
        }

        // CASO RECURSIVO: se suma el último dígito del número
        // con el resultado de sumar los dígitos restantes.
        return (n % 10) + sumarDigitos(n / 10);
    }

    public static void main(String[] args) {

        int numero = 1234;

        int resultado = sumarDigitos(numero);

        System.out.println("Número: " + numero);
        System.out.println("Suma de sus dígitos: " + resultado);
    }
}
