package Ejercicio7;

public class Mate {

    private int cebadasRestantes;
    private boolean lleno;

    // Constructor
    public Mate(int n) {
        cebadasRestantes = n;
        lleno = false;
    }

    // Ceba el mate
    public void cebar() {

        if (lleno) {
            System.out.println("Cuidado! Te quemaste!");
            return;
        }

        lleno = true;
        System.out.println("Mate cebado.");
    }

    // Bebe el mate
    public void beber() {

        if (!lleno) {
            System.out.println("El mate está vacío !");
            return;
        }

        lleno = false;

        if (cebadasRestantes > 0) {
            cebadasRestantes--;
        }

        if (cebadasRestantes == 0) {
            System.out.println("Advertencia: el mate está lavado.");
        }
    }

    public int getCebadasRestantes() {
        return cebadasRestantes;
    }

    public boolean isLleno() {
        return lleno;
    }

    public static void main(String[] args) {

        Mate mate = new Mate(3);

        // Primera cebada
        mate.cebar();

        // Intentar cebar estando lleno
        mate.cebar();

        // Beber
        mate.beber();

        // Segunda cebada
        mate.cebar();
        mate.beber();

        // Tercera cebada
        mate.cebar();
        mate.beber();

        // Ya está lavado, pero se puede seguir cebando y bebiendo
        mate.cebar();
        mate.beber();

        // Intentar beber estando vacío
        mate.beber();
    }
}
