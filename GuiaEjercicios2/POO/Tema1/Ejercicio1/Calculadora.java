package GuiaEjercicios2.POO.Tema1.Ejercicio1;

public class Calculadora {
    // Suma dos números enteros
    public int operar(int numero1, int numero2) {
        return numero1 + numero2;
    }

    // Suma dos números decimales
    public double operar(double numero1, double numero2) {
        return numero1 + numero2;
    }

    // Suma todos los valores de un arreglo de enteros
    public int operar(int[] numeros) {
        int resultado = 0;
        for (int numero : numeros) {
            resultado += numero;
        }
        return resultado;
    }
}