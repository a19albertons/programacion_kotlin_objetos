class MiColaPersonas : ColaPersonas {
    private var head: NodoPersona? = null

    override fun encolar(dato: Persona) {
        // Inserta la nueva persona al inicio de la lista enlazada
        head = NodoPersona(dato, head)
    }

    override fun desencolar(): Persona {
        if (head == null) throw NoSuchElementException("La cola está vacía")
        // Si sólo había un nodo, se extrae y la cola queda vacía
        if (head!!.sig == null) {
            val dato = head!!.dato
            head = null
            return dato
        }
        // Recorrer hasta el penúltimo nodo para eliminar el último (FIFO)
        var current = head!!
        while (current.sig!!.sig != null) {
            current = current.sig!!
        }
        val dato = current.sig!!.dato
        current.sig = null
        return dato
    }

    override fun esVacia(): Boolean = head == null

    override fun toString(): String {
        if (head == null) return ""
        val sb = StringBuilder()
        var current = head
        while (current != null) {
            sb.append(current.toString())
            current = current.sig
        }
        return sb.toString()
    }
}
class Persona(val nombre: String, val edad: Int) {
    override fun toString() = "$nombre($edad)"
}

class NodoPersona(var dato: Persona, var sig: NodoPersona? = null) {
    override fun toString() = if (sig == null) "$dato" else "$dato -> "
}

interface ColaPersonas {
    fun encolar(dato: Persona) // Inserta una persona al final de la cola
    fun desencolar(): Persona // Saca la primera persona de la cola
    fun esVacia(): Boolean // Indica si la cola está vacía
}

fun main() {
    val mc = MiColaPersonas().apply {
        encolar(Persona("Ana", 25))
        encolar(Persona("Juan", 30))
        encolar(Persona("Luis", 22))
        encolar(Persona("Marta", 28))
    }

    println(mc)
    println("${mc.desencolar()} ${mc.desencolar()}")
    println(mc)
}