//interface Serie {
//    fun obtenerSiguiente(): Int // Devuelve el siguiente número de la serie
//    fun restablecer() // Reinicia la serie
//    fun establecerInicio(x: Int) // Establece el valor inicial
//}
//fun main() {
//    val masDos = MasDos()
//    val porTres = PorTres()
//
//    println("Serie MasDos:")
//    repeat(6) {
//        print("${masDos.obtenerSiguiente()} ")
//    }
//
//    println("\nRestableciendo MasDos ...")
//    masDos.restablecer()
//
//    repeat(6) {
//        print("${masDos.obtenerSiguiente()} ")
//    }
//
//    println("\nel último es múltiplo de 10: ${masDos.esMultiploDe10()}")
//    println("Serie PorTres:")
//    repeat(4) {
//        print("${porTres.obtenerSiguiente()} ")
//    }
//
//    println("\nEmpezando PorTres en 2 ...")
//    porTres.establecerInicio(2)
//
//    repeat(4) {
//        print("${porTres.obtenerSiguiente()} ")
//    }
//    println("\n el último es múltiplo de 5: ${porTres.esMultiploDe5()}")
//}
//
//class PorTres : Serie {
//    var valor= 1
//    override fun obtenerSiguiente(): Int {
//        valor *= 3
//        return valor
//    }
//
//    override fun restablecer() {
//        valor=0
//    }
//
//    override fun establecerInicio(x: Int) {
//        valor=x
//    }
//    fun esMultiploDe5():Boolean {
//        if (valor%5!=0){
//            return false
//        }
//        else {
//            return true
//        }
//    }
//}
//
//class MasDos : Serie {
//    var valor= 0
//    override fun obtenerSiguiente(): Int {
//        valor+=2
//        return valor
//    }
//
//    override fun restablecer() {
//        valor=0
//    }
//
//    override fun establecerInicio(x: Int) {
//        valor=x
//    }
//    fun esMultiploDe10():Boolean {
//        if (valor%10!=0){
//            return false
//        }
//        else {
//            return true
//        }
//    }
//}