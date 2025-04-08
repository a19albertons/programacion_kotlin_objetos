fun main(){
    println("total de puntos: " + Punto.contador)
    Punto(0, 0)
    Punto(3, 0)
    println("total de puntos: " + Punto.contador)
    Punto(2, 0)
    Punto(0, 4)
    println("total de puntos: " + Punto.contador)
}

class Punto(val x: Int, val y: Int) {
    init {
        contador= contador+1
    }
    companion object {
        var contador: Int = 0
    }
}