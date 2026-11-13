package Unidad4.Ejercicio6;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LectorProductos {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader("productos.csv"))) {
            String linea;
            while ((linea = reader.readLine()) != null) {
                String[] campos = linea.split(",");
                System.out.println("Producto: " + campos[0] + " - Precio: $" + campos[1]);
            }
        } catch (IOException e) {
            System.err.println("No se pudo leer el archivo: " + e.getMessage());
        }
    }
}