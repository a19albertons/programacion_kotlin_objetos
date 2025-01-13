data class Persona(var nombre:String, var edad: Int){


}
data class User(var nombre:String, var edad: Int){
    fun copy(): User{
        return this
    }

}

fun main() {
    val (nombreP,edadP)= Persona("Yo", 25)

    val (nombreU,edadU) = User("A", 25)
    println("$nombreP $edadP    $nombreU $edadU")
}