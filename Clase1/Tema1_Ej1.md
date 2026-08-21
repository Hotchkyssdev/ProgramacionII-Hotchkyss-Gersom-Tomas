# Ejercicio 1 — Determinar si un número es primo

## Análisis del problema
Un número primo es un número entero mayor que 1 que solamente puede dividirse exactamente por 1 y por sí mismo.

Por lo tanto:
- Si n < 0, se considera un dato de error.
- Si n = 0 o n = 1, no es primo.
- Si n = 2, es primo.
- Para números mayores que 2, hay que verificar si existe algún divisor entre 2 y n - 1.

## Pseudocódigo:
```text
Algoritmo VerificarPrimo
    Leer n

    Si n < 0 Entonces
        Imprimir "Error: el número no puede ser negativo"
    Sino
        Si n < 2 Entonces
            Imprimir "No es primo"
        Sino
            esPrimo <- Verdadero

            Para i <- 2 Hasta n - 1 Hacer
                Si n MOD i = 0 Entonces
                    esPrimo <- Falso
                FinSi
            FinPara

            Si esPrimo Entonces
                Imprimir "Es primo"
            Sino
                Imprimir "No es primo"
            FinSi
        FinSi
    FinSi
FinAlgoritmo
```

## Tabla de casos de prueba

| Caso | Entrada | Esperado |
| :--- | :--- | :--- |
| 1 | 0 | No es primo |
| 2 | 1 | No es primo |
| 3 | 2 | Es primo |
| 4 | 7 | Es primo |
| 5 | 10 | No es primo |
| 6 | -5 | Error: número negativo |
