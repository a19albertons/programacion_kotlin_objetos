//data class Persona(val nombre: String, val edad: Int)
//fun main() {
//    println("usamos la clase Pair de Kotlin")
//    val parKotlin= Pair("hola", 5.6)
//    println(" first es ${parKotlin.first} y second es ${parKotlin.second}")
//    println()
//
//    println("usamos nuestra clase ParUnTipo")
//    //creamos nuestra clase ParUnTipo que solo tiene un tipo
//    //para dejar esto claro especificamos los tipos de las variables
//    val par1:ParUnTipo<Int> = ParUnTipo(1, 2)
//    val (a1, b1) = par1//data admite destructuración
//    println(" first es $a1 y second es $b1")
//    val par2:ParUnTipo<String> = ParUnTipo("hola", "mundo")
//    println(" first es ${par2.first} y second es ${par2.second}")
//    val par3:ParUnTipo<Persona> = ParUnTipo(Persona("Elías", 30), Persona("Román", 25))
//    println(" first es ${par3.first} y second es ${par3.second}")
//    println()
//
//    println("usamos nuestra clase ParDosTipos")
//    //ParDosTipos se parece más a Pair de Kotlin
//    val par4:ParDosTipos<String,Double> = ParDosTipos("hola", 5.6)
//    println(" first es ${par4.first} y second es ${par4.second}")
//
//}
//
//class ParUnTipo<T>(val first: T, val second: T) {
//    operator fun component1(): T {
//        return first
//    }
//    operator fun component2(): T {
//        return second
//    }
//}
//
//class ParDosTipos<T, U>(val first: T, val second: U)