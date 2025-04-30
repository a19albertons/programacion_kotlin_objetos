//interface Pila {
//    fun push(dato: Int) // inserta un elemento en la cabeza de la pila
//    fun pop(): Int      // saca un elemento de la cabeza de la pila
//    fun peek(): Int     // examina cabeza de la pila
//    fun esVacia(): Boolean // true si la pila no tiene elementos
//}
//
//class Nodo(var dato: Int, var sig: Nodo?) {
//    override fun toString() = if (sig == null) "$dato" else "$dato -> "
//}
//
//fun main() {
//    val mipila: Pila = MiPila().apply {
//        push(1)
//        push(2)
//        push(3)
//        push(4)
//    }
//
//    println(mipila.esVacia())
//    println(mipila)
//    println(mipila.peek())
//    while (!mipila.esVacia()) {
//        print("${mipila.pop()} ")
//    }
//}
//
//
//class MiPila : Pila {
//    private var cabeza: Nodo?= null
//    override fun push(dato: Int) {
//        val nuevoNodo= Nodo(dato, cabeza)
//        cabeza=nuevoNodo
//    }
//
//    override fun pop(): Int {
//        val dato=cabeza?.dato
//        cabeza=cabeza?.sig
//        return dato!!
//    }
//
//    override fun peek(): Int = cabeza?.dato!!
//
//    override fun esVacia(): Boolean = cabeza == null
//
//    override fun toString(): String {
//        val cosa=StringBuilder()
////        cosa.append("[")
//        var actual=cabeza
//        while (actual!=null){
//            cosa.append(actual.dato)
//            if (actual.sig != null) cosa.append(" -> ")
//            actual = actual.sig
//        }
////        cosa.append("]")
//        return cosa.toString()
//    }
//}