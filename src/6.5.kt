//class Persona(val nombre: String, val telefono: String) {
//    override fun toString() = "($nombre, $telefono)"
//}
//class NodoArbol(val datos: Persona, var nodoIzq: NodoArbol? = null, var nodoDer: NodoArbol? = null)
//fun main() {
//    val agenda = Agenda().apply {
//        insertar(Persona("Román", "333333333"))
//        insertar(Persona("Ana", "123456789"))
//        insertar(Persona("Elías", "987654321"))
//        insertar(Persona("Juan", "555555555"))
//        insertar(Persona("María", "666666666"))
//    }
//
//    agenda.getTelefono("Juan")
//    agenda.getTelefono("Telma")
//
//    agenda.imprimirEnOrden()
//}
//class Agenda {
//    private var raiz: NodoArbol? = null
//    fun getTelefono(nombre: String, nodo:NodoArbol?=raiz) {
//        when {
//            nodo==null -> println("No se encontró en la agenda el nombre: $nombre")
//            nombre==nodo.datos.nombre -> println("El teléfono de $nombre es: ${nodo.datos.telefono}")
//            nombre<nodo.datos.nombre -> getTelefono(nombre, nodo.nodoIzq)
//            else -> getTelefono(nombre, nodo.nodoDer)
//        }
//
//    }
//
//    fun imprimirEnOrden(n: NodoArbol?=raiz) {
//        if (n != null){
//            imprimirEnOrden(n.nodoIzq)
//            println(n.datos)
//            imprimirEnOrden(n.nodoDer)
//        }
//    }
//
//    fun insertar(persona: Persona) {
//        //para insertar el primer nodo partimos de arbol vacío
//        if (raiz == null) {
//            raiz = NodoArbol(persona)
//        } else {
//            insertarRec(raiz!!, persona)
//        }
//    }
//    private fun insertarRec(n: NodoArbol, p: Persona) {
//        if (p.nombre < n.datos.nombre) { // inserta en el subárbol izquierdo
//            if (n.nodoIzq == null) {
//                n.nodoIzq = NodoArbol(p)
//            } else {
//                insertarRec(n.nodoIzq!!, p)
//            }
//        } else if (p.nombre > n.datos.nombre) { // inserta en el subárbol derecho
//            if (n.nodoDer == null) {
//                n.nodoDer = NodoArbol(p)
//            } else {
//                insertarRec(n.nodoDer!!, p)
//            }
//        }
//    }
//    fun preorden(nodo: NodoArbol? = raiz, tab: String = "") {
//        val newTab = tab + "   "
//        if (nodo != null) {
//            println("$newTab${nodo.datos}")
//            preorden(nodo.nodoIzq, newTab)
//            preorden(nodo.nodoDer, newTab)
//        } else {
//            println(newTab+"null")
//        }
//    }
//
//}
