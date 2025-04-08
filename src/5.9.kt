//fun main() {
//    val t1 = object : Transformador<Int> {
//        override fun transformar(x: Int): Int {
//            return 2*x
//        }
//    }
//    println(t1.transformar(5))
//    val t2 = object :Transformador<String> {
//        override fun transformar(x: String): String {
//            return x.uppercase()
//        }
//    }
//    println(t2.transformar("hola"))
//}
//
//fun interface Transformador<T> {
//    fun transformar(x:T):T
//}
//
//
//
////fun main() {
////
////    val t1 = TransfInt()
////    println(t1.transformar(5))
////    val t2 = TransfString()
////    println(t2.transformar("hola"))
////}
////fun interface Transformador<T> {
////    fun transformar(x:T):T
////}
////class TransfInt: Transformador<Int>{
////    override fun transformar(x: Int): Int {
////        return 2*x
////    }
////}
////class TransfString: Transformador<String>{
////    override fun transformar(x: String): String {
////        return x.uppercase()
////    }
////}
//
