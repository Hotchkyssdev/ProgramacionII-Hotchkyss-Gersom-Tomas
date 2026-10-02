package coworking.modelo;

public class SalaReuniones extends Espacio {
    private double costoLimpieza;
    private boolean incluyeProyector;

    public SalaReuniones(String identificador, int capacidadMaxima, double precioBaseHora, double costoLimpieza, boolean incluyeProyector) {
        super(identificador, capacidadMaxima, precioBaseHora);
        this.costoLimpieza = costoLimpieza;
        this.incluyeProyector = incluyeProyector;
    }

    public double getCostoLimpieza() {
        return costoLimpieza;
    }

    public void setCostoLimpieza(double costoLimpieza) {
        this.costoLimpieza = costoLimpieza;
    }

    public boolean isIncluyeProyector() {
        return incluyeProyector;
    }

    public void setIncluyeProyector(boolean incluyeProyector) {
        this.incluyeProyector = incluyeProyector;
    }

    @Override
    public double calcularCostoReserva(double horas) {
        return (getPrecioBaseHora() * horas) + costoLimpieza;
    }

    @Override
    public boolean estaDisponible() {
        if (incluyeProyector && costoLimpieza == 0) {
            return false;
        }
        return true;
    }

    @Override
    public String obtenerDetalles() {
        return "Sala de Reuniones"
                + "| ID: " + getIdentificador()
                + "| Capacidad: " + getCapacidadMaxima()
                + "| Precio/Hora $" + getPrecioBaseHora()
                + "| Limpieza: $" + costoLimpieza
                + "| Proyector: " + incluyeProyector;
    }
}