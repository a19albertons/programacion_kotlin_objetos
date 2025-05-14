fun main() {
    imprimirCualquierValor(42)          // Int
    imprimirCualquierValor("Hola")      // String
    imprimirCualquierValor(3.14)        // Double
    imprimirCualquierValor(true)        // Boolean
    imprimirCualquierValor(listOf(1, 2, 3)) // Lista
}
inline fun <reified T> imprimirCualquierValor(value: T) {
    val typeName = value!!::class.simpleName // Use runtime type of value
    println("El valor recibido es: $value (Tipo: $typeName)")
}