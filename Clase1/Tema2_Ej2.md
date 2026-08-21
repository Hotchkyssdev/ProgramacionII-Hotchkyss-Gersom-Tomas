# Tema 2 — Ejercicio 2: Elementos duplicados

## Algoritmo 1 — Fuerza bruta

No utiliza estructuras auxiliares.

```text
Algoritmo TieneDuplicadosFuerzaBruta
    Para i <- 0 Hasta N - 2 Hacer
        Para j <- i + 1 Hasta N - 1 Hacer
            Si arreglo[i] = arreglo[j] Entonces
                Retornar Verdadero
            FinSi
        FinPara
    FinPara

    Retornar Falso
FinAlgoritmo
```

### Complejidad
**$O(n^2)$**  
En el peor caso hay que comparar prácticamente todos los pares de elementos.

---

## Algoritmo 2 — Ordenar y comparar consecutivos

```text
Algoritmo TieneDuplicadosOrdenando
    Ordenar arreglo

    Para i <- 0 Hasta N - 2 Hacer
        Si arreglo[i] = arreglo[i + 1] Entonces
            Retornar Verdadero
        FinSi
    FinPara

    Retornar Falso
FinAlgoritmo
```

La ordenación con un algoritmo eficiente como Merge Sort o Heap Sort tiene complejidad:  
$$O(n \log n)$$

Luego, recorrer el arreglo buscando elementos consecutivos cuesta:  
$$O(n)$$

Por lo tanto:  
$$O(n \log n) + O(n) = O(n \log n)$$

---

## ¿Cuál conviene para 1.000.000 de elementos?

Conviene **ordenar y recorrer**, porque:
- **Fuerza bruta** $\rightarrow O(n^2)$
- **Ordenar + recorrer** $\rightarrow O(n \log n)$

Con un millón de elementos, la diferencia es enorme. El algoritmo de fuerza bruta puede llegar a realizar del orden de $500.000.000.000$ comparaciones, mientras que uno basado en ordenamiento eficiente escala muchísimo mejor.