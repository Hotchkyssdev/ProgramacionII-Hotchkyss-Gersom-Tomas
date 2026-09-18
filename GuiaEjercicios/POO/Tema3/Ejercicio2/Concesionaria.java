package POO.Tema3.Ejercicio2;

import java.util.ArrayList;

public class Concesionaria {
    private String nombre;
    private ArrayList<Vehiculo> vehiculos;

    public Concesionaria(String nombre) {
        this.nombre = nombre;
        this.vehiculos = new ArrayList<>();
    }

    public void agregarVehiculo(Vehiculo vehiculo) {
        vehiculos.add(vehiculo);
    }

    public Vehiculo buscarPorMarca(String marca) {
        for(Vehiculo vehiculo : vehiculos) {
            if (vehiculo.getMarca().equalsIgnoreCase(marca)) {
                return vehiculo;
            }
        }
        return null;
    }

    public double valorTotalStock() {
        double total = 0;

        for (Vehiculo vehiculo : vehiculos) {
            total += vehiculo.getPrecio();
        }
        return total;
    }
}