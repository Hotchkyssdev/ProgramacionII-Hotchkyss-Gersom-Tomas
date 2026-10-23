package Unidad3.Clase13.Tema2.Ejercicio1;

public class Balanceo {
    public static String corregirBalanceo(String expresion) {

        PilaCaracteres pila = new PilaCaracteres();

        // Recorrer todos los caracteres de la expresión
        for (int i = 0; i < expresion.length(); i++) {

            char caracter = expresion.charAt(i);

            // Guardar los símbolos de apertura
            if (caracter == '(' || caracter == '[' || caracter == '{') {
                pila.push(caracter);
            }

            // Procesar los símbolos de cierre
            else if (caracter == ')' || caracter == ']' || caracter == '}') {

                // Un cierre sin apertura es irrecuperable
                if (pila.estaVacia()) {
                    throw new IllegalArgumentException(
                        "Error irrecuperable: cierre sin apertura: " + caracter
                    );
                }

                char apertura = pila.peek();

                // Comprobar que el cierre coincida con la última apertura
                if (!coinciden(apertura, caracter)) {
                    throw new IllegalArgumentException(
                        "Error irrecuperable: cierre desordenado: " + caracter
                    );
                }

                pila.pop();
            }
        }

        // Construir los cierres que faltan
        String resultado = "";

        while (!pila.estaVacia()) {

            char apertura = pila.pop();

            if (apertura == '(') {
                resultado = resultado + ')';
            } else if (apertura == '[') {
                resultado = resultado + ']';
            } else if (apertura == '{') {
                resultado = resultado + '}';
            }
        }

        return resultado;
    }

    // Verificar si una apertura coincide con un cierre
    private static boolean coinciden(char apertura, char cierre) {

        if (apertura == '(' && cierre == ')') {
            return true;
        }

        if (apertura == '[' && cierre == ']') {
            return true;
        }

        if (apertura == '{' && cierre == '}') {
            return true;
        }

        return false;
    }
}