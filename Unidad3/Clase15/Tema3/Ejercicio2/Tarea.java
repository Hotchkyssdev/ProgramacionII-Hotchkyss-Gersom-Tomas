package Unidad3.Clase15.Tema3.Ejercicio2;

public class Tarea {
    private String descripcion;
    private int prioridad;
    private int fechaLimite;

    public Tarea(String descripcion, int prioridad, int fechaLimite) {
        if (prioridad < 1 || prioridad > 5) {
            throw new IllegalArgumentException(
                "La prioridad debe estar entre 1 y 5."
            );
        }

        if (fechaLimite < 0) {
            throw new IllegalArgumentException(
                "Los días restantes no pueden ser negativos."
            );
        }

        this.descripcion = descripcion;
        this.prioridad = prioridad;
        this.fechaLimite = fechaLimite;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int getPrioridad() {
        return prioridad;
    }

    public int getFechaLimite() {
        return fechaLimite;
    }

    @Override
    public String toString() {
        return "Tarea: " + descripcion
                + " | Prioridad: " + prioridad
                + " | Dias restantes: " + fechaLimite;
    }
}