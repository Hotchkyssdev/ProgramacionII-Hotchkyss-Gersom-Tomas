public class Fraccion {

    private int dividendo;
    private int divisor;

    // Constructor
    public Fraccion(int dividendo, int divisor) {
        this.dividendo = dividendo;
        this.divisor = divisor;
    }

    // Getters
    public int getDividendo() {
        return dividendo;
    }

    public int getDivisor() {
        return divisor;
    }

    // Setters
    public void setDividendo(int dividendo) {
        this.dividendo = dividendo;
    }

    public void setDivisor(int divisor) {
        this.divisor = divisor;
    }

    // Suma de fracciones
    public Fraccion sumar(Fraccion otra) {

        int nuevoDividendo = (this.dividendo * otra.divisor)
                + (otra.dividendo * this.divisor);

        int nuevoDivisor = this.divisor * otra.divisor;

        return new Fraccion(nuevoDividendo, nuevoDivisor);
    }

    // Multiplicación de fracciones
    public Fraccion multiplicar(Fraccion otra) {

        int nuevoDividendo = this.dividendo * otra.dividendo;
        int nuevoDivisor = this.divisor * otra.divisor;

        return new Fraccion(nuevoDividendo, nuevoDivisor);
    }

    @Override
    public String toString() {
        return dividendo + "/" + divisor;
    }

    public static void main(String[] args) {

        Fraccion fraccion1 = new Fraccion(1, 2);
        Fraccion fraccion2 = new Fraccion(3, 4);

        Fraccion suma = fraccion1.sumar(fraccion2);
        Fraccion multiplicacion = fraccion1.multiplicar(fraccion2);

        System.out.println("Fracción 1: " + fraccion1);
        System.out.println("Fracción 2: " + fraccion2);
        System.out.println("Suma: " + suma);
        System.out.println("Multiplicación: " + multiplicacion);
    }
}