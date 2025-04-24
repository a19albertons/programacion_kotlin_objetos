//class Nodo(var dato: Int, var sig: Nodo?)
//
//class MiListaEnlazada {
//    var primero: Nodo? = null
//
//    fun insertar(dato: Int) {
//        // insertamos por el principio de la lista
//        primero = Nodo(dato, primero) // el primero pasa a ser el segundo, si primero era null ahora el sgte es null
//    }
//
//    fun size(): Int { // para averiguar el tamaño recorremos la lista y contamos
//        var i = 0
//        var temp = primero
//        while (temp != null) {
//            i++
//            temp = temp.sig
//        }
//        return i
//    }
//
//
//}
//operator fun MiListaEnlazada.get(i: Int): Int {
//    var j= 0
//    while (primero != null){
//        if (j == i) return primero!!.dato
//        j++
//        primero = primero!!.sig
//    }
//    throw IndexOutOfBoundsException("Índice $i fuera de rango")
//}
//
//fun main() {
//    val miLista = MiListaEnlazada()
//    miLista.insertar(5)
//    miLista.insertar(67)
//    println(miLista[0])
//    println(miLista[1])
//
//}