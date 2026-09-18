package POO.Tema2.Ejercicio1;

public class Main {
    public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria("Juan", 12345, 50000);

        System.out.println("Titular: " + cuenta.getTitular());
        System.out.println("Número de cuenta: " + cuenta.getNumeroCuenta());
        System.out.println("Saldo: " + cuenta.getSaldo());

        try {
            cuenta.setTitular("");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        try {
            cuenta.setSaldo(-1000);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}