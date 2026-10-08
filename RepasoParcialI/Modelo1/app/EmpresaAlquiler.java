package RepasoParcialI.Modelo1.app;

import RepasoParcialI.Modelo1.modelo.Vehiculo;

import java.util.ArrayList;

public class EmpresaAlquiler {

    private ArrayList<Vehiculo> vehiculos;

    public EmpresaAlquiler() {
        vehiculos = new ArrayList<>();
    }

    public void registrarVehiculo(Vehiculo vehiculo) {
        vehiculos.add(vehiculo);
    }

    public void mostrarReporte(int dias) {

        System.out.println("===== REPORTE DE ALQUILER =====");

        for (Vehiculo vehiculo : vehiculos) {

            System.out.println("Tipo: " + vehiculo.getClass().getSimpleName());
            System.out.println("Patente: " + vehiculo.getPatente());
            System.out.println("Marca: " + vehiculo.getMarca());
            System.out.println("Pasajeros: " + vehiculo.getCantidadPasajeros());

            /* Necesitamos verificar disponibilidad.
            Como Vehiculo no tiene el método estaDisponible(),
            debemos trabajar con Alquilable. */

            if (vehiculo instanceof RepasoParcialI.Modelo1.modelo.Alquilable) {

                RepasoParcialI.Modelo1.modelo.Alquilable alquilable = (RepasoParcialI.Modelo1.modelo.Alquilable) vehiculo;

                System.out.println("Disponible: " + alquilable.estaDisponible());
                System.out.println("Costo: $" + alquilable.calcularCosto(dias));
            }

            System.out.println("-----------------------------");
        }
    }

    public double calcularRecaudacionTotal(int dias) {

        double total = 0;

        for (Vehiculo vehiculo : vehiculos) {

            if (vehiculo instanceof RepasoParcialI.Modelo1.modelo.Alquilable) {

                RepasoParcialI.Modelo1.modelo.Alquilable alquilable = (RepasoParcialI.Modelo1.modelo.Alquilable) vehiculo;

                if (alquilable.estaDisponible()) {
                    total += alquilable.calcularCosto(dias);
                }
            }
        }

        return total;
    }
}