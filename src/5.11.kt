fun interface Cuidador<in T> {
    fun alimentar(animal: T)
}
open class Animal(val nombre: String) {
    open fun sonido() = "Sonido genérico"
}

class Perro(nombre: String) : Animal(nombre) {
    override fun sonido() = "Guau guau"
}

class Gato(nombre: String) : Animal(nombre) {
    override fun sonido() = "Miau miau"
}

fun main() {
    // Cuidador general de animales
    val cuidadorGeneral: Cuidador<Animal> = Cuidador { animal ->
        println("Alimentando a ${animal.nombre}, hace sonido: ${animal.sonido()}")
    }

    // Gracias a la contravarianza, un Cuidador<Animal> puede ser usado como Cuidador<Perro> o Cuidador<Gato>
    val cuidadorPerros: Cuidador<Perro> = cuidadorGeneral
    val cuidadorGatos: Cuidador<Gato> = cuidadorGeneral

    // Alimentamos perros y gatos con el cuidador general
    cuidadorPerros.alimentar(Perro("Kan"))  // Alimentando a Rex, hace sonido: Guau guau
    cuidadorGatos.alimentar(Gato("Jato"))  // Alimentando a Misu, hace sonido: Miau miau
}