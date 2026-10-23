package Unidad3.Clase13.Tema2.Ejercicio1;

public class Main {
    public static void main(String[] args) {
        probar("({[]})");
        probar("(([]");
        probar("{[(");
        probar("([)]");
        probar("())");
        probar("a + (b * c");
    }

    public static void probar(String expresion) {

        System.out.println("Expresión: " + expresion);

        try {
            String cierres = Balanceo.corregirBalanceo(expresion);

            if (cierres.isEmpty()) {
                System.out.println("Resultado: La expresión está balanceada.");
            } else {
                System.out.println("Cierres necesarios: " + cierres);
                System.out.println("Expresión corregida: " + expresion + cierres);
            }

        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        System.out.println();
    }
}