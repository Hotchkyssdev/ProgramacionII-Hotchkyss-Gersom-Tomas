package EstructurasLineales.Ejercicio2;

public class ListaSimpleCircular {
    private class Nodo { String dato; Nodo siguiente; Nodo(String dato) { this.dato = dato; } }
    private Nodo ultimo;
    private int cantidad;
    public void insertar(String dato) {
        Nodo nuevo = new Nodo(dato);
        if (ultimo == null) { ultimo=nuevo; nuevo.siguiente=nuevo; }
        else { nuevo.siguiente=ultimo.siguiente; ultimo.siguiente=nuevo; ultimo=nuevo; }
        cantidad++;
    }
    public String obtener(int posicion) {
        validar(posicion); Nodo actual=ultimo.siguiente;
        for(int i=0;i<posicion;i++) actual=actual.siguiente;
        return actual.dato;
    }
    private void validar(int p) { if(p<0 || p>=cantidad) throw new IndexOutOfBoundsException("Posicion fuera de rango: "+p); }
    public void mostrar() {
        if(ultimo==null) { System.out.println("Lista vacia."); return; }
        Nodo primero=ultimo.siguiente, actual=primero;
        do { System.out.print(actual.dato); actual=actual.siguiente; if(actual!=primero) System.out.print(" -> "); } while(actual!=primero);
        System.out.println(" (circular)");
    }
}
