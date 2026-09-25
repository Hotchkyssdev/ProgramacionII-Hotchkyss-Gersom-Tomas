package GuiaEjercicios2.Modelado.Tema1.Ejercicio2;

public interface Dibujable {
    String getNombre();
    double calcularArea();

    default void dibujar() {
        System.out.println("Figura: " + getNombre()
                + " - Área: " + calcularArea());
    }
}