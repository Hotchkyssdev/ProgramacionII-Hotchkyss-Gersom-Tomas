package GuiaEjercicios2.Modelado.Tema1.Ejercicio2;

import java.util.ArrayList;

public class Factura implements Pagable, Imprimible {
    private int numero;
    private ArrayList<Double> items;
    private double porcentajeDescuento;

    public Factura(int numero, double porcentajeDescuento) {
        this.numero = numero;
        this.porcentajeDescuento = porcentajeDescuento;
        this.items = new ArrayList<>();
    }

    public void agregarItem(double precio) {
        items.add(precio);
    }

    @Override
    public double calcularPago() {
        double subtotal = 0;

        for (double precio : items) {
            subtotal += precio;
        }

        double descuento = subtotal * porcentajeDescuento / 100;

        return subtotal - descuento;
    }

    @Override
    public String generarComprobante() {
        String comprobante = "Factura N°: " + numero + "\n";

        comprobante += "Ítems:\n";

        for (double precio : items) {
            comprobante += "- $" + precio + "\n";
        }

        comprobante += "Descuento: " + porcentajeDescuento + "%\n";
        comprobante += "Total a pagar: $" + calcularPago();

        return comprobante;
    }
}