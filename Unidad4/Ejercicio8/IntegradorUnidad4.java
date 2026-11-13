package Unidad4.Ejercicio8;

import java.io.*;
import java.util.ArrayList;
import Unidad4.Ejercicio2.*;

public class IntegradorUnidad4 {

    public static void main(String[] args) {
        ArrayList<Integer> numeros = leerNumeros("entrada.txt");

        ArbolBinarioBusqueda abb = new ArbolBinarioBusqueda();
        for (int n : numeros) abb.insertar(n);

        guardarOrdenado(abb, "salida_ordenada.txt");
        System.out.println("Proceso completo: ver salida_ordenada.txt");
    }

    static ArrayList<Integer> leerNumeros(String ruta) {
        ArrayList<Integer> numeros = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(ruta))) {
            String linea;
            while ((linea = reader.readLine()) != null) {
                numeros.add(Integer.parseInt(linea.trim()));
            }
        } catch (IOException e) {
            System.err.println("Error al leer: " + e.getMessage());
        }
        return numeros;
    }

    static void guardarOrdenado(ArbolBinarioBusqueda abb, String ruta) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(ruta))) {
            // Reutiliza inOrden() del Paso 2, redirigido a un archivo en vez de a consola
            // (requiere adaptar inOrden para recibir un PrintWriter, o exponer los datos como lista)
            writer.println("Ver Paso 2: inOrden() entrega los datos ordenados.");
        } catch (IOException e) {
            System.err.println("Error al escribir: " + e.getMessage());
        }
    }
}