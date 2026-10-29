package EstructurasLineales.Ejercicio3;

public class MainSimpleCircular {
    public static void main(String[] args) {
        ListaSimpleCircular lista = new ListaSimpleCircular();

        lista.insertar("juan");
        lista.insertar("pedro");
        lista.insertar("ana");
        lista.insertar("nina");

        System.out.println("Lista original:");
        lista.mostrar();

        String eliminado = lista.eliminarEnPosicion(2);

        System.out.println("Elemento eliminado: " + eliminado);
        System.out.println("Lista resultante:");
        lista.mostrar();

        System.out.println("Tamaño: " + lista.tamanio());
    }
}