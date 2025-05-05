//fun main(){
//    val entrada= readln()
////    val entrada= "3 2 1 -1 -1 -1 -1"
//    val cosa=Arbol(entrada)
////    println("recorrido preorden con TABS")
////    cosa.preorden()
//    val root = cosa.raiz ?: error("empty")
//    if (cosa.maxAB(root.nodoIzq) < root.dato &&
//        cosa.minAB(root.nodoDer) > root.dato) {
//        println("SI")
//    }
//    else {
//        println("NO")
//    }
////    println("Máximo: ${cosa.maxAB(cosa.raiz)}")
//}
//class NodoArbol(var dato: Int) {
//    var nodoIzq: NodoArbol? = null
//    var nodoDer: NodoArbol? = null
//}
//
//class Arbol(lineaText: String) {
//    var raiz: NodoArbol? = null
//
//    init {
//        val numeros = lineaText.split(" ").map { it.toInt() }.toMutableList()
//        val dato = numeros.removeFirst()
//        if (dato == -1) {
//            raiz = null
//        } else {
//            raiz = NodoArbol(dato)
//            crearSub(raiz!!, numeros)
//        }
//    }
//
//    private fun crearSub(padre: NodoArbol, numeros: MutableList<Int>) {
//        val datoIzq = numeros.removeFirst()
//        if (datoIzq != -1) {
//            padre.nodoIzq = NodoArbol(datoIzq)
//            crearSub(padre.nodoIzq!!, numeros)
//        }
//
//        val datoDer = numeros.removeFirst()
//        if (datoDer != -1) {
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
//    fun maxAB(n:NodoArbol?):Int{
//        if (n==null) return Int.MIN_VALUE
//        val actual = n.dato
//        val maxizq = maxAB(n.nodoIzq)
//        val maxder= maxAB(n.nodoDer)
//        return maxOf(actual, maxizq, maxder)
//    }
//    fun minAB(n:NodoArbol?):Int{
//        if (n==null) return Int.MAX_VALUE
//        val actual = n.dato
//        val maxizq = minAB(n.nodoIzq)
//        val maxder= minAB(n.nodoDer)
//        return minOf(actual, maxizq, maxder)
//    }
//}