package GuiaEjercicios2.Modelado.Tema2.Ejercicio1.servicio;

import java.util.ArrayList;
import GuiaEjercicios2.Modelado.Tema2.Ejercicio1.modelo.Auto;

/*
 * COMPOSICIÓN:
 *
 * La Concesionaria administra una colección de Auto
 * cuya creación pertenece conceptualmente a la
 * Concesionaria.
 *
 * En este modelo, los autos son partes de la
 * Concesionaria y no se consideran independientes
 * dentro del sistema.
 *
 * Por eso corresponde a composición y no a agregación.
 */
public class Concesionaria {
    private ArrayList<Auto> autos;

    public Concesionaria() {
        autos = new ArrayList<>();

        autos.add(new Auto("Toyota", "Corolla", 4));
        autos.add(new Auto("Ford", "Focus", 4));
        autos.add(new Auto("Chevrolet", "Onix", 4));
    }

    public void mostrarAutos() {

        for (Auto auto : autos) {
            System.out.println(auto);
        }
    }
}
