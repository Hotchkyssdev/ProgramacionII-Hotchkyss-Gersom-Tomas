package EstructurasLineales.Ejercicio2;

public class MainDoble {
    public static void main(String[] args) {
        ListaDoble lista = new ListaDoble();
        lista.insertar("juan"); lista.insertar("pedro"); lista.insertar("ana"); lista.insertar("nina");
        System.out.println("Lista doblemente enlazada:"); lista.mostrarAdelante();
        System.out.println("Elemento en posicion 2: " + lista.obtener(2));
        System.out.println("Lista inversa:"); lista.mostrarAtras();
    }
}
