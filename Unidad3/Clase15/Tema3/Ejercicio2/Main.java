package Unidad3.Clase15.Tema3.Ejercicio2;

public class Main {
    public static void main(String[] args) {
        GestorTareas gestor = new GestorTareas();

        gestor.agregarTarea(new Tarea("Preparar informe", 2, 5));
        gestor.agregarTarea(new Tarea("Corregir error critico", 1, 3));
        gestor.agregarTarea(new Tarea("Actualizar documentacion", 3, 2));
        gestor.agregarTarea(new Tarea("Resolver fallo de seguridad", 1, 1));
        gestor.agregarTarea(new Tarea("Enviar correo", 2, 1));
        gestor.agregarTarea(new Tarea("Organizar archivos", 4, 7));

        System.out.println("Cantidad de tareas: "
                + gestor.cantidadTareas());

        System.out.println("\n--- Orden de ejecucion ---");

        int numero = 1;

        while (!gestor.estaVacio()) {
            Tarea tarea = gestor.ejecutarSiguiente();

            System.out.println(numero + ". " + tarea);
            numero++;
        }

        System.out.println("\nCantidad restante: "
                + gestor.cantidadTareas());
    }
}