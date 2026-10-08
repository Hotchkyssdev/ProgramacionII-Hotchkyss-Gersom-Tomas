package RepasoParcialI.Modelo1.app;

import RepasoParcialI.Modelo1.modelo.Auto;
import RepasoParcialI.Modelo1.modelo.Camioneta;

public class Main {

    public static void main(String[] args) {

        EmpresaAlquiler empresa = new EmpresaAlquiler();

        Auto auto1 = new Auto(
                "ABC123",
                "Toyota",
                10000,
                5,
                true
        );

        Auto auto2 = new Auto(
                "DEF456",
                "Ford",
                8000,
                5,
                false
        );

        Camioneta camioneta1 = new Camioneta(
                "GHI789",
                "Ford",
                15000,
                5,
                5000,
                true
        );

        Camioneta camioneta2 = new Camioneta(
                "JKL012",
                "Chevrolet",
                18000,
                6,
                7000,
                false
        );

        empresa.registrarVehiculo(auto1);
        empresa.registrarVehiculo(auto2);
        empresa.registrarVehiculo(camioneta1);
        empresa.registrarVehiculo(camioneta2);

        // Probamos la primera sobrecarga
        auto1.actualizarPasajeros(4);

        // Probamos la segunda sobrecarga
        auto2.actualizarPasajeros(4, true);

        // Probamos una excepción
        try {

            Auto autoInvalido = new Auto(
                    "",
                    "Fiat",
                    10000,
                    5,
                    false
            );

        } catch (IllegalArgumentException e) {

            System.out.println(
                    "Error al crear vehículo: " + e.getMessage()
            );
        }

        System.out.println();

        // Reporte
        empresa.mostrarReporte(5);

        // Recaudación
        double total = empresa.calcularRecaudacionTotal(5);

        System.out.println();
        System.out.println("Recaudación total: $" + total);
    }
}