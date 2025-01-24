import kotlin.math.abs
import kotlin.math.sqrt

class Punto2D(var x: Double =0.0, var y: Double =0.0){

    constructor(p: Punto2D): this(p.x, p.y){

    }
    fun flip(){
        val temporal = this.x
        this.x = this.y
        this.y = temporal
    }
    fun dist(p: Punto2D):Double{
        return (sqrt((p.x-this.x) *(p.x-this.x)+(p.y-this.y)*(p.y-this.y)))
    }
    fun manhattanDist(p: Punto2D):Double{
        return (abs(p.x-this.x) + abs(p.y-this.y))
    }
    fun slope(p: Punto2D):Double {
        val salto= abs(p.x-this.x).toInt()
        val cuesta_total=(p.y-this.y)
        var devolver= abs(p.x-this.x)
        for (i in 1..salto-1){
            devolver /= cuesta_total
        }
        return devolver
    }

    override fun toString(): String {
        return "Punto2D[$x,$y]"
    }

}
fun main(){
    var p = Punto2D()
    println(p)

    p = Punto2D(3.2, -4.8)
    println(p)

    var p1 = Punto2D(4.5, 5.5)
    var p2 = Punto2D(p1)
    println(p2)





    p = Punto2D()
    p.x=5.5
    p.y=-2.0
    println(p)

    p = Punto2D(5.5, -2.0)
    println(""+p.x + " " + p.y)

    p = Punto2D(3.2, -4.8)
    p.flip()
    println(p)


    p = Punto2D(-3.0, 4.0)
    println(p.dist( Punto2D()))
    println(p.dist( Punto2D(2.5, 1.5)))

    println()
    p1 = Punto2D(-2.0, 3.0)
    p2 = Punto2D(2.0, 1.0)
    println(p1.manhattanDist(p2))
    println(p2.manhattanDist(p1))

    println()
    p1 = Punto2D(-2.0, 3.0)
    p2 = Punto2D(2.0, 1.0)
    println(p1.slope(p2))
    p1.y=-1.0
    println(p1.slope(p2))
}