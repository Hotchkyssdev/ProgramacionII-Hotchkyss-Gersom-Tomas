package coworking.modelo;

public interface Reservable {
    double calcularCostoReserva(double horas);
    boolean estaDisponible();
}