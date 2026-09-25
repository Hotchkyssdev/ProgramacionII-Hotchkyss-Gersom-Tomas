package GuiaEjercicios2.Modelado.Tema2.Ejercicio2;

import GuiaEjercicios2.Modelado.Tema2.Ejercicio2.servicio.Concesionaria;

public class Main {
    public static void main(String[] args) {
        Concesionaria concesionaria =
                new Concesionaria();

        double descuento = 10;

        concesionaria.mostrarVehiculos(descuento);
    }
}