//class Producto{
//
//    var descrip:String = ""
//        get() = field
//        set(value) {
//            field = value
//        }
//    var cantidad:Int=0
//        get() = field
//        set(value) {
//            var devolver:Int
//            if (value>=0){
//                devolver=value
//            }
//            else {
//                devolver=0
//            }
//            field=devolver
//        }
//    constructor(descrip:String, cantidad:Int){
//        this.descrip=descrip
//        this.cantidad=cantidad
//    }
//
//    override fun toString(): String {
//        return descrip+" "+cantidad
//    }
//}
//fun main(){
//    var p=Producto("jamones el chuly",20)
//    println(p.descrip)
//    println(p.cantidad)
//
//    p=Producto("bombones el petardo",15)
//    println(p.descrip)
//    p.cantidad=-12
//    println(p)
//    p.cantidad=-9
//    println(p)
//
//    p=Producto("Calamares PescaNueva",33)
//    println(p.descrip)
//    println(p.cantidad)
//    println(p)
//}