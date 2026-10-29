package EstructurasLineales.Ejercicio2;

public class ListaDobleCircular {
    private class Nodo { String dato; Nodo siguiente, anterior; Nodo(String dato) { this.dato = dato; } }
    private Nodo primero, ultimo;
    private int cantidad;
    public void insertar(String dato) {
        Nodo nuevo=new Nodo(dato);
        if(primero==null) { primero=ultimo=nuevo; nuevo.siguiente=nuevo; nuevo.anterior=nuevo; }
        else { nuevo.anterior=ultimo; nuevo.siguiente=primero; ultimo.siguiente=nuevo; primero.anterior=nuevo; ultimo=nuevo; }
        cantidad++;
    }
    public String obtener(int posicion) {
        validar(posicion); Nodo actual;
        if(posicion<cantidad/2) { actual=primero; for(int i=0;i<posicion;i++) actual=actual.siguiente; }
        else { actual=ultimo; for(int i=cantidad-1;i>posicion;i--) actual=actual.anterior; }
        return actual.dato;
    }
    private void validar(int p) { if(p<0 || p>=cantidad) throw new IndexOutOfBoundsException("Posicion fuera de rango: "+p); }
    public void mostrarAdelante() {
        if(primero==null) { System.out.println("Lista vacia."); return; }
        Nodo a=primero; do { System.out.print(a.dato); a=a.siguiente; if(a!=primero) System.out.print(" -> "); } while(a!=primero);
        System.out.println(" (circular)");
    }
    public void mostrarAtras() {
        if(ultimo==null) { System.out.println("Lista vacia."); return; }
        Nodo a=ultimo; do { System.out.print(a.dato); a=a.anterior; if(a!=ultimo) System.out.print(" -> "); } while(a!=ultimo);
        System.out.println(" (circular)");
    }
}
