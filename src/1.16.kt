import java.util.Scanner

fun main(){
    val sc=Scanner(System.`in`)
    while (sc.hasNext()){
        var numero =sc.nextBigInteger()
        numero++
        val numero_puntos= numero.toString().reversed().chunked(3).joinToString(".").reversed()
        println(numero_puntos)

    }

}