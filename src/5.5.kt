interface Volador {
    fun volar()
}

class Pajaro : Volador {
    override fun volar() {
        println("volar como un pájaro")
    }
}

class Avion : Volador {
    override fun volar() {
        println("volar como un avión")
    }
}

fun main() {
    val superman = Superheroe(Avion())


    val arcangel = Superheroe(Pajaro())

    val lista= listOf(Pajaro(),Avion(),superman,arcangel)
    for (elemento in lista){
        elemento.volar()
        if (elemento is Superheroe){
            elemento.salvarElMundo()
        }
    }
}
private fun Any.volar() {
    when (this) {
        is Pajaro -> println("volar como un pájaro")
        is Avion -> println("volar como un avión")
        is Superheroe -> heroe.volar()
        else -> println("indeterminado")
    }
}

class Superheroe(val heroe: Volador) {
    fun salvarElMundo() {
        println("¡El superhéroe está salvando el mundo!!!")
    }

}