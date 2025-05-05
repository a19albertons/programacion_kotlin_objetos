/*
Recorrido en anchura de un arbol binario

El recorrido en anchura o por niveles es uno de los recorridos típicos de un árbol.

Por ejemplo, para el árbol

su recorrido en anchura, escribiendo cada nivel en una línea sería

2

1 3

4
Entrada:

un árbol binario de enteros descrito en preorden en una línea de texto. -1 significa árbol vacío.

Salida:

impresión de cada nivel en una linea

Ejemplo entrada
2 1 -1 -1 3 -1 4 -1 -1

Salida
2
1 3
4
 */

data class Node(val value: Int, var left: Node? = null, var right: Node? = null)

fun buildTree(nums: List<Int>, idx: Int): Pair<Node?, Int> {
    if (nums[idx] == -1) return Pair(null, idx + 1)
    val node = Node(nums[idx])
    val (leftNode, nextIdx) = buildTree(nums, idx + 1)
    node.left = leftNode
    val (rightNode, finalIdx) = buildTree(nums, nextIdx)
    node.right = rightNode
    return Pair(node, finalIdx)
}

fun printLevelOrder(root: Node?) {
    if (root == null) return
    val queue = ArrayDeque<Node>()
    queue.add(root)
    while (queue.isNotEmpty()) {
        val levelSize = queue.size
        repeat(levelSize) { i ->
            val node = queue.removeFirst()
            print(node.value)
            if (i < levelSize - 1) print(" ")
            node.left?.let { queue.add(it) }
            node.right?.let { queue.add(it) }
        }
        println()
    }
}

fun main() {
    val nums = readln().split(" ").map { it.toInt() }
    val (root, _) = buildTree(nums, 0)
    printLevelOrder(root)
}

