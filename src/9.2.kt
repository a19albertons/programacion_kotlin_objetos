class Nodo(var dato: String, var sig: Nodo? = null) {
    override fun toString() = if (sig == null) "$dato" else "$dato -> "
}

interface Cola {
    fun encolar(dato: String) // Inserta un elemento al final de la cola
    fun desencolar(): String // Saca el primer elemento de la cola
    fun esVacia(): Boolean // Indica si la cola está vacía
}

class MiCola : Cola {
    private var frente: Nodo? = null
    private var ultimo: Nodo? = null

    override fun esVacia() = frente == null

    override fun encolar(dato: String) {
        val nuevoNodo = Nodo(dato)
        if (esVacia()) {
            frente = nuevoNodo
            ultimo = nuevoNodo
        } else {
            ultimo?.sig = nuevoNodo
            ultimo = nuevoNodo
        }
    }

    override fun desencolar(): String {
        val dato = frente?.dato ?: throw NoSuchElementException("Cola vacía")
        frente = frente?.sig
        if (frente == null) {
            ultimo = null
        }
        return dato
    }

    override fun toString(): String {
        var s = ""
        var aux = frente
        while (aux != null) {
            s += aux
            aux = aux.sig
        }
        return s
    }
    fun length(): Int {
        var contador = 0
        var actual = frente
        while (actual != null) {
            contador++
            actual = actual.sig
        }
        return contador
    }
}

fun main(){
    var entrada1= readln().toList()
    var entrada2= readln().split(" ")
    val cola:MiCola=MiCola()
    val respuesta= mutableListOf<String>()
    for (i in entrada2){
        cola.encolar(i)
    }
    for (i in entrada1){
        val tipo = cola.desencolar()
        cola.encolar(tipo)
        if (i == 'c') {
            respuesta.add(tipo)
        }
    }
    println(respuesta.distinct().sorted())
}