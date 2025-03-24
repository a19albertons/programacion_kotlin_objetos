class Circulo(origen: Punto, private val radio: Int) {
    private val _origen = origen.copy()
    val origen: Punto
        get() = _origen.copy()

    override fun toString(): String {
        return ""+this.origen.x+" "+this.origen.y+" "+this.radio
    }

    fun desplazarVerticalmente(desplazamiento: Int) {
        _origen.y += desplazamiento
    }
    fun desplazarHorizontalmente(desplazamiento: Int) {
        _origen.x += desplazamiento
    }
}

data class Punto(var x: Int, var y: Int) {

}
fun main() {
    var p = Punto(20, 20)
    val c1 = Circulo(p, 10)
    println(c1)
    c1.origen.x = 999  //observa que c1.origen invoca get()
    println(c1) // El origen del círculo original no cambia

    //c1.origen = p // ERROR no se permite modificar origen directamente desde main

    c1.desplazarVerticalmente(5)
    println(c1) // Mueve el círculo hacia arriba
    c1.desplazarHorizontalmente(-3)
    println(c1) // Mueve el círculo hacia la izquierda
}