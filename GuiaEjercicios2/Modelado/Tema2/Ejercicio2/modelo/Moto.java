package GuiaEjercicios2.Modelado.Tema2.Ejercicio2.modelo;

public class Moto extends Vehiculo {
    private int cilindrada;

    public Moto(
            String marca,
            String modelo,
            double precio,
            int cilindrada) {

        super(marca, modelo, precio);

        this.cilindrada = cilindrada;
    }

    @Override
    public String descripcion() {

        return "Moto " + marca + " " + modelo +
               " - " + cilindrada + " cc";
    }
}