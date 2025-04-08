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
class Superheroe(val heroe: Volador): Volador by heroe{
    fun salvarElMundo() {
        println("¡El superhéroe está salvando el mundo!!!")
    }

}