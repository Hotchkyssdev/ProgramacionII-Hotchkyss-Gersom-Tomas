package RepasoParcialI.Modelo1.modelo;

public class Camioneta extends Vehiculo implements Alquilable {

    private double costoSeguro;
    private boolean tieneCajaCarga;

    public Camioneta(String patente, String marca, double precioDiario,
                     int cantidadPasajeros, double costoSeguro,
                     boolean tieneCajaCarga) {

        super(patente, marca, precioDiario, cantidadPasajeros);

        if (costoSeguro < 0) {
            throw new IllegalArgumentException("El costo del seguro no puede ser negativo.");
        }

        this.costoSeguro = costoSeguro;
        this.tieneCajaCarga = tieneCajaCarga;
    }

    public double getCostoSeguro() {
        return costoSeguro;
    }

    public boolean isTieneCajaCarga() {
        return tieneCajaCarga;
    }

    public void setCostoSeguro(double costoSeguro) {
        this.costoSeguro = costoSeguro;
    }

    public void setTieneCajaCarga(boolean tieneCajaCarga) {
        this.tieneCajaCarga = tieneCajaCarga;
    }

    @Override
    public double calcularCosto(int dias) {

        return (getPrecioDiario() * dias) + costoSeguro;
    }

    @Override
    public boolean estaDisponible() {

        return tieneCajaCarga;
    }
}