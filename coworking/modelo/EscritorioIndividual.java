package coworking.modelo;

public class EscritorioIndividual extends Espacio {
    private boolean monitorExtra;

    public EscritorioIndividual(String identificador, int capacidadMaxima, double precioBaseHora, boolean monitorExtra) {
        super(identificador, capacidadMaxima, precioBaseHora);
        this.monitorExtra = monitorExtra;
    }

    public boolean isMonitorExtra() {
        return monitorExtra;
    }

    public void setMonitorExtra(boolean monitorExtra) {
        this.monitorExtra = monitorExtra;
    }

    @Override
    public double calcularCostoReserva(double horas) {
        double costo = getPrecioBaseHora() * horas;
        if (monitorExtra) {
            costo *= 1.15;
        }
        return costo;
    }

    @Override
    public boolean estaDisponible() {
        return true;
    }

    @Override
    public String obtenerDetalles() {
        return "Escritorio Individual"
                + "| ID " + getIdentificador()
                + "| Capacidad " + getCapacidadMaxima()
                + "| Precio/Hora $" + getPrecioBaseHora()
                + "| Monitor extra: " + monitorExtra;
    }
}