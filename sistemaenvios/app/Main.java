package sistemaenvios.app;
import sistemaenvios.modelo.PaqueteEstandar;
import sistemaenvios.modelo.PaqueteFragil;

public class Main {
    public static void main(String[] args) {
        CentroLogistico centro = new CentroLogistico();
        try {
            PaqueteEstandar p1 = new PaqueteEstandar("PK001", 10, "Buenos Aires", 3);
            PaqueteEstandar p2 = new PaqueteEstandar("PK002", 20, "Córdoba", 5);
            PaqueteFragil p3 = new PaqueteFragil("PK003", 4, "Rosario", "Alta");
            PaqueteFragil p4 = new PaqueteFragil("PK004", 7, "Mendoza", "Media");

            p1.actualizarDestino("La Plata");
            p2.actualizarDestino("Mar del Plata", true);

            centro.registrarPaquete(p1);
            centro.registrarPaquete(p2);
            centro.registrarPaquete(p3);
            centro.registrarPaquete(p4);

            PaqueteEstandar error = new PaqueteEstandar("", -5, "", 2);
        } catch (IllegalArgumentException e) {
            System.out.println("Error capturado: " + e.getMessage());
        }

        centro.mostrarReporteEnvios();
        System.out.println("\nRecaudación total: $" + centro.calcularRecaudacionTotal());
    }
}