data class pequeñas(val una:String, val dos: String, val tres: String)
fun tres_mas_pequeños(palabras:String): pequeñas {
    val lista_palabras= palabras.split(" ").sorted()
    val una = lista_palabras[0]
    val dos = lista_palabras[1]
    val tres = lista_palabras[2]
    return pequeñas(una, dos, tres)
}

fun main(){
    val entrada= readln()
    val (uno, dos, tres) = tres_mas_pequeños(entrada)
    print(uno+" "+dos+" "+tres)
}