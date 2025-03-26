//class Gerente(nombre: String, salario: Double, var departamento: String):Empleado(nombre, salario) {
//    override fun mostrarDatos() {
//        super.mostrarDatos()
//        println("Departamento: $departamento")
//    }
//}
//
//
//open class Empleado(var nombre: String, var salario: Double) {
//    open fun mostrarDatos() {
//        println("Nombre: $nombre, Salario: $salario")
//    }
//}
//fun main() {
//    val gerente = Gerente("Carlos", 5000.0, "TI")
//    gerente.mostrarDatos()
//}