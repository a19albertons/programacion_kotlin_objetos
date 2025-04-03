import kotlin.math.PI
//
//class Cuadrado(var tamano: Double, color: String):Figura(color) {
//    override fun area(): Double {
//        return tamano*tamano
//    }
//}
//class Circulo(var tamano: Double, color: String):Figura(color) {
//    override fun area(): Double {
//        return tamano*tamano* PI
//    }
//}
//
//open class Figura(var color: String) {
//    open fun area()=99.99
//
//}
//
//
//fun main(){
//    val figura = Figura("rojo")
//    val cuadrado1 = Cuadrado(1.0, "azul")
//    val cuadrado2 = Cuadrado(2.0, "rojo")
//    val circulo1 = Circulo(2.0, "blanco")
//    val circulo2 = Circulo(1.0, "negro")
//    println(""+ figura.area()+"  "+cuadrado1.area()+"  "+cuadrado2.area()+"  "+circulo1.area()+ "  "+ circulo2.area())
//    println(cuadrado1 is Figura && cuadrado2 is Figura && circulo1 is Figura && circulo2 is Figura)
//}