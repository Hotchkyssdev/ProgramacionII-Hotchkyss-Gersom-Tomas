package POO.Tema3.Ejercicio1;

public class Main {
    public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria("Juan", 12345, 50000);
        CuentaBancaria cuenta2 = new CuentaBancaria("Maria", 67890);

        System.out.println("Cuenta 1");
        System.out.println("Titular: " + cuenta.getTitular());
        System.out.println("Numero: " + cuenta.getNumeroCuenta());
        System.out.println("Saldo: " + cuenta.getSaldo());

        System.out.println();

        System.out.println("Cuenta 2");
        System.out.println("Titular: " + cuenta2.getTitular());
        System.out.println("Numero: " + cuenta2.getNumeroCuenta());
        System.out.println("Saldo: " + cuenta2.getSaldo());
    }
}