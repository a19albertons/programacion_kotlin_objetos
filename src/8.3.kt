class Empleado(val numero: Int, val nombre: String) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Empleado

        if (numero != other.numero) return false
        if (nombre != other.nombre) return false

        return true
    }

    override fun hashCode(): Int {
        var result = numero
        result = 31 * result + nombre.hashCode()
        return result
    }
}
fun main() {
    val mapa = mutableMapOf<Empleado, Int>()
    mapa[Empleado(1, "eluno")] = 1000
    mapa[Empleado(2, "eldos")] = 2222

    val sueldoUno=mapa[Empleado(1,"eluno")]
    println(sueldoUno)

    val sueldoDos= mapa[Empleado(2, "eldos")]
    println(sueldoDos)
}