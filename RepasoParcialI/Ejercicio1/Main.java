package RepasoParcialI.Ejercicio1;

public class Main {
    public static void main(String[] args) {

        Cuenta cuenta1 = new Cuenta("Juan");
        Cuenta cuenta2 = new Cuenta("Pedro", 5000);

        cuenta1.ingresar(1000);
        cuenta2.retirar(6000);

        System.out.println(cuenta1);
        System.out.println(cuenta2);
    }
}