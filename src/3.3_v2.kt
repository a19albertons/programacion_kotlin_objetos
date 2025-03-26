//class Circulo(origen: Punto, private val radio: Int) {
//    var origen= origen.copy()
//        get() = field.copy()
//        set(value) {
//            field = Punto(value.x,value.y)
//        }
//
//
//    override fun toString(): String {
//        return ""+this.origen.x+" "+this.origen.y+" "+this.radio
//    }
//}
//
//data class Punto(var x: Int, var y: Int) {
//
//}
//
//fun main() {
//    var p = Punto(4, 5)
//    val c1 = Circulo(p, 10)
//    println(c1)
//    p = Punto(20,20)
//    c1.origen = p //se invoca a set
//    println(c1) // El origen del círculo original SI cambia a traves de set
//    p.x=999
//    println(c1) // El origen del círculo no cambia aunque modifique p
//}