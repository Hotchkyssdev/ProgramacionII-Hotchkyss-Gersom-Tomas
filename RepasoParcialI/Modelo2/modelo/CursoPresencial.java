package RepasoParcialI.Modelo2.modelo;

public class CursoPresencial extends Curso {

    private double costoMateriales;

    public CursoPresencial(String codigo, String nombre, double precio,
                           int cantidadMaximaAlumnos,
                           double costoMateriales) {

        super(codigo, nombre, precio, cantidadMaximaAlumnos);

        if (costoMateriales < 0) {
            throw new IllegalArgumentException(
                    "El costo de materiales no puede ser negativo."
            );
        }

        this.costoMateriales = costoMateriales;
    }

    public double getCostoMateriales() {
        return costoMateriales;
    }

    public void setCostoMateriales(double costoMateriales) {
        this.costoMateriales = costoMateriales;
    }

    @Override
    public double calcularCosto() {

        return getPrecio() + costoMateriales;
    }

    @Override
    public boolean estaDisponible() {

        return true;
    }
}