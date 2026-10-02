package coworking.modelo;

public abstract class Espacio implements Reservable {
    private String identificador;
    private int capacidadMaxima;
    private double precioBaseHora;

    public Espacio(String identificador, int capacidadMaxima, double precioBaseHora) {
        setIdentificador(identificador);
        setCapacidadMaxima(capacidadMaxima);
        setPrecioBaseHora(precioBaseHora);
    }

    public String getIdentificador() {
        return identificador;
    }

    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public double getPrecioBaseHora() {
        return precioBaseHora;
    }

    public void setIdentificador(String identificador) {
        if (identificador == null || identificador.trim().isEmpty()) {
            throw new IllegalArgumentException("El identificador no puede ser nulo ni estar vacío");
        }
        this.identificador = identificador;
    }

    public void setCapacidadMaxima(int capacidadMaxima) {
        if (capacidadMaxima <= 0) {
            throw new IllegalArgumentException("La capacidad debe ser mayor a cero");
        }
        this.capacidadMaxima = capacidadMaxima;
    }

    public void setPrecioBaseHora(double precioBaseHora) {
        if (precioBaseHora <= 0) {
            throw new IllegalArgumentException("El precio base debe ser mayor a cero");
        }
        this.precioBaseHora = precioBaseHora;
    }

    public void actualizarCapacidad(int nuevaCapacidad) {
        setCapacidadMaxima(nuevaCapacidad);
    }

    public void actualizarCapacidad(int nuevaCapacidad, boolean mobiliarioEspecial) {
        setCapacidadMaxima(nuevaCapacidad);
        if (mobiliarioEspecial) {
            identificador += " [Mobiliario Especial]";
        }
    }

    public abstract String obtenerDetalles();
}