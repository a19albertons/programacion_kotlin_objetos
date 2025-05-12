fun main() {
    var rango = MiRango(1, 10)
    for (numero in rango) {
        print("$numero ")
    }
    println()
    rango = MiRango(2, 16)
    val miIterador= rango.iterator()
    while (miIterador.hasNext()) {
        print("${miIterador.next()} ")
    }
}
class MiRango(val inicio: Int, val fin: Int) : Iterable<Int> {
    override fun iterator(): Iterator<Int> {
        return MiIterator(this)
    }
}

class MiIterator(var mle: MiRango) : Iterator<Int> {
    var posicion: Int = mle.inicio //posicion actual en el recorrido

    override fun hasNext(): Boolean {
        return posicion <= mle.fin
    }

    override fun next(): Int {
        val valorActual = posicion
        posicion += 2
        return valorActual
    }
}