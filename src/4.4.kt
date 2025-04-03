//class Persona(var nombre:String, var edad:Int) {
//    override fun equals(other: Any?): Boolean {
//        if (this === other) return true
//        if (javaClass != other?.javaClass) return false
//
//        other as Persona
//
//        return edad == other.edad
//    }
//
//    override fun hashCode(): Int {
//        return edad
//    }
//}
//data class Persona2(var nombre:String, var edad:Int)
//class Persona3(var nombre:String, var edad:Int)
//
//fun main() {
//    val p1 = Persona("A", 30)
//    val p2 = Persona("B", 30)
//    val p3 = Persona("A", 35)
//    val p4 = Persona("A", 30)
//    println("Comparaciones con Persona SIN data class:")
//    println(p1 == p2)
//    println(p1 == p3)
//    println(p1 == p4)
//
//    val pd1 = Persona2("A", 30)
//    val pd2 = Persona2("B", 30)
//    val pd3 = Persona2("A", 35)
//    val pd4 = Persona2("A", 30)
//    println("\nComparaciones con Persona2 CON data class:")
//    println(pd1 == pd2)
//    println(pd1 == pd3)
//    println(pd1 == pd4)
//
//    //con persona3
//    val psin1 = Persona3("A", 30)
//    val psin2 = Persona3("B", 30)
//    val psin3 = Persona3("A", 35)
//    val psin4 = Persona3("A", 30)
//    println("\nComparaciones con Persona3 SIN sobreescribir:")
//    println(psin1 == psin2)
//    println(psin1 == psin3)
//    println(psin1 == psin4)
//}