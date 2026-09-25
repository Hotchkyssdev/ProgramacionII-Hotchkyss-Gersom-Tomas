package GuiaEjercicios2.POO.Tema3.Ejercicio2;

public interface Dibujable {
    String getNombre();
    double calcularArea();

    default void dibujar() {
        System.out.println("Figura: " + getNombre() +
                           " - Área: " + calcularArea());
    }
}