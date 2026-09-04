public class Cuenta {

    private String titular;
    private double cantidad;

    // Constructor vacío
    public Cuenta() {
    }

    // Constructor con titular y cantidad
    public Cuenta(String titular, double cantidad) {
        this.titular = titular;
        this.cantidad = cantidad;
    }

    // Getters
    public String getTitular() {
        return titular;
    }

    public double getCantidad() {
        return cantidad;
    }

    // Setters
    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    // Ingresa dinero en la cuenta
    public void ingresar(double cantidad) {
        if (cantidad >= 0) {
            this.cantidad += cantidad;
        }
    }

    // Retira dinero de la cuenta
    public void retirar(double cantidad) {
        if (cantidad < 0) {
            return;
        }

        if (this.cantidad - cantidad < 0) {
            this.cantidad = 0;
        } else {
            this.cantidad -= cantidad;
        }
    }

    @Override
    public String toString() {
        return "Titular: " + titular + ", Cantidad: " + cantidad;
    }
}