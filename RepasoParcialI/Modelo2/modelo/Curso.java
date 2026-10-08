package RepasoParcialI.Modelo2.modelo;

public abstract class Curso implements Registrable {

    private String codigo;
    private String nombre;
    private double precio;
    private int cantidadMaximaAlumnos;

    public Curso(String codigo, String nombre, double precio,
                 int cantidadMaximaAlumnos) {

        if (codigo == null || codigo.isEmpty()) {
            throw new IllegalArgumentException("El código no puede estar vacío.");
        }

        if (nombre == null || nombre.isEmpty()) {
            throw new IllegalArgumentException("El nombre no puede estar vacío.");
        }

        if (precio <= 0) {
            throw new IllegalArgumentException("El precio debe ser mayor a cero.");
        }

        if (cantidadMaximaAlumnos <= 0) {
            throw new IllegalArgumentException(
                    "La cantidad de alumnos debe ser mayor a cero."
            );
        }

        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.cantidadMaximaAlumnos = cantidadMaximaAlumnos;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public int getCantidadMaximaAlumnos() {
        return cantidadMaximaAlumnos;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setCantidadMaximaAlumnos(int cantidadMaximaAlumnos) {
        this.cantidadMaximaAlumnos = cantidadMaximaAlumnos;
    }

    public void actualizarCapacidad(int nuevaCapacidad) {

        if (nuevaCapacidad <= 0) {
            throw new IllegalArgumentException(
                    "La capacidad debe ser mayor a cero."
            );
        }

        this.cantidadMaximaAlumnos = nuevaCapacidad;
    }

    public void actualizarCapacidad(int nuevaCapacidad,
                                    boolean modalidadIntensiva) {

        actualizarCapacidad(nuevaCapacidad);

        if (modalidadIntensiva) {
            this.nombre = this.nombre + " - Modalidad Intensiva";
        }
    }
}