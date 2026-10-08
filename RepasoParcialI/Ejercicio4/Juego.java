package RepasoParcialI.Ejercicio4;

public abstract class Juego {

    private int numeroDeVidas;
    private int vidas;
    private int record;

    public Juego(int numeroDeVidas) {
        this.numeroDeVidas = numeroDeVidas;
        this.vidas = numeroDeVidas;
        this.record = 0;
    }

    public abstract void Juega();

    public boolean QuitaVida() {

        vidas--;

        if (vidas <= 0) {
            System.out.println("Juego Terminado");
            return false;
        }

        return true;
    }

    public void ReiniciaPartida() {
        vidas = numeroDeVidas;
    }

    public void ActualizaRecord() {

        if (vidas == record) {
            System.out.println("Has alcanzado el record.");
        } else if (vidas > record) {
            record = vidas;
            System.out.println("Has batido el record: " + record);
        }
    }
}