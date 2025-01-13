class Producto{

    var not_to_string=true
    var descrip:String = ""
        get() = if (not_to_string) {
            field.uppercase()
        }
        else{
            field
        }
        set(value) {
            field = value
        }
    var cantidad:Int=0
        get() = field
        set(value) {
            var devolver:Int
            if (value>=0){
                devolver=value
            }
            else {
                devolver=0
            }
            field=devolver
        }
    constructor(descrip:String, cantidad:Int){
        this.descrip=descrip
        this.cantidad=cantidad
    }

    override fun toString(): String {
        not_to_string=false
        var devolver= descrip+" "+cantidad
        not_to_string=true
        return devolver
    }
}
fun main(){
    var p=Producto("jamones el chuly",20)
    println(p.descrip)
    println(p.cantidad)

    p=Producto("bombones el petardo",15)
    println(p.descrip)
    p.cantidad=-12
    println(p)
    p.cantidad=-9
    println(p)

    p=Producto("Calamares PescaNueva",33)
    println(p.descrip)
    println(p.cantidad)
    println(p)
}