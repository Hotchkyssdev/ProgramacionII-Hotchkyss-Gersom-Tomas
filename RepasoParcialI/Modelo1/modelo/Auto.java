package RepasoParcialI.Modelo1.modelo;

public class Auto extends Vehiculo implements Alquilable {

    private boolean tieneGPS;

    public Auto(String patente, String marca, double precioDiario,
                int cantidadPasajeros, boolean tieneGPS) {

        super(patente, marca, precioDiario, cantidadPasajeros);

        this.tieneGPS = tieneGPS;
    }

    public boolean isTieneGPS() {
        return tieneGPS;
    }

    public void setTieneGPS(boolean tieneGPS) {
        this.tieneGPS = tieneGPS;
    }

    @Override
    public double calcularCosto(int dias) {

        double costo = getPrecioDiario() * dias;

        if (tieneGPS) {
            costo = costo * 1.10;
        }

        return costo;
    }

    @Override
    public boolean estaDisponible() {
        return true;
    }
}