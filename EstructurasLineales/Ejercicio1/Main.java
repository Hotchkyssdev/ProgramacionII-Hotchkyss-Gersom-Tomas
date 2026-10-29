package EstructurasLineales.Ejercicio1;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== LISTA SIMPLE CIRCULAR ===");

        ListaSimpleCircular simple = new ListaSimpleCircular();
        simple.insertar(10);
        simple.insertar(20);
        simple.insertar(30);
        simple.insertar(40);

        simple.mostrar();

        System.out.println("Buscar 30: " + simple.buscar(30));
        System.out.println("Eliminar 10: " + simple.eliminar(10));
        System.out.println("Eliminar 40: " + simple.eliminar(40));

        simple.mostrar();

        System.out.println("Cantidad: " + simple.tamanio());

        System.out.println("\n=== LISTA DOBLE CIRCULAR ===");
        
        ListaDobleCircular doble = new ListaDobleCircular();
        doble.insertar(10);
        doble.insertar(20);
        doble.insertar(30);
        doble.insertar(40);

        System.out.println("Recorrido hacia adelante: ");
        doble.mostrarAdelante();

        System.out.println("Recorrido hacia atras: ");
        doble.mostrarAtras();

        System.out.println("Buscar 30: " + doble.buscar(30));
        System.out.println("Eliminar 10: " + doble.eliminar(10));
        System.out.println("Eliminar 40: " + doble.eliminar(40));

        System.out.println("Lista despues de eliminar: ");
        doble.mostrarAdelante();

        System.out.println("Cantidad: " + doble.tamanio());
    }
}