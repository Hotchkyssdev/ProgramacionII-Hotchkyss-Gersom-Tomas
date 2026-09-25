package GuiaEjercicios2.POO.Tema2.Ejercicio1;

public class Main {
    public static void main(String[] args) {

        // Esto NO se puede hacer:
        // Figura figura = new Figura("Figura");

        Circulo circulo = new Circulo(5);
        Rectangulo rectangulo = new Rectangulo(10, 4);
        Triangulo triangulo = new Triangulo(8, 6);

        System.out.println(circulo);
        System.out.println(rectangulo);
        System.out.println(triangulo);
    } 
}