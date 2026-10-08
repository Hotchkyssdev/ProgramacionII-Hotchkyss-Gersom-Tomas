package RepasoParcialI.Modelo1.modelo;

public abstract class Vehiculo {

    private String patente;
    private String marca;
    private double precioDiario;
    private int cantidadPasajeros;

    public Vehiculo(String patente, String marca, double precioDiario, int cantidadPasajeros) {

        if (patente == null || patente.isEmpty()) {
            throw new IllegalArgumentException("La patente no puede estar vacía.");
        }

        if (marca == null || marca.isEmpty()) {
            throw new IllegalArgumentException("La marca no puede estar vacía.");
        }

        if (precioDiario <= 0) {
            throw new IllegalArgumentException("El precio diario debe ser mayor a cero.");
        }

        if (cantidadPasajeros <= 0) {
            throw new IllegalArgumentException("La cantidad de pasajeros debe ser mayor a cero.");
        }

        this.patente = patente;
        this.marca = marca;
        this.precioDiario = precioDiario;
        this.cantidadPasajeros = cantidadPasajeros;
    }

    public String getPatente() {
        return patente;
    }

    public String getMarca() {
        return marca;
    }

    public double getPrecioDiario() {
        return precioDiario;
    }

    public int getCantidadPasajeros() {
        return cantidadPasajeros;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setPrecioDiario(double precioDiario) {
        this.precioDiario = precioDiario;
    }

    public void setCantidadPasajeros(int cantidadPasajeros) {
        this.cantidadPasajeros = cantidadPasajeros;
    }

    public void actualizarPasajeros(int nuevaCantidad) {
        if (nuevaCantidad <= 0) {
            throw new IllegalArgumentException("La cantidad debe ser mayor a cero.");
        }

        this.cantidadPasajeros = nuevaCantidad;
    }

    public void actualizarPasajeros(int nuevaCantidad, boolean agregarEquipamiento) {

        actualizarPasajeros(nuevaCantidad);

        if (agregarEquipamiento) {
            this.marca = this.marca + " - Equipamiento Especial";
        }
    }
}