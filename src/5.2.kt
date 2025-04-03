fun main() {
    try {
        comprobarZanahoria()
    } catch (e: LamentableSituacion) {
        println("Error: ${e.message}")
    }
}
class LamentableSituacion(val mensaje:String): Exception(mensaje)

fun comprobarZanahoria() {
    throw LamentableSituacion("zanahoria totalmente pocha")
}