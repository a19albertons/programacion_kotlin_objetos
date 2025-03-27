import kotlin.math.PI

class Cuadrado(var tamano: Double):Figura() {
    override fun area(): Double {
        return tamano*tamano
    }
    override fun dibujar():String{
        return "Dibujando un cuadrado"
    }
}
class Circulo(var tamano: Double):Figura() {
    override fun area(): Double {
        return tamano*tamano* PI
    }
    override fun dibujar():String{
        return "Dibujando un circulo"
    }
}

open class Figura() {
    open fun area()=99.99
    open fun dibujar():String{
        return "Dibujando una figura"
    }
}

fun main(){
    var figura:Figura
    figura = Cuadrado(1.0)//se le pasa el tamaño del lado
    println(figura.dibujar() + " de área "+figura.area())
    figura= Circulo(2.0)//se le pasa el tamaño del radio
    println(figura.dibujar() + " de área "+figura.area())
}