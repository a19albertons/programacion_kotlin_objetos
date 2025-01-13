import java.math.BigInteger
import java.util.Scanner

fun main(){
    val sc=Scanner(System.`in`)
    while (sc.hasNext()){
        val numero =sc.nextBigInteger()
        val sumar = BigInteger.valueOf(1)
        val suma = numero+sumar
        val suma_string= suma.toString()
        val nueva_string= StringBuilder()
        var contar=0
        for (i in suma_string.length - 1 downTo 0) {
            nueva_string.append(suma_string[i])
            contar++
            if (contar == 3 && i != 0) {
                nueva_string.append(".")
                contar = 0
            }
        }
        println(nueva_string.reverse())

    }

}