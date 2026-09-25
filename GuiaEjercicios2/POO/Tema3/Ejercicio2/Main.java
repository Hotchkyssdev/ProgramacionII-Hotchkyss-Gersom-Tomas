package GuiaEjercicios2.POO.Tema3.Ejercicio2;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Figura> figuras = new ArrayList<>();

        figuras.add(new Circulo(5));
        figuras.add(new Rectangulo(10, 4));
        figuras.add(new Triangulo(8, 6));
        figuras.add(new Circulo(3));

        System.out.println("ANTES DE ORDENAR:");

        for (Figura figura : figuras) {
            System.out.println(figura);
        }

        Collections.sort(figuras);

        System.out.println();
        System.out.println("DESPUÉS DE ORDENAR POR ÁREA:");

        for (Figura figura : figuras) {
            System.out.println(figura);
        }

        System.out.println();
        System.out.println("DIBUJANDO FIGURAS:");

        for (Figura figura : figuras) {
            figura.dibujar();
        }
    }
}