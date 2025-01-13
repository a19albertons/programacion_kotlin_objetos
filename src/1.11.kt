class Baraja {
    enum class Palo {
        Bastos, Copas, Espadas, Oros
    }

    data class Carta(val palo: Palo, val numero: Int){
        override fun toString(): String {
            return ("("+palo.toString().uppercase()+", "+numero+")")
        }
    }

    val cartas: MutableList<Carta> = mutableListOf()
    val numeros = listOf(1, 2, 3, 4, 5, 6, 7, 10, 11, 12)

    init {
        for (palo in Palo.values()) {
            for (numero in numeros) {
                cartas.add(Carta(palo, numero))
            }
        }
    }

}

fun main() {
    val baraja = Baraja()
    println(baraja.cartas) // Usa el toString de la lista
    val c = baraja.cartas[0]
    println(c.palo.ordinal)
}
