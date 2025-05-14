//class Nodo(var dato: Int, var sig: Nodo? = null) {
//    override fun toString() = if (sig == null) "$dato" else "$dato -> "
//}
//
//interface Cola {
//    fun encolar(dato: Int) // Inserta un elemento al final de la cola
//    fun desencolar(): Int // Saca el primer elemento de la cola
//    fun esVacia(): Boolean // Indica si la cola está vacía
//}
//
//class MiCola : Cola {
//    private var frente: Nodo? = null
//    private var ultimo: Nodo? = null
//
//    override fun esVacia() = frente == null
//
//    override fun encolar(dato: Int) {
//        val nuevoNodo = Nodo(dato)
//        if (esVacia()) {
//            frente = nuevoNodo
//            ultimo = nuevoNodo
//        } else {
//            ultimo?.sig = nuevoNodo
//            ultimo = nuevoNodo
//        }
//    }
//
//    override fun desencolar(): Int {
//        val dato = frente?.dato ?: throw NoSuchElementException("Cola vacía")
//        frente = frente?.sig
//        if (frente == null) {
//            ultimo = null
//        }
//        return dato
//    }
//
//    override fun toString(): String {
//        var s = ""
//        var aux = frente
//        while (aux != null) {
//            s += aux
//            aux = aux.sig
//        }
//        return s
//    }
//    fun length(): Int {
//        var contador = 0
//        var actual = frente
//        while (actual != null) {
//            contador++
//            actual = actual.sig
//        }
//        return contador
//    }
//}
//
//fun main(){
//    var entrada= readln()
//    while (entrada != "0 0"){
//        val lista=entrada.split(" ").map { it.toInt() }
//        val balones = lista[0]
//        val tiros= lista[1]
//        val cola:MiCola=MiCola()
//        for (i in 1..balones) {
//            cola.encolar(i)
//        }
//
//        while (cola.length()!=1) {
//            for (i in 1..tiros){
//                if (i!=tiros){
//                    val balon = cola.desencolar()
//                    cola.encolar(balon)
//                } else {
//                    cola.desencolar()
//                }
//            }
//        }
//        println(cola)
//        entrada= readln()
//    }
//}
