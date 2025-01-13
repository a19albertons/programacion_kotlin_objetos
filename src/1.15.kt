data class Estadisticas (var menor:Float, var mayor:Float, var media:Double)
fun calcularEstadisticas(numeros: List<Int>): Estadisticas{
    var menor = numeros.min().toFloat()
    var mayor = numeros.max().toFloat()
    var media = numeros.average()
    return Estadisticas(menor, mayor, media)

}

fun main() {
    var numeros = listOf(10, 20, 30, 40, 50)
    var (menor, mayor, media) = calcularEstadisticas(numeros)
    println("Menor: $menor, Mayor: $mayor, Media: $media")
    numeros= listOf(10,9,8,7,6,5,4,3,2,1)

    //(menor, mayor, media) = calcularEstadisticas(numeros)     //no es posible
    var (menor2, mayor2, media2) = calcularEstadisticas(numeros)
    println("Menor: $menor2, Mayor: $mayor2, Media: $media2")
}