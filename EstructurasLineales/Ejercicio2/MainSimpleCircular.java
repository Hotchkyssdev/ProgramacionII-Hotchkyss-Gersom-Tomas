package EstructurasLineales.Ejercicio2;

public class MainSimpleCircular {
    public static void main(String[] args) {
        ListaSimpleCircular lista = new ListaSimpleCircular();
        lista.insertar("juan"); lista.insertar("pedro"); lista.insertar("ana"); lista.insertar("nina");
        System.out.println("Lista simplemente circular:"); lista.mostrar();
        System.out.println("Elemento en posicion 2: " + lista.obtener(2));
    }
}
