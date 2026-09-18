package POO.Tema3.Ejercicio1;

public class CuentaBancaria {
    private String titular;
    private int numeroCuenta;
    private double saldo;

    public CuentaBancaria(String titular, int numeroCuenta, double saldo) {
        setTitular(titular);
        this.numeroCuenta = numeroCuenta;
        setSaldo(saldo);
    }

    public CuentaBancaria(String titular, int numeroCuenta) {
        this(titular, numeroCuenta, 0);
    }

    public String getTitular() {
        return titular;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setTitular(String titular) {
        if (titular == null || titular.isEmpty()) {
            throw new IllegalArgumentException("El titular no puede estar vacio.");
        }
        this.titular = titular;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public void setSaldo(double saldo) {
        if (saldo < 0) {
            throw new IllegalArgumentException("El saldo no puede ser negativo");
        }
        this.saldo = saldo;
    }
}
