fun interface Transformador<T>{
    fun transformar(variable:T):T
}
fun main() {
    val t1 = Transformador<Int> { x:Int -> 2 * x }
    println(t1.transformar(5))
    val t2 = Transformador<String> { x:String -> x.uppercase() }
    println(t2.transformar("hola"))
}