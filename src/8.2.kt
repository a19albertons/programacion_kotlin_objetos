data class Persona(val nombre: String, val edad: Int, val peso: Int, val altura:Int) : Comparable<Persona>{
    override fun compareTo(other: Persona): Int {
        return when {
            this.peso > other.peso -> 2
            this.edad == other.edad && this.altura > other.altura -> 1
            this.edad == other.edad && this.altura == other.altura -> 0
            this.edad == other.edad && this.altura < other.altura -> -1
            else -> -2
        }
    }
}
class MiComparador : Comparator<Persona> {
    override fun compare(o1: Persona, o2: Persona): Int {
        val edad = o1.edad.compareTo(o2.edad)
        return if (edad != 0) edad else o1.nombre.compareTo(o2.nombre)
    }
}
fun imprimirPersonas(lista: List<Persona>) {
    for (persona in lista) {
        println(persona)
    }
}

fun main() {
    val personas = listOf(
        Persona("Alicia", 30, 65, 170),
        Persona("Roberto", 25, 75, 180),
        Persona("Carlos", 30, 70, 175),
        Persona("Alicia", 28, 75, 175)
    )

    println("Original, por orden de insercción:")
    imprimirPersonas(personas)

    println("\nOrdenado por peso y luego por altura (Comparable):")
    imprimirPersonas(personas.sorted())

    val ordenadoPorEdadYNombre1 = personas.sortedWith(compareBy({ it.edad }, { it.nombre }))
    println("\nOrdenado por edad y luego por nombre (compareBy):")
    imprimirPersonas(ordenadoPorEdadYNombre1)

    val ordenadoPorEdadYNombre2 = personas.sortedWith(MiComparador())
    println("\nOrdenado por edad y luego por nombre (MiComparador):")
    imprimirPersonas(ordenadoPorEdadYNombre2)
}
