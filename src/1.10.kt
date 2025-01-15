class Producto{

    private var _descrip:String
    var descrip:String
        get() = _descrip.uppercase()
        set(value) {
            _descrip = value
        }
    private var _cantidad:Int
    var cantidad:Int
        get() = _cantidad
        set(value) {
            var devolver:Int
            if (value>=0){
                devolver=value
            }
            else {
                devolver=0
            }
            _cantidad=devolver
        }
    constructor(descrip:String, cantidad:Int){
        this._descrip=descrip
        this._cantidad=cantidad
    }

    override fun toString(): String {
        return _descrip+" "+_cantidad
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