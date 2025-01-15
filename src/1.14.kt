class pequeñas(var lista:String) {
    val lista_palabras= lista.split(" ").sorted()
    operator fun component1() = lista_palabras[0]
    operator fun component2() = lista_palabras[1]
    operator fun component3() = lista_palabras[2]
}


fun main(){
    val entrada= readln()
    val (uno, dos, tres) = pequeñas(entrada)
    print(uno+" "+dos+" "+tres)
}