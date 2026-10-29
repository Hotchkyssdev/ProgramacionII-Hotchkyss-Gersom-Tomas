package EstructurasLineales.Ejercicio2;

public class MainSimple {
    public static void main(String[] args) {
        ListaSimple lista = new ListaSimple();
        lista.insertar("juan"); lista.insertar("pedro"); lista.insertar("ana"); lista.insertar("nina");
        System.out.println("Lista simplemente enlazada:"); lista.mostrar();
        System.out.println("Elemento en posicion 2: " + lista.obtener(2));
    }
}
