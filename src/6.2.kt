//class Nodo(var dato: Int, var sig: Nodo?) {
//    override fun toString() = if (sig == null) "$dato" else "$dato -> "
//}
//
//fun main() {
//    val miLista = MiListaEnlazada()
//    miLista.insertar(1)
//    miLista.insertar(2)
//    miLista.insertar(3)
//    miLista.insertar(4)
//    miLista.insertar(5)
//
//    println(miLista)  // [5 -> 4 -> 3 -> 2 -> 1]
//
//    // Eliminamos el índice 0
//    miLista.eliminar(0)
//    println(miLista)  // [4 -> 3 -> 2 -> 1]
//
//    // Eliminamos el índice 2
//    miLista.eliminar(2)
//    println(miLista)  // [4 -> 3 -> 1]
//
//}
//class MiListaEnlazada {
//    var primero: Nodo? = null
//    fun insertar(i: Int) {
//        primero=(Nodo(i,primero))
//    }
//
//    fun eliminar(indice: Int) {
//        if (indice == 0) {
//            primero = primero?.sig
//            return
//        }
//        var actual = primero
//        var posicion = 0
//        while (actual != null && posicion < indice - 1) {
//            actual = actual.sig
//            posicion++
//        }
//        if (actual != null && actual.sig != null) {
//            actual.sig = actual.sig?.sig
//        }
//    }
//
//    override fun toString(): String {
//        val cosa=StringBuilder()
//        cosa.append("[")
//        var actual=primero
//        while (actual!=null){
//            cosa.append(actual.dato)
//            if (actual.sig != null) cosa.append(" -> ")
//            actual = actual.sig
//        }
//        cosa.append("]")
//        return cosa.toString()
//    }
//}