/*
Altura de un árbol general

https://www.aceptaelreto.com/problem/statement.php?id=310

En un árbol general el número de hijos de cada nodo es variable, desde cero en el caso de una hoja hasta cierto número máximo que se llama el grado del árbol. La altura de una hoja es 1; si el árbol tiene hijos entonces su altura es 1 más el máximo de las alturas de sus hijos.

De los siguientes árboles generales, el de la izquierda tiene altura 3 y el de la derecha tiene altura 5.
Dos árboles generales de alturas diferentes
Entrada

La entrada comienza indicando el número de casos de prueba que vendrán a continuación. Cada caso consiste en la descripción de un árbol general en una línea: primero aparece el número de hijos que tiene la raíz y a continuación aparecen las descripciones, como árboles generales, de cada uno de sus hijos, de izquierda a derecha.
Salida

Para cada árbol, se escribirá una línea con su altura.

nota: en este problema en acepta el reto (a fecha de abril 2024) no mandan arboles gigantes que provoquen RTE por stack overflow. Si quieres, puedes crear el árbol en memoria recursivamente sin problema para luego imprimirlo en preorden y verlo en una versión de prueba.


Ejemplo: entrada
2
3 2 0 0 0 1 0
2 4 0 0 2 0 1 0 0 0

Ejemplo salida
3
5
 */

fun main() {
    val t = readln().toInt()
    repeat(t) {
        val nums = readln().split(" ").map { it.toInt() }
        val (h, _) = computeHeight(nums, 0)
        println(h)
    }
}

fun computeHeight(nums: List<Int>, idx: Int): Pair<Int, Int> {
    val k = nums[idx]
    var current = idx + 1
    var maxH = 0
    repeat(k) {
        val (h, nextIdx) = computeHeight(nums, current)
        if (h > maxH) maxH = h
        current = nextIdx
    }
    val height = if (k == 0) 1 else 1 + maxH
    return Pair(height, current)
}

