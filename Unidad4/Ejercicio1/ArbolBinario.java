/*
 * ============================================================
 * EXPLICACIÓN GENERAL DEL PROGRAMA: ÁRBOL BINARIO
 * ============================================================
 *
 * Este programa implementa un árbol binario utilizando una
 * estructura de datos dinámica basada en nodos enlazados.
 * Un árbol binario es una estructura no lineal en la que cada
 * nodo puede almacenar un valor y tener como máximo dos hijos:
 * un hijo izquierdo y un hijo derecho.
 *
 * El primer nodo del árbol se denomina RAÍZ y representa el
 * punto de partida para acceder a todos los demás elementos.
 * Cada nodo contiene tres componentes: un dato de tipo entero,
 * una referencia al hijo izquierdo y una referencia al hijo
 * derecho. Cuando un nodo no tiene alguno de sus hijos, la
 * referencia correspondiente contiene el valor null.
 *
 * En este programa se utiliza una clase interna llamada Nodo,
 * que representa cada elemento del árbol. Esta clase contiene
 * el atributo dato, donde se almacena el número entero, y las
 * referencias izquierdo y derecho, que permiten conectar los
 * diferentes nodos entre sí. También posee un constructor que
 * recibe un número y lo asigna al atributo dato.
 *
 * La clase principal ArbolBinario contiene el atributo raiz,
 * que mantiene la referencia al primer nodo del árbol. Cuando
 * se crea un objeto de esta clase, el árbol comienza vacío,
 * por lo que la raíz inicialmente tiene el valor null.
 *
 * Para insertar elementos se utiliza el método insertar().
 * Este método recibe un número entero, crea un nuevo nodo y
 * determina dónde debe incorporarlo dentro del árbol. Si el
 * árbol está vacío, el nuevo nodo se convierte directamente
 * en la raíz. En caso contrario, se utiliza una cola auxiliar
 * para recorrer los nodos existentes por niveles, comenzando
 * desde la raíz.
 *
 * La inserción se realiza buscando el primer espacio libre
 * disponible. Primero se comprueba si el nodo actual tiene
 * vacío su hijo izquierdo. Si es así, el nuevo nodo se conecta
 * en esa posición. Si el hijo izquierdo ya existe, se agrega
 * a la cola para revisarlo posteriormente. Luego se comprueba
 * el hijo derecho y se realiza el mismo procedimiento. De esta
 * manera, los nuevos elementos se incorporan de izquierda a
 * derecha, ocupando primero los espacios disponibles de los
 * niveles superiores.
 *
 * Es importante destacar que este árbol todavía no utiliza
 * un criterio de ordenamiento por valores. No se compara si
 * un número es mayor o menor que otro para decidir dónde
 * insertarlo. Por lo tanto, no se trata de un árbol binario
 * de búsqueda, sino de un árbol binario cuyos elementos se
 * insertan por niveles.
 *
 * Para trabajar con las colas se importan las clases Queue y
 * LinkedList de Java. Queue es una interfaz que representa
 * una cola, mientras que LinkedList proporciona una
 * implementación de esa estructura. Una cola trabaja con el
 * principio FIFO (First In, First Out), es decir, el primer
 * elemento que ingresa es el primero que sale. En este código
 * se utilizan los métodos add(), para agregar elementos al
 * final de la cola, y poll(), para extraer el primer elemento.
 *
 * El programa implementa cuatro formas diferentes de recorrer
 * los elementos del árbol:
 *
 * 1. RECORRIDO PRE-ORDEN:
 * El método preOrden() inicia el recorrido desde la raíz y
 * utiliza un método privado recursivo para visitar los nodos.
 * El orden de visita es: primero la raíz, después el subárbol
 * izquierdo y finalmente el subárbol derecho. Esto significa
 * que cada nodo se imprime antes de recorrer sus hijos.
 *
 * 2. RECORRIDO IN-ORDEN:
 * El método inOrden() también utiliza recursividad, pero
 * modifica el orden de visita. Primero recorre el subárbol
 * izquierdo, después imprime el nodo actual y finalmente
 * recorre el subárbol derecho. Este recorrido es especialmente
 * útil en árboles binarios de búsqueda, ya que permite
 * obtener los valores ordenados de menor a mayor cuando se
 * utiliza ese tipo de árbol.
 *
 * 3. RECORRIDO POST-ORDEN:
 * El método postOrden() visita primero el subárbol izquierdo,
 * luego el subárbol derecho y finalmente imprime el nodo
 * actual. En este caso, cada nodo se procesa después de haber
 * recorrido sus dos hijos. También se implementa mediante
 * recursividad.
 *
 * En los tres recorridos anteriores se utiliza un caso base:
 * cuando el nodo recibido es null, el método finaliza esa
 * llamada recursiva. Esto evita intentar recorrer posiciones
 * inexistentes y permite que el algoritmo termine
 * correctamente.
 *
 * 4. RECORRIDO POR NIVELES:
 * El método porNiveles() recorre el árbol desde arriba hacia
 * abajo y de izquierda a derecha. A diferencia de los tres
 * recorridos anteriores, no utiliza recursividad, sino una
 * cola auxiliar. Primero se agrega la raíz a la cola. Luego,
 * mientras existan elementos pendientes, se extrae el primer
 * nodo, se imprime su valor y se agregan a la cola sus hijos
 * izquierdo y derecho, siempre que existan. De esta manera,
 * se visitan primero todos los nodos de un nivel antes de
 * continuar con el siguiente.
 *
 * Finalmente, el método main() permite ejecutar y comprobar
 * el funcionamiento del programa. Primero se crea un objeto
 * de la clase ArbolBinario. Luego se utiliza un ciclo for
 * mejorado para recorrer un arreglo que contiene los números
 * enteros del 1 al 7. Cada uno de esos números se incorpora
 * al árbol mediante el método insertar().
 *
 * Como la inserción se realiza por niveles, el árbol resultante
 * queda organizado de la siguiente manera:
 *
 *                  1
 *                /   \
 *               2     3
 *              / \   / \
 *             4   5 6   7
 *
 * Una vez construido el árbol, el método main() ejecuta los
 * cuatro recorridos y muestra sus resultados por pantalla.
 *
 * Los resultados esperados son:
 *
 * PRE-ORDEN:   1 2 4 5 3 6 7
 * IN-ORDEN:    4 2 5 1 6 3 7
 * POST-ORDEN:  4 5 2 6 7 3 1
 * POR NIVELES: 1 2 3 4 5 6 7
 *
 * En conclusión, este programa permite comprender cómo se
 * construye un árbol binario mediante nodos enlazados, cómo
 * se realiza la inserción por niveles utilizando una cola y
 * cómo se pueden recorrer todos sus elementos mediante
 * diferentes algoritmos. También permite observar la
 * diferencia entre los recorridos recursivos (pre-orden,
 * in-orden y post-orden) y el recorrido iterativo por niveles,
 * que utiliza una estructura auxiliar de tipo cola.
 *
 * ============================================================
 */

package Unidad4.Ejercicio1;

import java.util.LinkedList;
import java.util.Queue;

public class ArbolBinario {
    private Nodo raiz;

    private static class Nodo {
        int dato;
        Nodo izquierdo, derecho;
        Nodo(int dato) { 
            this.dato = dato; 
        }
    }
    
    // Inserta por niveles, sin ningún criterio de orden todavía (eso es el Paso 2)
    public void insertar(int valor) {
        Nodo nuevo = new Nodo(valor);
        if (raiz == null) { 
            raiz = nuevo; return; 
        }

        Queue<Nodo> cola = new LinkedList<>();
        cola.add(raiz);
        while (!cola.isEmpty()) {
            Nodo actual = cola.poll();
            if (actual.izquierdo == null) { 
                actual.izquierdo = nuevo; 
                return; 
            }

            cola.add(actual.izquierdo);

            if (actual.derecho == null) { 
                actual.derecho = nuevo; 
                return; 
            }

            cola.add(actual.derecho);
        }
    }

    // Pre-orden: raíz -> izquierdo -> derecho
    public void preOrden() { 
        preOrden(raiz); 
        System.out.println(); 
    }

    private void preOrden(Nodo n) {
        if (n == null) {
            return;
        }

        System.out.print(n.dato + " ");
        preOrden(n.izquierdo);
        preOrden(n.derecho);
    }

    // In-orden: izquierdo -> raíz -> derecho
    public void inOrden() { 
        inOrden(raiz); 
        System.out.println(); 
    }

    private void inOrden(Nodo n) {
        if (n == null) {
            return;
        }

        inOrden(n.izquierdo);
        System.out.print(n.dato + " ");
        inOrden(n.derecho);
    }

    // Post-orden: izquierdo -> derecho -> raíz
    public void postOrden() { 
        postOrden(raiz); 
        System.out.println(); 
    }

    private void postOrden(Nodo n) {
        if (n == null) {
            return;
        }

        postOrden(n.izquierdo);
        postOrden(n.derecho);
        System.out.print(n.dato + " ");
    }

    // Por niveles: usa una cola auxiliar (Unidad 3), no es recursivo
    public void porNiveles() {
        if (raiz == null) {
            return;
        }    

        Queue<Nodo> cola = new LinkedList<>();
        cola.add(raiz);
        while (!cola.isEmpty()) {
            Nodo actual = cola.poll();
            System.out.print(actual.dato + " ");
            if (actual.derecho != null) {
                cola.add(actual.derecho);
            }

            if (actual.izquierdo != null) {
                cola.add(actual.izquierdo);
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ArbolBinario arbol = new ArbolBinario();
        for (int v : new int[]{1, 2, 3, 4, 5, 6, 7}) {
            arbol.insertar(v);
        }

        System.out.print("Pre-orden:   "); 
        arbol.preOrden();

        System.out.print("In-orden:    "); 
        arbol.inOrden();

        System.out.print("Post-orden:  "); 
        arbol.postOrden();

        System.out.print("Por niveles: "); 
        arbol.porNiveles();
    }
}