fun main(){
    var entrada= readlnOrNull()
    while (entrada!= null) {
        val arbol = Arbol(entrada)
        arbol.preordenIt()
        println()
        entrada = readlnOrNull()
    }

}
class NodoArbol(var dato: Int) {
    var nodoIzq: NodoArbol? = null
    var nodoDer: NodoArbol? = null
}

class Arbol(lineaText: String) {
    var raiz: NodoArbol? = null

    init {
        val numeros = lineaText.split(" ").map { it.toInt() }.toMutableList()
        val dato = numeros.removeFirst()
        if (dato == -1) {
            raiz = null
        } else {
            raiz = NodoArbol(dato)
            crearSub(raiz!!, numeros)
        }
    }

    private fun crearSub(padre: NodoArbol, numeros: MutableList<Int>) {
        val datoIzq = numeros.removeFirst()
        if (datoIzq != -1) {
            padre.nodoIzq = NodoArbol(datoIzq)
            crearSub(padre.nodoIzq!!, numeros)
        }

        val datoDer = numeros.removeFirst()
        if (datoDer != -1) {
            padre.nodoDer = NodoArbol(datoDer!!)
            crearSub(padre.nodoDer!!, numeros)
        }
    }

    fun preordenRec(tab: String = "", nodo: NodoArbol? = raiz) {
        val newTab = tab + "   "
        if (nodo != null) {
            println("$newTab${nodo.dato}")
            preordenRec(newTab, nodo.nodoIzq)
            preordenRec(newTab, nodo.nodoDer)
        } else {
            println(newTab + "null")
        }
    }
    fun preordenIt(){
        if (raiz==null) return

        val stack = ArrayDeque<NodoArbol>()
        stack.addFirst(raiz!!)

        while (stack.isNotEmpty()){
            val actual=stack.removeFirst()
            print(actual.dato)

            if(actual.nodoDer != null) stack.addFirst(actual.nodoDer!!)
            if(actual.nodoIzq != null) stack.addFirst(actual.nodoIzq!!)

        }

    }
}