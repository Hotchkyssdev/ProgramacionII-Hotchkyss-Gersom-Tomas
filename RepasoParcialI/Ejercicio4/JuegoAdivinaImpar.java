package RepasoParcialI.Ejercicio4;

public class JuegoAdivinaImpar extends JuegoAdivinaNumero {

    public JuegoAdivinaImpar(int numeroDeVidas, int numeroAAdivinar) {
        super(numeroDeVidas, numeroAAdivinar);
    }

    @Override
    public boolean ValidaNumero(int numero) {

        if (numero % 2 != 0) {
            return true;
        }

        System.out.println("Error: debes introducir un número impar.");
        return false;
    }
}
