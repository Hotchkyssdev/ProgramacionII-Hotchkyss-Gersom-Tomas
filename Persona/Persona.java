import java.time.LocalDate;
import java.time.Period;

public class Persona {
    private String nombre;
    private LocalDate fechaNacimiento;
    private int dni;

    public String getNombre() {
        return nombre;
    }

    public LocalDate getfechaNacimiento() {
        return fechaNacimiento;
    }

    public int getDNI() {
        return dni;
    }

    public void setNombre(String nombre) {
        if (nombre == null || nombre.trim().isEmpty()) {
            throw new IllegalArgumentException("El nombre no puede estar vacío");
        }
        this.nombre = nombre;
    }

    public void setfechaNacimiento(LocalDate fechaNacimiento) {
        if (fechaNacimiento == null) {
            throw new IllegalArgumentException("La fecha de nacimiento no puede ser nula");
        }
        if (fechaNacimiento.isAfter(LocalDate.now())) {
            throw new IllegalArgumentException("La fecha de nacimiento no puede ser posterior a la fecha actual");
        }
        this.fechaNacimiento = fechaNacimiento;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public Persona(String nombre, LocalDate fechaNacimiento, int dni) {
        setNombre(nombre);
        setfechaNacimiento(fechaNacimiento);
        this.dni = dni;
    }

    public void Saludar() {
        System.out.println("Hola soy " + nombre + "! y tengo " + calcularEdad() + " años");
    }

    private int calcularEdad() {
        return Period.between(fechaNacimiento, LocalDate.now()).getYears();   
    }
}