package Unidad4.Ejercicio7;

import java.io.Serializable;

public class Producto implements Serializable {
    private static final long serialVersionUID = 1L; // identifica la versión de la clase

    private String nombre;
    private double precio;

    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    @Override
    public String toString() { return nombre + " - $" + precio; }
}