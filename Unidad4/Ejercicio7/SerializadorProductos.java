package Unidad4.Ejercicio7;

import java.io.*;
import java.util.ArrayList;

public class SerializadorProductos {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ArrayList<Producto> productos = new ArrayList<>();
        productos.add(new Producto("Teclado", 25000));
        productos.add(new Producto("Mouse", 12000));

        // Guardar la lista completa de objetos en un archivo binario
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("productos.dat"))) {
            oos.writeObject(productos);
        }

        // Recuperarla tal cual estaba
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("productos.dat"))) {
            @SuppressWarnings("unchecked")
            ArrayList<Producto> recuperados = (ArrayList<Producto>) ois.readObject();
            System.out.println("Productos recuperados: " + recuperados);
        }
    }
}