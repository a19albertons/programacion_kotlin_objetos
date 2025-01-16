fun calcularEstadisticas(numeros: List<Int>): List<Double> {
    require(numeros.isNotEmpty())
    var menor = numeros.min().toDouble()
    var mayor = numeros.max().toDouble()
    var media = numeros.average()
    return listOf(menor, mayor, media)

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