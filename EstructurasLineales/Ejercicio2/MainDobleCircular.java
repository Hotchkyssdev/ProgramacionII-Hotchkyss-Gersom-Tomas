package EstructurasLineales.Ejercicio2;

public class MainDobleCircular {
    public static void main(String[] args) {
        ListaDobleCircular lista = new ListaDobleCircular();
        lista.insertar("juan"); lista.insertar("pedro"); lista.insertar("ana"); lista.insertar("nina");
        System.out.println("Lista doblemente circular:"); lista.mostrarAdelante();
        System.out.println("Elemento en posicion 2: " + lista.obtener(2));
        System.out.println("Lista inversa:"); lista.mostrarAtras();
    }
}
