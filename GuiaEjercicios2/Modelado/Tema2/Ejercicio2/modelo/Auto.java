package GuiaEjercicios2.Modelado.Tema2.Ejercicio2.modelo;

public class Auto extends Vehiculo {
    private int cantidadPuertas;

    public Auto(
            String marca,
            String modelo,
            double precio,
            int cantidadPuertas) {

        super(marca, modelo, precio);

        this.cantidadPuertas = cantidadPuertas;
    }

    @Override
    public String descripcion() {

        return "Auto " + marca + " " + modelo +
               " - " + cantidadPuertas + " puertas";
    }
}
