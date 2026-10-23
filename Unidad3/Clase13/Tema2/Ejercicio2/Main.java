package Unidad3.Clase13.Tema2.Ejercicio2;

public class Main {
    public static void main(String[] args) {
        probar("3+4");
        probar("3+4*2");
        probar("(3+4)*2");
        probar("8/4/2");
        probar("5+6-2");
        probar("2*(3+4)-5");
        probar("((2+3)*4)/5");
    }

    public static void probar(String expresion) {
        try {
            String resultado = Conversion.infijaAPostfija(expresion);

            System.out.println("Infija: " + expresion);
            System.out.println("Postfija: " + resultado);
            System.out.println();

        } catch (IllegalArgumentException e) {
            System.out.println("Error en " + expresion + ": " + e.getMessage());
            System.out.println();
        }
    }
}