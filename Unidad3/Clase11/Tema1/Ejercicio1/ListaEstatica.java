package Unidad3.Clase11.Tema1.Ejercicio1;

public class ListaEstatica {
    private int[] datos;
    private int cantidad;

    public ListaEstatica(int capacidad) {
        if (capacidad <= 0) {
            throw new IllegalArgumentException("La capacidad debe ser mayor que cero");
        }
        datos = new int[capacidad];
        cantidad = 0;
    }

    public void insertar(int valor) {
        if (cantidad == datos.length) {
            throw new IllegalStateException("La lista esta llena");
        }
        datos[cantidad] = valor;
        cantidad++;
    }

    public int buscar(int valor) {
        for (int i = 0; i < cantidad; i++) {
            if (datos[i] == valor) {
                return i;
            }
        }
        return -1;
    }

    public void mostrar() {
        System.out.print("[");
        for (int i = 0; i < cantidad; i++) {
            System.out.print(datos[i]);

            if (i < cantidad - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}