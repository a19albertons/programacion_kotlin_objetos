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
//
//    fun desplazarVerticalmente(desplazamiento: Int) {
//        this.origen = Punto(origen.x,origen.y+desplazamiento)
//    }
//    fun desplazarHorizontalmente(desplazamiento: Int) {
//        this.origen = Punto(origen.x+desplazamiento,origen.y)
//    }
//}
//
//data class Punto(var x: Int, var y: Int) {
//
//}
//
//fun main(){
//    var p = Punto(4, 5)
//    val c1 = Circulo(p, 10)
//    println(c1)
//    c1.origen.x = 999  //observa que c1.origen invoca get()
//    println(c1) // El origen del círculo original no cambia
//    p = Punto(20, 20)
//    c1.origen = p // Se invoca a set
//    println(c1) // El origen del círculo original SÍ cambia a través de set
//    p.x = 999
//    println(c1) // El origen del círculo no cambia aunque modifique p
//    c1.desplazarVerticalmente(5)
//    println(c1) // Mueve el círculo hacia arriba
//    c1.desplazarHorizontalmente(-3)
//    println(c1) // Mueve el círculo hacia la izquierda
//}