package Ejercicio6;

public class Corcho {

    private String bodega;
    private boolean enBotella;

    public Corcho(String bodega) {
        this.bodega = bodega;
        this.enBotella = true;
    }

    public String getBodega() {
        return bodega;
    }

    public boolean isEnBotella() {
        return enBotella;
    }

    public void setEnBotella(boolean enBotella) {
        this.enBotella = enBotella;
    }

    @Override
    public String toString() {
        return "Corcho de la bodega: " + bodega
                + ", en botella: " + enBotella;
    }
}
