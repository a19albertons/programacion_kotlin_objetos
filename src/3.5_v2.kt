data class Punto(var x: Int, var y: Int){
    override fun toString(): String {
        return "($x,$y)"
    }
}

class Rectangulo(v1: Punto,v2:Punto){
    private var _v1=v1.copy()
    var v1: Punto
        get() = _v1.copy()
        set(value) {
            _v1=value.copy()
        }
    private var v2=v2.copy()

    override fun toString(): String {
        return "("+_v1.x+","+_v1.y+"),("+v2.x+","+v2.y+")"
    }
}

fun main() {
    //Verificar que getter devuelve copia (modificación no afecta al original)
    val r1 = Rectangulo(Punto(1,1), Punto(5,5))
    var miPunto = r1.v1  // Devuelve copia
    miPunto.x = 99       // Modificamos la copia
    println("miPunto modificado: $miPunto")  // Debe mostrar (99,1)
    println("r1 después de modificar copia: $r1")  // Debe mantener (1,1),(5,5)

    //Verificar que setter también hace copia
    val nuevoPunto = Punto(10,10)
    r1.v1 = nuevoPunto   // Setter debería hacer copia
    nuevoPunto.x = 20     // Modificamos el punto original
    println("nuevoPunto modificado: $nuevoPunto")  // Debe mostrar (20,10)
    println("r1 después de asignación y modificación: $r1")  // Debe mantener (10,10),(5,5)
}