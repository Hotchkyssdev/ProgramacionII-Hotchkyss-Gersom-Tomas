package RepasoParcialI.Ejercicio1;

public class Cuenta {

    private String titular;
    private double cantidad;

    // Constructor solo con titular
    public Cuenta(String titular) {
        this.titular = titular;
        this.cantidad = 0;
    }

    // Constructor con titular y cantidad
    public Cuenta(String titular, double cantidad) {
        this.titular = titular;

        if (cantidad >= 0) {
            this.cantidad = cantidad;
        } else {
            this.cantidad = 0;
        }
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public void ingresar(double cantidad) {
        if (cantidad >= 0) {
            this.cantidad += cantidad;
        }
    }

    public void retirar(double cantidad) {
        this.cantidad -= cantidad;

        if (this.cantidad < 0) {
            this.cantidad = 0;
        }
    }

    @Override
    public String toString() {
        return "Titular: " + titular + ", Cantidad: $" + cantidad;
    }
}