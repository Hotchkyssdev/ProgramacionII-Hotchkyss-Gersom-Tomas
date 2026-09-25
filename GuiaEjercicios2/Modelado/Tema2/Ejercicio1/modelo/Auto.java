package GuiaEjercicios2.Modelado.Tema2.Ejercicio1.modelo;

public class Auto extends Vehiculo {
    private int cantidadPuertas;

    public Auto(String marca, String modelo, int cantidadPuertas) {
        super(marca, modelo);
        this.cantidadPuertas = cantidadPuertas;
    }

    @Override
    public String toString() {
        return marca + " " + modelo +
               " - Puertas: " + cantidadPuertas;
    }
}