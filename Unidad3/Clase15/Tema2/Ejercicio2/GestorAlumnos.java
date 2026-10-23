package Unidad3.Clase15.Tema2.Ejercicio2;

import java.util.ArrayList;
import java.util.Iterator;

public class GestorAlumnos {
    public static int eliminarPorInicial(
            ArrayList<Alumno> alumnos, char letra) {

        int eliminados = 0;
        Iterator<Alumno> iterador = alumnos.iterator();

        while (iterador.hasNext()) {
            Alumno alumno = iterador.next();

            char inicial = Character.toLowerCase(
                alumno.getNombre().charAt(0)
            );

            if (inicial == Character.toLowerCase(letra)) {
                iterador.remove();
                eliminados++;
            }
        }

        return eliminados;
    }
}