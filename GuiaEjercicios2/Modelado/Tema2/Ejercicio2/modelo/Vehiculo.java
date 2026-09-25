package GuiaEjercicios2.Modelado.Tema2.Ejercicio2.modelo;

import GuiaEjercicios2.Modelado.Tema2.Ejercicio2.venta.Vendible;

public abstract class Vehiculo implements Vendible {
    protected String marca;
    protected String modelo;
    protected double precio;

    public Vehiculo(String marca, String modelo, double precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
    }

    @Override
    public double precioFinal(double descuento) {

        double montoDescuento = precio * descuento / 100;

        return precio - montoDescuento;
    }

    public abstract String descripcion();
}
