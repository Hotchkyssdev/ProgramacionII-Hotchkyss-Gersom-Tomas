package GuiaEjercicios2.Modelado.Tema2.Ejercicio2.servicio;

import java.util.ArrayList;

import GuiaEjercicios2.Modelado.Tema2.Ejercicio2.modelo.Auto;
import GuiaEjercicios2.Modelado.Tema2.Ejercicio2.modelo.Moto;
import GuiaEjercicios2.Modelado.Tema2.Ejercicio2.modelo.Vehiculo;

public class Concesionaria {
    private ArrayList<Vehiculo> vehiculos;

    public Concesionaria() {

        vehiculos = new ArrayList<>();

        vehiculos.add(
                new Auto(
                        "Toyota",
                        "Corolla",
                        20000000,
                        4
                )
        );

        vehiculos.add(
                new Auto(
                        "Ford",
                        "Focus",
                        15000000,
                        4
                )
        );

        vehiculos.add(
                new Moto(
                        "Honda",
                        "CB190",
                        8000000,
                        190
                )
        );

        vehiculos.add(
                new Moto(
                        "Yamaha",
                        "FZ",
                        9000000,
                        150
                )
        );
    }

    public void mostrarVehiculos(double descuento) {
        for (Vehiculo vehiculo : vehiculos) {
            System.out.println(
                    vehiculo.descripcion()
            );
            System.out.println(
                "Precio final: $" +
                String.format("%.2f", vehiculo.precioFinal(descuento))
         );
            System.out.println();
        }
    }
}