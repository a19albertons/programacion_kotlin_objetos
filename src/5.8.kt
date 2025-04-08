
fun main() {
    MiClase.saludar()
    MiClase.saludar()
    MiClase.saludar()
}

object MiClase {
    var probar=0
    init {
        println("Se ha creado una instancia de MiClase")
    }
    fun saludar() {
        println("Hola, soy un objeto de mi clase!")
        probar++
    }
}
