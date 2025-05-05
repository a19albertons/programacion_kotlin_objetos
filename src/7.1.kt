fun main() {
    println( parentesisBalanceados("((2 + 3) * (4 - 1))")  )
    println( parentesisBalanceados("(2 + 3)) * (4 - 1)")   )
    println( parentesisBalanceados("(2 + 3) * (4 - 1(")  )
    println( parentesisBalanceados("((2 + 3) * (4 - 1)")  )
}
fun parentesisBalanceados(entrada: String): Boolean {
    val array = ArrayDeque<Char>()
    for (i in entrada){
        when (i) {
            '(' -> array.add(i)
            ')' -> if (array.isEmpty()) return false else array.removeFirst()
        }
    }
    return array.isEmpty()
}