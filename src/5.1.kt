fun main() {
    imprimirCualquierValor(42)          // Int
    imprimirCualquierValor("Hola")      // String
    imprimirCualquierValor(3.14)        // Double
    imprimirCualquierValor(true)        // Boolean
    imprimirCualquierValor(listOf(1, 2, 3)) // Lista
}
fun imprimirCualquierValor(cualquiera: Any) {
    println("El valor recibido es: "+cualquiera)
}