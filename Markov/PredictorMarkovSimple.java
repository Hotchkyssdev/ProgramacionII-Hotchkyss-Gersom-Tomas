import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class PredictorMarkovSimple {
    public static void main(String[] args) throws IOException {
        File archivo = new File("Markov/texto.txt");

        if (!archivo.exists()) {
            archivo = new File("texto.txt");
        }
        if (!archivo.exists()) {
            System.out.println("No se encontró el archivo texto.txt");
            System.out.println("Directorio actual: " + System.getProperty("user.dir"));
            return;
        }

        List<String> palabras = new ArrayList<>();
        BufferedReader lector = new BufferedReader(new FileReader(archivo));
        String linea;

        while ((linea = lector.readLine()) != null) {
            linea = linea.toLowerCase().replaceAll("[.,;:!?\"()]", "");
            for (String palabra : linea.split("\\s+")) {
                if (!palabra.isEmpty()) {
                    palabras.add(palabra);
                }
            }
        }

        lector.close();

        if (palabras.size() < 2) {
            System.out.println("El archivo no contiene suficientes palabras.");
            return;
        }

        String actual = palabras.get((int) (Math.random() * palabras.size()));
        StringBuilder textoGenerado = new StringBuilder(actual);

        for (int contador = 0; contador < 20; contador++) {
            List<String> posiblesSiguientes = new ArrayList<>();
            for (int i = 0; i < palabras.size() - 1; i++) {
                if (palabras.get(i).equals(actual)) {
                    posiblesSiguientes.add(palabras.get(i + 1));
                }
            }

            if (posiblesSiguientes.isEmpty()) {
                break;
            }

            String siguiente = posiblesSiguientes.get(
                (int) (Math.random() * posiblesSiguientes.size())
            );

            textoGenerado.append(" ").append(siguiente);
            actual = siguiente;
        }
        System.out.println("Texto generado: " + textoGenerado);
    }
}