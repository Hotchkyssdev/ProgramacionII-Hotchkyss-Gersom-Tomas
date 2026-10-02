package coworking.app;
import coworking.modelo.EscritorioIndividual;
import coworking.modelo.SalaReuniones;

public class Main {
    public static void main(String[] args) {
        CentroCoWorking centro = new CentroCoWorking();

        EscritorioIndividual escritorio1 = new EscritorioIndividual("E01", 1, 3000, true);
        EscritorioIndividual escritorio2 = new EscritorioIndividual("E02", 1, 2500, false);
        SalaReuniones sala1 = new SalaReuniones("S01", 8, 8000, 3000, true);
        SalaReuniones sala2 = new SalaReuniones("S02", 12, 10000, 0, false);

        escritorio1.actualizarCapacidad(2);
        sala1.actualizarCapacidad(10, true);

        centro.registrarEspacio(escritorio1);
        centro.registrarEspacio(escritorio2);
        centro.registrarEspacio(sala1);
        centro.registrarEspacio(sala2);

        try {
            EscritorioIndividual espacioinvalido = new EscritorioIndividual("", 0, -500, false);
        } catch (IllegalArgumentException e) {
            System.out.println("Excepción capturada: " + e.getMessage());
        }

        double horas = 4;
        System.out.println();
        centro.mostrarReporte(horas);
        System.out.println("Recaudación total por " + horas + " horas: $" + centro.calcularRecaudacionTotal(horas));
    }
}