package Markov2;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PredictorMarkovSimple {
    public static void main(String[] args) throws IOException {
        // Leer todo el texto del archivo
        StringBuilder contenido = new StringBuilder();

        BufferedReader lector = new BufferedReader(
            new FileReader("Markov2\\texto.txt")
        );

        String linea;

        while ((linea = lector.readLine()) != null) {
            contenido.append(linea.toLowerCase()).append(" ");
        }

        lector.close();

        String texto = contenido.toString();

        // Elegir el orden k
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese el valor de k: ");
        int k = entrada.nextInt();

        if (k < 1 || k >= texto.length()) {
            System.out.println("Valor de k incorrecto.");
            entrada.close();
            return;
        }

        // Elegir un fragmento inicial al azar
        int inicio = (int) (Math.random() * (texto.length() - k));

        String actual = texto.substring(inicio, inicio + k);

        StringBuilder textoGenerado = new StringBuilder(actual);

        // Generar 20 caracteres nuevos
        for (int contador = 0; contador < 20; contador++) {

            List<Character> posiblesSiguientes = new ArrayList<>();

            // Buscar todas las apariciones del fragmento actual
            for (int i = 0; i <= texto.length() - k - 1; i++) {

                String fragmento = texto.substring(i, i + k);

                if (fragmento.equals(actual)) {
                    posiblesSiguientes.add(texto.charAt(i + k));
                }
            }

            // Si no existen caracteres siguientes, finalizar
            if (posiblesSiguientes.isEmpty()) {
                break;
            }

            // Elegir un carácter siguiente al azar
            char siguiente = posiblesSiguientes.get(
                (int) (Math.random() * posiblesSiguientes.size())
            );

            textoGenerado.append(siguiente);

            // Actualizar la ventana deslizante:
            // eliminar el primer carácter y agregar el nuevo
            actual = actual.substring(1) + siguiente;
        }

        System.out.println("Texto generado con k = " + k + ":");
        System.out.println(textoGenerado);

        entrada.close();
    }
}