package EstructurasLineales.Ejercicio2;

public class ListaDoble {
    private class Nodo { String dato; Nodo siguiente, anterior; Nodo(String dato) { this.dato = dato; } }
    private Nodo primero, ultimo;
    private int cantidad;
    public void insertar(String dato) {
        Nodo nuevo = new Nodo(dato);
        if (primero == null) { primero = nuevo; ultimo = nuevo; }
        else { nuevo.anterior = ultimo; ultimo.siguiente = nuevo; ultimo = nuevo; }
        cantidad++;
    }
    public String obtener(int posicion) {
        validar(posicion); Nodo actual;
        if (posicion < cantidad / 2) { actual = primero; for (int i=0; i<posicion; i++) actual=actual.siguiente; }
        else { actual=ultimo; for (int i=cantidad-1; i>posicion; i--) actual=actual.anterior; }
        return actual.dato;
    }
    private void validar(int p) { if (p<0 || p>=cantidad) throw new IndexOutOfBoundsException("Posicion fuera de rango: "+p); }
    public void mostrarAdelante() {
        Nodo a=primero; while(a!=null) { System.out.print(a.dato); if(a.siguiente!=null) System.out.print(" -> "); a=a.siguiente; } System.out.println();
    }
    public void mostrarAtras() {
        Nodo a=ultimo; while(a!=null) { System.out.print(a.dato); if(a.anterior!=null) System.out.print(" -> "); a=a.anterior; } System.out.println();
    }
}
