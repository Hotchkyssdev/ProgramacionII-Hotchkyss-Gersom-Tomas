package EstructurasLineales.Ejercicio3;

public class MainDobleCircular {
    public static void main(String[] args) {
        ListaDobleCircular lista = new ListaDobleCircular();

        lista.insertar("juan");
        lista.insertar("pedro");
        lista.insertar("ana");
        lista.insertar("nina");

        System.out.println("Lista original:");
        lista.mostrarAdelante();

        String eliminado = lista.eliminarEnPosicion(2);

        System.out.println("Elemento eliminado: " + eliminado);
        System.out.println("Lista resultante:");
        lista.mostrarAdelante();

        System.out.println("Lista en sentido inverso:");
        lista.mostrarAtras();

        System.out.println("Tamaño: " + lista.tamanio());
    }
}