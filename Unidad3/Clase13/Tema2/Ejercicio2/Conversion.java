package Unidad3.Clase13.Tema2.Ejercicio2;

public class Conversion {
    public static String infijaAPostfija(String expresion) {
        PilaOperadores pila = new PilaOperadores();
        String resultado = "";

        for (int i = 0; i < expresion.length(); i++) {

            char caracter = expresion.charAt(i);

            // Si es un operando, se agrega directamente a la salida
            if (caracter >= '0' && caracter <= '9') {
                resultado = resultado + caracter;
            }

            // Si es un paréntesis de apertura, se apila
            else if (caracter == '(') {
                pila.push(caracter);
            }

            // Si es un paréntesis de cierre, desapilar hasta '('
            else if (caracter == ')') {

                while (!pila.estaVacia() && pila.peek() != '(') {
                    resultado = resultado + pila.pop();
                }

                if (pila.estaVacia()) {
                    throw new IllegalArgumentException(
                        "Error: falta un paréntesis de apertura."
                    );
                }

                // Descartar el paréntesis de apertura
                pila.pop();
            }

            // Si es un operador
            else if (esOperador(caracter)) {

                while (!pila.estaVacia()
                        && pila.peek() != '('
                        && precedencia(pila.peek()) >= precedencia(caracter)) {

                    resultado = resultado + pila.pop();
                }

                pila.push(caracter);
            }

            else {
                throw new IllegalArgumentException(
                    "Carácter no válido: " + caracter
                );
            }
        }

        // Desapilar los operadores restantes
        while (!pila.estaVacia()) {

            char operador = pila.pop();

            if (operador == '(') {
                throw new IllegalArgumentException(
                    "Error: falta un paréntesis de cierre."
                );
            }

            resultado = resultado + operador;
        }

        return resultado;
    }

    // Determinar si el carácter es un operador válido
    private static boolean esOperador(char caracter) {

        return caracter == '+'
                || caracter == '-'
                || caracter == '*'
                || caracter == '/';
    }

    // Determinar la precedencia de los operadores
    private static int precedencia(char operador) {

        if (operador == '+' || operador == '-') {
            return 1;
        }

        if (operador == '*' || operador == '/') {
            return 2;
        }

        return 0;
    }
}