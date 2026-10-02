package coworking.app;
import coworking.modelo.Espacio;
import coworking.modelo.Reservable;
import java.util.ArrayList;

public class CentroCoWorking {
    private ArrayList<Reservable> espacios;

    public CentroCoWorking() {
        espacios = new ArrayList<>();
    }

    public void registrarEspacio(Reservable espacio) {
        espacios.add(espacio);
    }

    public void mostrarReporte(double horas) {
        System.out.println("\n===== REPORTE DE RESERVAS =====");
        for (Reservable reservable : espacios) {
            Espacio espacio = (Espacio) reservable;
            System.out.println(espacio.obtenerDetalles());
            System.out.println("Costo por " + horas + " horas: $" + reservable.calcularCostoReserva(horas));
            System.out.println("Disponible: " + reservable.estaDisponible());
            System.out.println("-------------------------");
        }
    }

    public double calcularRecaudacionTotal(double horas) {
        double total = 0;
        for (Reservable reservable : espacios) {
            total += reservable.calcularCostoReserva(horas);
        }
        return total;
    }
}