package Unidad4.Ejercicio6;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class EscritorProductos {
    public static void main(String[] args) {
        String[] productos = { "Teclado,25000", "Mouse,12000", "Monitor,180000" };

        // try-with-resources: el "writer" se cierra solo al salir del bloque
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("productos.csv"))) {
            for (String linea : productos) {
                writer.write(linea);
                writer.newLine();
            }
            System.out.println("Archivo generado correctamente.");
        } catch (IOException e) {
            System.err.println("Error al escribir el archivo: " + e.getMessage());
        }
    }
}