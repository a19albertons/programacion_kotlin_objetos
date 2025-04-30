//fun main() {
//    val arbol = Arbol()
//    val n = NodoArbol("x")
//    arbol.raiz = n
//    val n1 = NodoArbol("-")
//    val n2 = NodoArbol("3")
//    n.nodoIzq = n1
//    n.nodoDer = n2
//    val n11 = NodoArbol("9")
//    val n12 = NodoArbol("+")
//    n1.nodoIzq = n11
//    n1.nodoDer = n12
//    val n121 = NodoArbol("5")
//    val n122 = NodoArbol("2")
//    n12.nodoIzq = n121
//    n12.nodoDer = n122
//
//    println(arbol.getValor())
//    println(arbol.getExpresion())
//}
//class NodoArbol(var datos: String) {
//    var nodoIzq: NodoArbol? = null
//    var nodoDer: NodoArbol? = null
//}
//
//class Arbol {
//
//    var raiz: NodoArbol? = null
//    fun getValor(nodo: NodoArbol?= raiz): Int {
//        if (nodo!!. nodoIzq == null && nodo.nodoDer== null) return nodo.datos.toInt()
//
//        val izq=getValor((nodo.nodoIzq))
//        val der=getValor((nodo.nodoDer))
//        val valor=when(nodo.datos) {
//            "x"-> izq*der
//            "-"-> izq-der
//            "+"-> izq+der
//            else -> izq/der
//        }
//        return valor
//    }
//    fun getExpresion(nodo: NodoArbol?=raiz): String {
//        //no puede llegar aquí nodo null
//        //es hoja
//        if (nodo!!.nodoIzq == null && nodo.nodoDer == null) {
//            return nodo.datos
//        }
//        // Si no es hoja, dato es un operador y tiene dos subárboles
//        return "(${getExpresion(nodo.nodoIzq)}${nodo.datos}${getExpresion(nodo.nodoDer)})"
//    }
//}
