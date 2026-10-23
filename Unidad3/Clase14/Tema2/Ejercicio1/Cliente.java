package Unidad3.Clase14.Tema2.Ejercicio1;

public class Cliente {
    private String nombre;
    private int llegada;
    private int duracion;
    private int inicioAtencion;
    private int tiempoEspera;

    public Cliente(String nombre, int llegada, int duracion) {
        this.nombre = nombre;
        this.llegada = llegada;
        this.duracion = duracion;
        this.inicioAtencion = 0;
        this.tiempoEspera = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public int getLlegada() {
        return llegada;
    }

    public int getDuracion() {
        return duracion;
    }

    public int getInicioAtencion() {
        return inicioAtencion;
    }

    public int getTiempoEspera() {
        return tiempoEspera;
    }

    public void setInicioAtencion(int inicioAtencion) {
        this.inicioAtencion = inicioAtencion;
    }

    public void setTiempoEspera(int tiempoEspera) {
        this.tiempoEspera = tiempoEspera;
    }
}