//open class Animal {
//    open fun hacerSonido() = "Sonido genérico"
//}
//
//class Perro : Animal() {
//    override fun hacerSonido() = "Guau guau"
//}
//
//class Gato: Animal(){
//    override fun hacerSonido() = "Miau miau"
//}
//
//fun imprimirPar(par: Par<String, Animal>) {
//    println("Clave: ${par.primero}, Valor: ${par.segundo.hacerSonido()}")
//}
//
//fun main() {
//    val parPerro: Par<String, Perro> = Par("Perro Mastín", Perro())
//    imprimirPar(parPerro)
//    val parGato: Par<String, Gato> =  Par("Gato siamés", Gato())
//    imprimirPar(parGato)
//}
//
//class Par<T, out U>(val primero: T, val segundo: U) {
//
//}