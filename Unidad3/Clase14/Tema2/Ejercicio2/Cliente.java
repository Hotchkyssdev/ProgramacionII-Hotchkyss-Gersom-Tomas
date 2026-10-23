package Unidad3.Clase14.Tema2.Ejercicio2;

public class Cliente {
    private String nombre;
    private int llegada;
    private int duracion;
    private int inicioAtencion;
    private int tiempoEspera;
    private int cajaAsignada;

    public Cliente(String nombre, int llegada, int duracion) {
        this.nombre = nombre;
        this.llegada = llegada;
        this.duracion = duracion;
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

    public int getCajaAsignada() {
        return cajaAsignada;
    }

    public void setInicioAtencion(int inicioAtencion) {
        this.inicioAtencion = inicioAtencion;
    }

    public void setTiempoEspera(int tiempoEspera) {
        this.tiempoEspera = tiempoEspera;
    }

    public void setCajaAsignada(int cajaAsignada) {
        this.cajaAsignada = cajaAsignada;
    }
}