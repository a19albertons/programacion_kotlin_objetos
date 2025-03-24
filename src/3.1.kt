//class Circulo(origen: Punto, private val radio: Int) {
//    val origen= origen.copy()
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
//fun main() {
//    val p = Punto(4, 5)
//    val c1 = Circulo(p, 10)
//    println(c1)
//    //origen y radio son private, no son accesibles
//    //println(c1.origen)
//    //println(c1.radio)
//
//    p.x = 99//cambio x de p pero no cambio coordenadas del circulo
//    println(p.x)
//    println(c1)
//}