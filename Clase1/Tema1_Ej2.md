# Ejercicio 2 — Clasificación de triángulos

El pseudocódigo original tiene un problema: no comprueba que los lados realmente puedan formar un triángulo.

Por ejemplo:
- a = 1
- b = 2
- c = 10

El algoritmo diría:
`Escaleno`

Pero es incorrecto, porque 1 + 2 < 10, por lo que esos tres segmentos no pueden formar un triángulo.

También conviene rechazar lados <= 0.

## Pseudocódigo corregido

```text
Algoritmo ClasificarTriangulo
    Leer a, b, c

    Si a <= 0 O b <= 0 O c <= 0 Entonces
        Imprimir "Error: los lados deben ser positivos"
    Sino Si a + b <= c O a + c <= b O b + c <= a Entonces
        Imprimir "No forman un triángulo válido"
    Sino Si a = b Y b = c Entonces
        Imprimir "Equilátero"
    Sino Si a = b O a = c O b = c Entonces
        Imprimir "Isósceles"
    Sino
        Imprimir "Escaleno"
    FinSi
FinAlgoritmo
```

## Tabla de casos de prueba

| a | b | c | Resultado |
| :---: | :---: | :---: | :--- |
| 1 | 2 | 10 | No forman un triángulo válido |
| 3 | 3 | 3 | Equilátero |
| 3 | 3 | 4 | Isósceles |
| 3 | 4 | 5 | Escaleno |