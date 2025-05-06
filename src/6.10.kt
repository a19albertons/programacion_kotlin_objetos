//import kotlin.math.max
//
//fun main(){
//    val num_veces= readln().toInt()
//    for (i in 0 until num_veces){
//        var entrada= readln()
//        val cosa=Arbol(entrada)
//        println(cosa.altura())
//
//    }
//
//
//}
//class NodoArbol(var dato: Char) {
//    var nodoIzq: NodoArbol? = null
//    var nodoDer: NodoArbol? = null
//}
//
//class Arbol(lineaText: String) {
//    var raiz: NodoArbol? = null
//
//    init {
//        val numeros = lineaText.toCharArray().toMutableList()
//        val dato = numeros.removeFirst()
//        if (dato == '.') {
//            raiz = null
//        } else {
//            raiz = NodoArbol(dato)
//            crearSub(raiz!!, numeros)
//        }
//    }
//
//    private fun crearSub(padre: NodoArbol, numeros: MutableList<Char>) {
//        val datoIzq = numeros.removeFirst()
//        if (datoIzq != '.') {
//            padre.nodoIzq = NodoArbol(datoIzq)
//            crearSub(padre.nodoIzq!!, numeros)
//        }
//
//        val datoDer = numeros.removeFirst()
//        if (datoDer != '.') {
//            padre.nodoDer = NodoArbol(datoDer!!)
//            crearSub(padre.nodoDer!!, numeros)
//        }
//    }
//
//    fun preorden(tab: String = "", nodo: NodoArbol? = raiz) {
//        val newTab = tab + "   "
//        if (nodo != null) {
//            println("$newTab${nodo.dato}")
//            preorden(newTab, nodo.nodoIzq)
//            preorden(newTab, nodo.nodoDer)
//        } else {
//            println(newTab + "null")
//        }
//    }
//    fun altura(n: NodoArbol?=raiz): Int{
//        if (n==null){
//            return 0
//        }
//        else {
//            return 1 + max(altura(n.nodoIzq), altura(n.nodoDer))
//        }
//    }
//}