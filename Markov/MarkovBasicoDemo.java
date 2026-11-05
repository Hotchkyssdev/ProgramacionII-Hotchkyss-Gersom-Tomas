import java.util.ArrayList;
import java.util.List;

public class MarkovBasicoDemo {
    public static void main(String[] args) {
        // 1. Simulamos el texto ya limpio convertido en una lista de palabras
        List<String> palabras = List.of("el", "perro", "corre", "y", "el", "perro", "duerme");

        // 2. Palabra de partida elegida al azar
        String actual = "el";
        System.out.print(actual);

        // Generamos 5 palabras siguientes
        for (int paso = 0; paso < 5; paso++) {
            
            // 3. RECUPERAR / REGISTRAR: Buscamos todas las palabras que siguieron a "actual"
            List<String> posiblesSiguientes = new ArrayList<>();
            for (int i = 0; i < palabras.size() - 1; i++) {
                if (palabras.get(i).equals(actual)) {
                    // Anotamos la palabra que vino inmediatamente después
                    posiblesSiguientes.add(palabras.get(i + 1)); 
                }
            }

            // Si no tiene registro, salimos
            if (posiblesSiguientes.isEmpty()) {
                break;
            }

            // 4. ELEGIR AL AZAR (La repetición natural en la lista da el peso estadístico)
            int indiceAleatorio = (int) (Math.random() * posiblesSiguientes.size());
            String siguiente = posiblesSiguientes.get(indiceAleatorio);

            // Imprimimos y avanzamos
            System.out.print(" " + siguiente);
            actual = siguiente;
        }
    }
}