//class Circulo(origen: Punto, private val radio: Int) {
//    val origen= origen.copy()
//        get() = field.copy()
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
//fun main(){
//    var p = Punto(4, 5)
//    val c1 = Circulo(p, 10)
//    println(c1)
////println(c1.radio) //error, no es posible
//    c1.origen.x = 999  //observa que c1.origen invoca get()
//    println(c1) // El origen del círculo original no cambia
//    p= c1.origen //invocams get()
//    p.x=8888
//    println(c1) // El origen del círculo no se modificon sentencia anterior
//}