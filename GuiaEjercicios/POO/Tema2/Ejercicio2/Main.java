package POO.Tema2.Ejercicio2;

public class Main {
    public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria("Juan", 12345, 50000);
        System.out.println("Saldo inicial: " + cuenta.getSaldo());

        try {
            cuenta.depositar(10000);
            System.out.println("Deposito realizado. Saldo: " + cuenta.getSaldo());
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        try {
            cuenta.extraer(15000);
            System.out.println("Extraccion realizada. Saldo: " + cuenta.getSaldo());
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        try {
            cuenta.depositar(-5000);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        try {
            cuenta.extraer(100000);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}