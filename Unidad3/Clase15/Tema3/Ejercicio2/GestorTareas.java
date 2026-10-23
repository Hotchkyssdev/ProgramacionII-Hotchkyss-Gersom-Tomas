package Unidad3.Clase15.Tema3.Ejercicio2;
import java.util.PriorityQueue;
import java.util.Comparator;

public class GestorTareas {
    private PriorityQueue<Tarea> tareas;

    public GestorTareas() {
        Comparator<Tarea> comparador = Comparator
                .comparingInt(Tarea::getPrioridad)
                .thenComparingInt(Tarea::getFechaLimite);

        tareas = new PriorityQueue<>(comparador);
    }

    public void agregarTarea(Tarea tarea) {
        tareas.offer(tarea);
    }

    public Tarea ejecutarSiguiente() {
        return tareas.poll();
    }

    public boolean estaVacio() {
        return tareas.isEmpty();
    }

    public int cantidadTareas() {
        return tareas.size();
    }
}