package RepasoParcialI.Ejercicio3;

public class Lavarropas extends Electrodomestico {

    private double carga;

    private static final double CARGA_DEFECTO = 5;

    // Constructor por defecto
    public Lavarropas() {
        super();
        this.carga = CARGA_DEFECTO;
    }

    // Constructor con precio y peso
    public Lavarropas(double precioBase, double peso) {
        super(precioBase, peso);
        this.carga = CARGA_DEFECTO;
    }

    // Constructor con carga y todos los atributos heredados
    public Lavarropas(double precioBase, String color,
                     char consumoEnergetico, double peso,
                     double carga) {

        super(precioBase, color, consumoEnergetico, peso);
        this.carga = carga;
    }

    public double getCarga() {
        return carga;
    }

    @Override
    public double precioFinal() {

        double precio = super.precioFinal();

        if (carga > 30) {
            precio += 50;
        }

        return precio;
    }
}
