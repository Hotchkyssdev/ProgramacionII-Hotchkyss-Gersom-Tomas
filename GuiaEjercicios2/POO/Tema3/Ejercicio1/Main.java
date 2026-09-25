package GuiaEjercicios2.POO.Tema3.Ejercicio1;

public class Main {
    public static void main(String[] args) {
        Factura factura = new Factura(1001, 10);

        factura.agregarItem(1000);
        factura.agregarItem(2000);
        factura.agregarItem(500);

        System.out.println(factura.generarComprobante());

        System.out.println();
        System.out.println("Total a pagar: $" + factura.calcularPago());
    }  
}