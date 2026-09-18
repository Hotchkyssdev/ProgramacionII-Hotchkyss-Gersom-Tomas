package Herencia.Tema1.Ejercicio2;

//En esta clase se permite instanciar directamente la figura
//Todavia no utilizamos una clase abstracta porque ese concepto se vera formalmente en la clase 7

public class Figura {
    private String nombre;

    public Figura(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
}