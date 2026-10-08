package RepasoParcialI.Ejercicio3;

public class Television extends Electrodomestico {

    private double resolucion;
    private boolean sintonizadorTDT;

    private static final double RESOLUCION_DEFECTO = 20;
    private static final boolean TDT_DEFECTO = false;

    // Constructor por defecto
    public Television() {
        super();
        this.resolucion = RESOLUCION_DEFECTO;
        this.sintonizadorTDT = TDT_DEFECTO;
    }

    // Constructor con precio y peso
    public Television(double precioBase, double peso) {
        super(precioBase, peso);
        this.resolucion = RESOLUCION_DEFECTO;
        this.sintonizadorTDT = TDT_DEFECTO;
    }

    // Constructor con resolución, TDT y atributos heredados
    public Television(double precioBase, String color,
                      char consumoEnergetico, double peso,
                      double resolucion, boolean sintonizadorTDT) {

        super(precioBase, color, consumoEnergetico, peso);
        this.resolucion = resolucion;
        this.sintonizadorTDT = sintonizadorTDT;
    }

    public double getResolucion() {
        return resolucion;
    }

    public boolean getSintonizadorTDT() {
        return sintonizadorTDT;
    }

    @Override
    public double precioFinal() {

        double precio = super.precioFinal();

        if (resolucion > 40) {
            precio = precio * 1.30;
        }

        if (sintonizadorTDT) {
            precio += 50;
        }

        return precio;
    }
}
