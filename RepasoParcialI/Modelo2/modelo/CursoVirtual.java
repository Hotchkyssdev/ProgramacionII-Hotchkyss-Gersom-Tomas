package RepasoParcialI.Modelo2.modelo;

public class CursoVirtual extends Curso {

    private double costoPlataforma;
    private boolean plataformaActiva;

    public CursoVirtual(String codigo, String nombre, double precio,
                        int cantidadMaximaAlumnos,
                        double costoPlataforma,
                        boolean plataformaActiva) {

        super(codigo, nombre, precio, cantidadMaximaAlumnos);

        if (costoPlataforma < 0) {
            throw new IllegalArgumentException(
                    "El costo de plataforma no puede ser negativo."
            );
        }

        this.costoPlataforma = costoPlataforma;
        this.plataformaActiva = plataformaActiva;
    }

    public double getCostoPlataforma() {
        return costoPlataforma;
    }

    public boolean isPlataformaActiva() {
        return plataformaActiva;
    }

    public void setCostoPlataforma(double costoPlataforma) {
        this.costoPlataforma = costoPlataforma;
    }

    public void setPlataformaActiva(boolean plataformaActiva) {
        this.plataformaActiva = plataformaActiva;
    }

    @Override
    public double calcularCosto() {

        return getPrecio() + costoPlataforma;
    }

    @Override
    public boolean estaDisponible() {

        return plataformaActiva;
    }
}