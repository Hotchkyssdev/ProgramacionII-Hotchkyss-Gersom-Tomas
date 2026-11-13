/* 
 * ============================================================
 * EXPLICACIÓN GENERAL DEL PROGRAMA: ÁRBOL BINARIO DE BÚSQUEDA
 * ============================================================
 *
 * Este programa implementa un Árbol Binario de Búsqueda (ABB),
 * también conocido como Binary Search Tree (BST), utilizando
 * una estructura de datos dinámica basada en nodos enlazados.
 *
 * Un árbol binario de búsqueda es una estructura de datos no
 * lineal en la que cada nodo puede tener como máximo dos hijos:
 * un hijo izquierdo y un hijo derecho. Su característica
 * principal es que mantiene un criterio de ordenamiento que
 * permite insertar y buscar elementos de manera eficiente.
 *
 * La regla fundamental de un árbol binario de búsqueda es:
 *
 * - Los valores menores que un nodo se ubican en su subárbol
 *   izquierdo.
 *
 * - Los valores mayores que un nodo se ubican en su subárbol
 *   derecho.
 *
 * - Los valores iguales no se insertan, ya que este programa
 *   no permite almacenar elementos duplicados.
 *
 * Gracias a esta organización, es posible descartar partes
 * del árbol durante una búsqueda, evitando recorrer todos
 * los elementos cuando la estructura está balanceada.
 *
 * ============================================================
 * 1. ESTRUCTURA GENERAL DEL ÁRBOL
 * ============================================================
 *
 * La clase principal se llama ArbolBinarioBusqueda y contiene
 * un atributo denominado raiz, que almacena la referencia
 * al primer nodo del árbol.
 *
 * La raíz representa el punto de partida para acceder a todos
 * los demás elementos. Si su valor es null, significa que
 * el árbol todavía está vacío.
 *
 * Dentro de la clase principal se declara una clase interna
 * llamada Nodo. Esta clase representa cada elemento individual
 * del árbol y contiene tres componentes:
 *
 * - dato: almacena el valor entero del nodo.
 *
 * - izquierdo: referencia al hijo izquierdo.
 *
 * - derecho: referencia al hijo derecho.
 *
 * Cuando un nodo no tiene alguno de sus hijos, la referencia
 * correspondiente contiene null.
 *
 * La clase Nodo posee un constructor que recibe un número
 * entero y lo almacena en el atributo dato. Las referencias
 * a los hijos comienzan en null, ya que inicialmente el nuevo
 * nodo no tiene conexiones con otros nodos.
 *
 * La declaración private static permite que esta clase
 * solamente sea utilizada dentro de ArbolBinarioBusqueda
 * y que no necesite una instancia externa para crear nodos.
 *
 * ============================================================
 * 2. MÉTODO INSERTAR
 * ============================================================
 *
 * El programa utiliza un método público llamado insertar(),
 * que recibe un valor entero y se encarga de incorporarlo
 * al árbol respetando las reglas de un árbol binario
 * de búsqueda.
 *
 * Este método llama a una segunda versión privada del mismo
 * método, que recibe dos parámetros: el nodo desde el cual
 * debe comenzar la inserción y el valor que se desea agregar.
 *
 * Esta segunda versión utiliza recursividad para encontrar
 * la posición correcta del nuevo elemento.
 *
 * El funcionamiento es el siguiente:
 *
 * 1. Si el nodo recibido es null, significa que se encontró
 *    una posición vacía. En ese lugar se crea y devuelve
 *    un nuevo nodo con el valor que se quiere insertar.
 *
 * 2. Si el valor que se quiere insertar es menor que el dato
 *    del nodo actual, se continúa la búsqueda por el subárbol
 *    izquierdo.
 *
 * 3. Si el valor que se quiere insertar es mayor que el dato
 *    del nodo actual, se continúa la búsqueda por el subárbol
 *    derecho.
 *
 * 4. Si el valor es igual al dato del nodo actual, no se
 *    realiza ninguna inserción. De esta manera se evitan
 *    los valores duplicados.
 *
 * Cada llamada recursiva devuelve el nodo correspondiente
 * y permite mantener las conexiones entre los diferentes
 * elementos del árbol.
 *
 * La asignación realizada en el método público:
 *
 * raiz = insertar(raiz, valor);
 *
 * permite actualizar la raíz cuando se inserta el primer
 * elemento, ya que inicialmente el árbol está vacío.
 *
 * ============================================================
 * 3. MÉTODO BUSCAR
 * ============================================================
 *
 * El programa también implementa un método público llamado
 * buscar(), que recibe un número entero y determina si ese
 * valor se encuentra almacenado dentro del árbol.
 *
 * Este método utiliza una segunda versión privada que realiza
 * la búsqueda de manera recursiva.
 *
 * Su funcionamiento es el siguiente:
 *
 * 1. Si el nodo recibido es null, significa que se llegó
 *    a una posición vacía sin encontrar el valor. En ese
 *    caso, el método devuelve false.
 *
 * 2. Si el valor buscado coincide con el dato del nodo actual,
 *    significa que el elemento fue encontrado y se devuelve
 *    true.
 *
 * 3. Si el valor buscado es menor que el dato del nodo actual,
 *    se continúa buscando por el subárbol izquierdo.
 *
 * 4. Si el valor buscado es mayor que el dato del nodo actual,
 *    se continúa buscando por el subárbol derecho.
 *
 * La búsqueda aprovecha el criterio de ordenamiento del árbol.
 * En lugar de revisar todos los nodos, compara el valor
 * buscado con el nodo actual y decide en qué dirección
 * continuar.
 *
 * Por ejemplo, si se busca el número 40 y el nodo actual
 * contiene el valor 50, sabemos que 40 solamente puede estar
 * en el subárbol izquierdo. Por lo tanto, se descarta todo
 * el subárbol derecho.
 *
 * El operador ternario utilizado en el método permite
 * seleccionar cuál de las dos llamadas recursivas realizar:
 *
 * valor < n.dato ? buscar(n.izquierdo, valor)
 *                : buscar(n.derecho, valor);
 *
 * Esto significa que, si el valor buscado es menor que el
 * actual, se busca por la izquierda; de lo contrario,
 * se busca por la derecha.
 *
 * La búsqueda tiene una complejidad promedio de O(log n)
 * cuando el árbol está razonablemente balanceado, porque
 * en cada paso se descarta una parte importante de los nodos.
 *
 * Sin embargo, si el árbol está muy desequilibrado, puede
 * llegar a tener una complejidad de O(n), ya que podría ser
 * necesario recorrer prácticamente todos los elementos.
 *
 * ============================================================
 * 4. RECORRIDO IN-ORDEN
 * ============================================================
 *
 * El método inOrden() permite imprimir todos los elementos
 * del árbol siguiendo un orden específico:
 *
 * 1. Primero se recorre el subárbol izquierdo.
 *
 * 2. Después se imprime el dato del nodo actual.
 *
 * 3. Finalmente se recorre el subárbol derecho.
 *
 * Este recorrido utiliza recursividad para visitar todos
 * los nodos del árbol.
 *
 * Cuando el nodo recibido es null, la llamada recursiva
 * finaliza porque no existe ningún elemento en esa posición.
 *
 * Una característica muy importante del recorrido in-orden
 * es que, en un árbol binario de búsqueda, los valores se
 * imprimen siempre de menor a mayor.
 *
 * Esto sucede porque todos los valores menores se encuentran
 * a la izquierda y todos los valores mayores se encuentran
 * a la derecha de cada nodo.
 *
 * Por lo tanto, el recorrido permite obtener los elementos
 * ordenados sin necesidad de utilizar otro algoritmo
 * de ordenamiento.
 *
 * ============================================================
 * 5. MÉTODO PRINCIPAL MAIN
 * ============================================================
 *
 * El método main() representa el punto de entrada del
 * programa y permite probar el funcionamiento del árbol.
 *
 * Primero se crea un objeto de la clase ArbolBinarioBusqueda.
 * Al momento de crearlo, el árbol se encuentra vacío porque
 * su atributo raiz inicialmente tiene el valor null.
 *
 * Luego se utiliza un ciclo for mejorado para recorrer un
 * arreglo que contiene los siguientes números:
 *
 * 50, 30, 70, 20, 40, 60, 80.
 *
 * Cada número se incorpora al árbol mediante el método
 * insertar(), que determina automáticamente su posición
 * correspondiente según las reglas del árbol binario
 * de búsqueda.
 *
 * Después de insertar todos los valores, el árbol queda
 * organizado de la siguiente manera:
 *
 *                   50
 *                 /    \
 *               30      70
 *              /  \    /  \
 *            20   40  60   80
 *
 * El número 50 es la raíz.
 * Los números 30 y 70 son sus hijos.
 * Los números 20 y 40 pertenecen al subárbol izquierdo.
 * Los números 60 y 80 pertenecen al subárbol derecho.
 *
 * A continuación, se ejecuta el método inOrden(), que imprime
 * los valores de menor a mayor:
 *
 * 20 30 40 50 60 70 80
 *
 * Finalmente, se realizan dos búsquedas para comprobar
 * el funcionamiento del método buscar():
 *
 * - Se busca el número 40. Como el valor existe dentro
 *   del árbol, el método devuelve true.
 *
 * - Se busca el número 45. Como el valor no existe dentro
 *   del árbol, el método devuelve false.
 *
 * Los resultados esperados por pantalla son:
 *
 * 20 30 40 50 60 70 80
 * ¿Contiene 40? true
 * ¿Contiene 45? false
 *
 * ============================================================
 * 6. COMPLEJIDAD Y CARACTERÍSTICAS
 * ============================================================
 *
 * La eficiencia de las operaciones de inserción y búsqueda
 * depende de la altura del árbol y de qué tan balanceado
 * se encuentre.
 *
 * - Inserción: O(log n) en un árbol balanceado y O(n)
 *   en el peor caso.
 *
 * - Búsqueda: O(log n) en un árbol balanceado y O(n)
 *   en el peor caso.
 *
 * - Recorrido in-orden: O(n), porque es necesario visitar
 *   todos los nodos para imprimirlos.
 *
 * El espacio adicional utilizado por la recursividad depende
 * de la altura del árbol. En un árbol balanceado es O(log n),
 * mientras que en el peor caso puede llegar a ser O(n).
 *
 * En conclusión, este programa permite comprender el
 * funcionamiento de un árbol binario de búsqueda, una
 * estructura dinámica que organiza los datos mediante
 * comparaciones entre sus nodos.
 *
 * Sus principales ventajas son la posibilidad de insertar
 * elementos manteniendo un criterio de ordenamiento, buscar
 * valores descartando ramas que no pueden contenerlos y
 * obtener todos los elementos ordenados mediante el recorrido
 * in-orden.
 *
 * ============================================================
 */

package Unidad4.Ejercicio2;

public class ArbolBinarioBusqueda {
    private Nodo raiz;

    private static class Nodo {
        int dato;
        Nodo izquierdo, derecho;
        Nodo(int dato) { 
            this.dato = dato; 
        }
    }
    
    public void insertar(int valor) { 
        raiz = insertar(raiz, valor); 
    }
    
    private Nodo insertar(Nodo n, int valor) {
        if (n == null) {
            return new Nodo(valor); 
        }

        if (valor < n.dato) {
            n.izquierdo = insertar(n.izquierdo, valor);
        } else if (valor > n.dato) {
            n.derecho = insertar(n.derecho, valor);
        }
        return n;
    }

    public boolean buscar(int valor) { 
        return buscar(raiz, valor); 
    }

    private boolean buscar(Nodo n, int valor) {
        if (n == null) {
            return false;
        }

        if (valor == n.dato) {
            return true;
        }

        // Se descarta la mitad del árbol en cada paso: por eso la búsqueda es O(log n) si está balanceado
        return valor < n.dato ? buscar(n.izquierdo, valor) : buscar(n.derecho, valor);
    }

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

    public static void main(String[] args) {
        ArbolBinarioBusqueda abb = new ArbolBinarioBusqueda();
        for (int v : new int[]{50, 30, 70, 20, 40, 60, 80}) {
            abb.insertar(v);
        }

        abb.inOrden(); // 20 30 40 50 60 70 80 - siempre queda ordenado
        System.out.println("¿Contiene 40? " + abb.buscar(40)); // true
        System.out.println("¿Contiene 45? " + abb.buscar(45)); // false
    }
}