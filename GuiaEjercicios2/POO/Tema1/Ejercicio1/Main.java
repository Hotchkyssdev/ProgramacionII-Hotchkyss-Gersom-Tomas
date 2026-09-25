package GuiaEjercicios2.POO.Tema1.Ejercicio1;

public class Main {
    public static void main(String[] args) {

        Calculadora calculadora = new Calculadora();

        int resultado1 = calculadora.operar(10, 20);

        double resultado2 = calculadora.operar(10.5, 20.5);

        int[] numeros = {10, 20, 30, 40};
        int resultado3 = calculadora.operar(numeros);

        System.out.println("Suma de enteros: " + resultado1);
        System.out.println("Suma de doubles: " + resultado2);
        System.out.println("Suma del arreglo: " + resultado3);

        /*
         * En la primera llamada:
         * operar(10, 20)
         * se selecciona operar(int, int).
         *
         * En la segunda llamada:
         * operar(10.5, 20.5)
         * se selecciona operar(double, double).
         *
         * En la tercera llamada:
         * operar(numeros)
         * se selecciona operar(int[]).
         *
         * Estas firmas se resuelven en tiempo de compilación,
         * porque se trata de una sobrecarga de métodos.
         */
    }
}
