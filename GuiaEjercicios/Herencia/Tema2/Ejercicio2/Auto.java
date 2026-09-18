package Herencia.Tema2.Ejercicio2;

public class Auto extends Vehiculo {
    private int cantidadPuertas;

    public Auto(String marca, String modelo, int anio, int cantidadPuertas) {
        super(marca, modelo, anio);
        this.cantidadPuertas = cantidadPuertas;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", Cantidad de puertas: " + cantidadPuertas;
    }
}
