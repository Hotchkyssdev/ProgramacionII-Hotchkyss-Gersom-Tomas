package Unidad3.Clase15.Tema3.Ejercicio1;
import java.util.Objects;

public class Alumno {
    private String dni;
    private String nombre;
    private String carrera;

    public Alumno(String dni, String nombre, String carrera) {
        this.dni = dni;
        this.nombre = nombre;
        this.carrera = carrera;
    }

    public String getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCarrera() {
        return carrera;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        Alumno otro = (Alumno) obj;

        return Objects.equals(this.dni, otro.dni);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dni);
    }

    @Override
    public String toString() {
        return "DNI: " + dni
                + " | Nombre: " + nombre
                + " | Carrera: " + carrera;
    }
}