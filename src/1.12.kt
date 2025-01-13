//class Persona(var nombre:String, var edad: Int){
//
//
//}
//data class User(var nombre:String, var edad: Int){
//    fun copy(): User{
//        return this
//    }
//
//}
//
//fun main() {
//    val p1= Persona("Yo", 25)
//    val p2= Persona("Yo", 25)
//    println(p1==p2)
//    val user1 = User("A", 25)
//    val user2 = User("B", 30)
//    val user3 = User("A", 25)
//
//
//    println(user1 == user2)
//    println(user1 == user3)
//
//    val user4 = user1.copy()
//    println(user4)
//
//    val user5 = user1.copy(edad = 35)
//    println(user5)
//}