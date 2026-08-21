# Tema 3 - Ejercicio 2: Potencia recursiva e iterativa

## Caso de prueba

Se utilizaron los siguientes valores:

- Base: `2`
- Exponente: `10`

### Resultado

- Potencia recursiva: `1024`
- Potencia iterativa: `1024`

Ambas versiones devuelven el mismo resultado.

## Comparación

La versión recursiva realiza una llamada al método por cada disminución del exponente. Para exponentes muy grandes, esto puede provocar una gran cantidad de llamadas y aumentar el uso de la pila de ejecución.

La versión iterativa utiliza un bucle y no necesita realizar llamadas recursivas.

## Conclusión

Para un programa real pensado para trabajar con exponentes grandes, se preferiría la versión iterativa, ya que evita el crecimiento de la pila producido por las llamadas recursivas y resulta más segura para valores de exponente muy grandes.