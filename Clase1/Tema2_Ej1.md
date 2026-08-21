# Tema 2 — Eficiencia y complejidad

## Ejercicio 1

### Fragmento A
```text
imprimir arr[0]
```
**Complejidad:** $O(1)$  
No importa cuánto crezca $n$: solamente se realiza una operación.

---

### Fragmento B
```text
para i de 0 a n
    para j de 0 a n
        imprimir i, j
```
**Complejidad:** $O(n^2)$  
Hay dos bucles anidados y cada uno puede ejecutarse aproximadamente $n$ veces:  
$$n \times n = n^2$$

---

### Fragmento C
```text
mientras n > 1
    n = n / 2
    contador++
```
**Complejidad:** $O(\log n)$  
En cada iteración $n$ se divide por 2. Por eso la cantidad de iteraciones crece logarítmicamente.

---

### Fragmento D
```text
para i de 0 a n
    para j de 0 a n
        para k de 0 a n
            imprimir i, j, k
```
**Complejidad:** $O(n^3)$  
Hay tres bucles anidados:  
$$n \times n \times n = n^3$$

---

## Resultado final

| Fragmento | Complejidad |
| :---: | :---: |
| **A** | $O(1)$ |
| **B** | $O(n^2)$ |
| **C** | $O(\log n)$ |
| **D** | $O(n^3)$ |