package RepasoParcialI.Ejercicio4;

import java.util.Scanner;

public class JuegoAdivinaNumero extends Juego {

    protected int numeroAAdivinar;
    protected Scanner teclado;

    public JuegoAdivinaNumero(int numeroDeVidas, int numeroAAdivinar) {
        super(numeroDeVidas);
        this.numeroAAdivinar = numeroAAdivinar;
        teclado = new Scanner(System.in);
    }

    public boolean ValidaNumero(int numero) {
        return true;
    }

    @Override
    public void Juega() {

        ReiniciaPartida();

        System.out.println("\nAdivina un número entre 0 y 10:");

        while (true) {

            int numero;

            while (true) {
                System.out.print("Introduce un número: ");
                numero = teclado.nextInt();

                if (ValidaNumero(numero)) {
                    break;
                }

                System.out.println("Inténtalo nuevamente.");
            }

            if (numero == numeroAAdivinar) {

                System.out.println("¡Acertaste!!");
                ActualizaRecord();
                return;
            }

            if (QuitaVida()) {

                if (numeroAAdivinar > numero) {
                    System.out.println("El número a adivinar es mayor.");
                } else {
                    System.out.println("El número a adivinar es menor.");
                }

            } else {
                return;
            }
        }
    }
}