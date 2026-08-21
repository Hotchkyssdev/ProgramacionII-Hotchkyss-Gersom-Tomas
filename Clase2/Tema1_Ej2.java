public class Tema1_Ej2 {
    
    private int valor = 100;

    public static void main(String[] args) {

        /*
         * El código original no compila porque la variable resultado
         * declarada dentro del bloque if solamente existe dentro de ese bloque.
         *
         * La variable resultado declarada fuera del if existe desde su
         * declaración hasta el final del método.
         *
         * Para corregirlo, se declara resultado fuera del if y se le
         * asigna el valor dentro del bloque.
         */

        int x = 5;
        int resultado;

        if (x > 0) {
            resultado = x * 2;
        } else {
            resultado = 0;
        }

        System.out.println("Resultado: " + resultado);

        Tema1_Ej2 ejemplo = new Tema1_Ej2();
        ejemplo.mostrarValor(10);
    }

    /*
     * El parámetro "valor" tiene el mismo nombre que el atributo
     * "valor" de la clase.
     *
     * Dentro del método, al utilizar simplemente "valor", prevalece
     * el parámetro porque tiene un ámbito más específico.
     *
     * Para acceder al atributo de la clase se utiliza "this.valor".
     */

    public void mostrarValor(int valor) {
        System.out.println("Valor del parámetro: " + valor);
        System.out.println("Valor del atributo: " + this.valor);
    }
}