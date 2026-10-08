package RepasoParcialI.Ejercicio3;

public class Electrodomestico {

    protected double precioBase;
    protected String color;
    protected char consumoEnergetico;
    protected double peso;

    protected static final double PRECIO_BASE_DEFECTO = 100;
    protected static final String COLOR_DEFECTO = "blanco";
    protected static final char CONSUMO_DEFECTO = 'F';
    protected static final double PESO_DEFECTO = 5;

    // Constructor por defecto
    public Electrodomestico() {
        this.precioBase = PRECIO_BASE_DEFECTO;
        this.color = COLOR_DEFECTO;
        this.consumoEnergetico = CONSUMO_DEFECTO;
        this.peso = PESO_DEFECTO;
    }

    // Constructor con precio y peso
    public Electrodomestico(double precioBase, double peso) {
        this.precioBase = precioBase;
        this.peso = peso;
        this.color = COLOR_DEFECTO;
        this.consumoEnergetico = CONSUMO_DEFECTO;
    }

    // Constructor con todos los atributos
    public Electrodomestico(double precioBase, String color,
                            char consumoEnergetico, double peso) {

        this.precioBase = precioBase;
        this.color = comprobarColor(color);
        this.consumoEnergetico = comprobarConsumoEnergetico(consumoEnergetico);
        this.peso = peso;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public String getColor() {
        return color;
    }

    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public double getPeso() {
        return peso;
    }

    public char comprobarConsumoEnergetico(char letra) {

        letra = Character.toUpperCase(letra);

        if (letra >= 'A' && letra <= 'F') {
            return letra;
        }

        return CONSUMO_DEFECTO;
    }

    public String comprobarColor(String color) {

        if (color == null) {
            return COLOR_DEFECTO;
        }

        color = color.toLowerCase();

        if (color.equals("blanco") ||
            color.equals("negro") ||
            color.equals("rojo") ||
            color.equals("azul") ||
            color.equals("gris")) {

            return color;
        }

        return COLOR_DEFECTO;
    }

    public double precioFinal() {

        double precio = precioBase;

        switch (consumoEnergetico) {
            case 'A':
                precio += 100;
                break;
            case 'B':
                precio += 80;
                break;
            case 'C':
                precio += 60;
                break;
            case 'D':
                precio += 50;
                break;
            case 'E':
                precio += 30;
                break;
            case 'F':
                precio += 10;
                break;
        }

        if (peso >= 0 && peso <= 19) {
            precio += 10;
        } else if (peso <= 49) {
            precio += 50;
        } else if (peso <= 79) {
            precio += 80;
        } else {
            precio += 100;
        }

        return precio;
    }
}