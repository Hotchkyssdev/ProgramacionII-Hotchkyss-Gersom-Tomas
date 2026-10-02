package sistemaenvios.app;
import sistemaenvios.modelo.Enviable;
import sistemaenvios.modelo.Paquete;
import java.util.ArrayList;

public class CentroLogistico {
    private ArrayList<Enviable> inventario;

    public CentroLogistico() {
        inventario = new ArrayList<>();
    }

    public void registrarPaquete(Enviable e) {
        inventario.add(e);
    }

    public void mostrarReporteEnvios() {
        System.out.println("\n===== REPORTE =====");
        for (Enviable e : inventario) {
            Paquete p = (Paquete) e;
            System.out.println(p.obtenerDetalle());
            System.out.println("Costo: $" + e.calcularCostoEnvio());
            System.out.println("Apto aéreo: " + e.esAptoParaEnvioAereo());
            System.out.println("--------------------");
        }
    }

    public double calcularRecaudacionTotal() {
        double total = 0;
        for (Enviable e : inventario) {
            total += e.calcularCostoEnvio();
        }
        return total;
    }
}