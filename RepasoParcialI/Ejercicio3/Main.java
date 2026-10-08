package RepasoParcialI.Ejercicio3;

public class Main {
    public static void main(String[] args) {

        Electrodomestico[] electrodomesticos = new Electrodomestico[10];

        electrodomesticos[0] = new Electrodomestico();
        electrodomesticos[1] = new Electrodomestico(300, "negro", 'A', 15);

        electrodomesticos[2] = new Lavarropas();
        electrodomesticos[3] = new Lavarropas(500, 60);
        electrodomesticos[4] = new Lavarropas(700, "blanco", 'B', 70, 40);

        electrodomesticos[5] = new Television();
        electrodomesticos[6] = new Television(400, 20);
        electrodomesticos[7] = new Television(800, "negro", 'A', 30, 50, true);

        electrodomesticos[8] = new Lavarropas(600, "rojo", 'C', 45, 25);
        electrodomesticos[9] = new Television(1000, "gris", 'B', 35, 32, true);

        double totalElectrodomesticos = 0;
        double totalLavarropas = 0;
        double totalTelevisiones = 0;

        for (Electrodomestico electrodomestico : electrodomesticos) {

            double precio = electrodomestico.precioFinal();

            totalElectrodomesticos += precio;

            if (electrodomestico instanceof Lavarropas) {
                totalLavarropas += precio;
            }

            if (electrodomestico instanceof Television) {
                totalTelevisiones += precio;
            }
        }

        System.out.println("Total de todos los electrodomésticos: $" + totalElectrodomesticos);
        System.out.println("Total de lavarropas: $" + totalLavarropas);
        System.out.println("Total de televisiones: $" + totalTelevisiones);
    }
}
