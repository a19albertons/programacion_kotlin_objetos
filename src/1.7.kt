class Empleado(var nombre:String, var salario:Double){
    var salarioAnual=salario*12
    override fun toString(): String {
        return "Empleado(nombre='"+nombre+"', salarioAnual="+salarioAnual+")"
    }
}
class Ciudad(var ciudad:String, var pais:String){
    override fun toString(): String {
        return "Ciudad(nombre='"+ciudad.uppercase()+"', pais='"+pais+"')"
    }
}
fun main(){
    val empleado = Empleado("Juan", 2000.0)
    val ciudad = Ciudad("Madrid", "España")
    println(empleado)
    println(ciudad)
}