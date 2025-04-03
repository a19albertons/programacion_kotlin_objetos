//fun main() {
//    val parlanchines: List<Parlanchin> = listOf(
//        Perro(12.5),
//        Gato(4.3),
//        RelojCuco()
//    )
//
//    // Un solo bucle para imprimir sonidos y pesos
//    for (p in parlanchines) {
//        println(p.habla())
//        if (p is Animal) {
//            println("Peso: ${p.peso} kg")
//        }
//    }
//}
//
//class RelojCuco : Parlanchin {
//    override fun habla():String {
//        return "¡Cucu, cucu, ..!"
//    }
//}
//
//class Gato(override var peso: Double) : Animal {
//    override fun habla():String {
//        return "¡Miau!"
//    }
//}
//class Perro(override var peso:Double) : Animal {
//    override fun habla():String {
//        return "¡Guau!"
//    }
//}
//
//interface Parlanchin {
//    fun habla():String
//}
//
//interface Animal : Parlanchin {
//
//    val peso: Double
//}