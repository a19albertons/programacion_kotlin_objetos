//open class Trabajador(){
//    var dni:String=""
//    var sueldoBase: Int=0
//    var departamento:String=""
//}
//class Investigador(): Trabajador() {
//    var horasExtra:Int=0
//}
//class Ejecutivo(): Trabajador(){
//    var primas: Int=0
//}
//
//fun main() {
//    val ejec1 = Ejecutivo().apply {
//        dni = "33311155x"
//        sueldoBase = 6000
//        departamento = "comercial"
//        primas = 2000
//    }
//
//    val inv1 = Investigador().apply {
//        dni = "11122233g"
//        sueldoBase = 1000
//        departamento = "fabricación"
//        horasExtra = 15
//    }
//
//    val t1 = Trabajador().apply {
//        dni = "44456712f"
//        sueldoBase = 2000
//        departamento = "administración"
//    }
//    println(inv1 is Trabajador)
//    println(ejec1 is Trabajador)
//}