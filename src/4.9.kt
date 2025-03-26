import kotlin.math.PI

class Cuadrado(var tamano: Double, color: String):Figura(color) {
    override fun area(): String {
        return ""+tamano*tamano
    }
}
class Circulo(var tamano: Double, var color: String) {
    var f:Figura = Figura(color)
    fun area(): String {
        return ""+tamano*tamano* PI
    }
    fun color():String{
        return "El color de la figura es $color"
    }
}

open class Figura(var color: String) {
    open fun area(): String {
        return "99.99"
    }
    fun color():String{
        return "El color de la figura es $color"
    }
}


fun main(){
    val figura = Figura("rojo")
    println(figura.color())
    val cuadrado1 = Cuadrado(1.0, "azul")
    println(cuadrado1.color()+" "+cuadrado1.area())
    val circulo1 = Circulo(2.0, "blanco")
    println(circulo1.color()+" "+circulo1.area() + " ")
    println(circulo1 as Any !is Figura)
    println(circulo1.f is Figura)
    println(cuadrado1 is Figura)
}