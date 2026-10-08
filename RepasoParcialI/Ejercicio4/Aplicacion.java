package RepasoParcialI.Ejercicio4;

public class Aplicacion {
    
    public static void main(String[] args) {

        JuegoAdivinaNumero juegoNumero =
                new JuegoAdivinaNumero(3, 7);

        JuegoAdivinaPar juegoPar =
                new JuegoAdivinaPar(3, 8);

        JuegoAdivinaImpar juegoImpar =
                new JuegoAdivinaImpar(3, 5);

        System.out.println("===== JUEGO ADIVINA NÚMERO =====");
        juegoNumero.Juega();

        System.out.println("\n===== JUEGO ADIVINA PAR =====");
        juegoPar.Juega();

        System.out.println("\n===== JUEGO ADIVINA IMPAR =====");
        juegoImpar.Juega();
    }
}