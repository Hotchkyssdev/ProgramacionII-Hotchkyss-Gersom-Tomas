package EstructurasLineales.Ejercicio2;

public class ListaSimple {
    private class Nodo { String dato; Nodo siguiente; Nodo(String dato) { this.dato = dato; } }
    private Nodo primero, ultimo;
    private int cantidad;
    public void insertar(String dato) {
        Nodo nuevo = new Nodo(dato);
        if (primero == null) { primero = nuevo; ultimo = nuevo; }
        else { ultimo.siguiente = nuevo; ultimo = nuevo; }
        cantidad++;
    }
    public String obtener(int posicion) {
        validar(posicion); Nodo actual = primero;
        for (int i = 0; i < posicion; i++) actual = actual.siguiente;
        return actual.dato;
    }
    private void validar(int p) {
        if (p < 0 || p >= cantidad) throw new IndexOutOfBoundsException("Posicion fuera de rango: " + p);
    }
    public void mostrar() {
        Nodo actual = primero;
        while (actual != null) { System.out.print(actual.dato); if (actual.siguiente != null) System.out.print(" -> "); actual = actual.siguiente; }
        System.out.println();
    }
}
