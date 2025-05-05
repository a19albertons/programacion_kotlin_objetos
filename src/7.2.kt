fun main(){
    var entrada = readlnOrNull()
    while (entrada != null) {
        val array = ArrayDeque<Char>()
        var correcto=true
        if (entrada != null) {
            for (i in entrada){
                when (i) {
                    '(', '[', '{' -> array.add(i)
                    ')' -> if (array.lastOrNull() == '(') array.removeLast() else { println("NO"); correcto = false }
                    ']' -> if (array.lastOrNull() == '[') array.removeLast() else { println("NO"); correcto = false }
                    '}' -> if (array.lastOrNull() == '{') array.removeLast() else { println("NO"); correcto = false }
                }
            }
        }
        entrada= readlnOrNull()
        if (correcto == false){
            continue
        }
        if (array.isEmpty()){
            println("YES")
        }
        else {
            println("NO")
        }

    }
}