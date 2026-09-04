package Ejercicio6;

public class Sacacorchos {

    private boolean tieneCorcho;

    public Sacacorchos() {
        tieneCorcho = false;
    }

    public void destapar(Botella botella) {

        // Comprobar si el sacacorchos ya tiene un corcho
        if (tieneCorcho) {
            System.out.println("Error: el sacacorchos ya tiene un corcho.");
            return;
        }

        // Comprobar si la botella ya está destapada
        if (botella.getCorcho() == null ||
                !botella.getCorcho().isEnBotella()) {

            System.out.println("Error: la botella ya está destapada.");
            return;
        }

        // Sacar el corcho de la botella
        botella.getCorcho().setEnBotella(false);

        // El sacacorchos ahora tiene el corcho
        tieneCorcho = true;

        System.out.println("La botella fue destapada correctamente.");
    }

    public void limpiar() {

        if (!tieneCorcho) {
            System.out.println("Error: el sacacorchos no tiene ningún corcho.");
            return;
        }

        tieneCorcho = false;

        System.out.println("El corcho fue retirado del sacacorchos.");
    }

    public boolean isTieneCorcho() {
        return tieneCorcho;
    }

    public static void main(String[] args) {

        Corcho corcho = new Corcho("Bodega Los Andes");
        Botella botella = new Botella(corcho);
        Sacacorchos sacacorchos = new Sacacorchos();

        System.out.println(botella);

        sacacorchos.destapar(botella);

        System.out.println(botella);

        // Intentar destapar nuevamente
        sacacorchos.destapar(botella);

        // Limpiar el sacacorchos
        sacacorchos.limpiar();

        // Intentar limpiarlo nuevamente
        sacacorchos.limpiar();
    }
}
