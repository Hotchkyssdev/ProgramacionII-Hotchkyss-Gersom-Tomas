public class Tema3_Ej2 {
    
    /*
     * Versión recursiva del cálculo de potencia.
     *
     * Caso base:
     * Cuando el exponente es 0, cualquier número elevado a 0
     * es igual a 1.
     *
     * Caso recursivo:
     * base^exponente = base * base^(exponente - 1)
     */

    public static int potenciaRecursiva(int base, int exponente) {

        if (exponente == 0) {
            return 1;
        }

        return base * potenciaRecursiva(base, exponente - 1);
    }

    /*
     * Versión iterativa del cálculo de potencia.
     *
     * Se comienza con resultado = 1 y se multiplica por la base
     * tantas veces como indique el exponente.
     */
    public static int potenciaIterativa(int base, int exponente) {

        int resultado = 1;

        for (int i = 0; i < exponente; i++) {
            resultado *= base;
        }

        return resultado;
    }

    public static void main(String[] args) {

        int base = 2;
        int exponente = 10;

        int resultadoRecursivo = potenciaRecursiva(base, exponente);
        int resultadoIterativo = potenciaIterativa(base, exponente);

        System.out.println("Base: " + base);
        System.out.println("Exponente: " + exponente);

        System.out.println("Resultado recursivo: " + resultadoRecursivo);
        System.out.println("Resultado iterativo: " + resultadoIterativo);

        if (resultadoRecursivo == resultadoIterativo) {
            System.out.println("Ambos métodos devuelven el mismo resultado.");
        } else {
            System.out.println("Los resultados son diferentes.");
        }
    }
}