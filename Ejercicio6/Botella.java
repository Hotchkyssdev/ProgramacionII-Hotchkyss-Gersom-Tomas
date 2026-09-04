package Ejercicio6;

public class Botella {

    private Corcho corcho;

    public Botella(Corcho corcho) {
        this.corcho = corcho;
    }

    public Corcho getCorcho() {
        return corcho;
    }

    public void setCorcho(Corcho corcho) {
        this.corcho = corcho;
    }

    @Override
    public String toString() {
        if (corcho != null && corcho.isEnBotella()) {
            return "La botella está tapada.";
        }

        return "La botella está destapada.";
    }
}
