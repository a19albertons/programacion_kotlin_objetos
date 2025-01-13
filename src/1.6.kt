class Coordenadas(var x:Int, var y:Int){
    init {
        if (this.x<0){
            this.x=0
        }
        if (this.y<0){
            this.y=0
        }
    }
    fun actualizar(x:Int, y:Int):Coordenadas{
        if (x<0){
            this.x=0
        }
        else {
            this.x = x
        }
        if (y<0) {
            this.y=0
        }
        else {
            this.y = y
        }
        return this
    }
    fun mover(x:Int, y: Int):Coordenadas{
        this.x=this.x+x
        this.y=this.y+y
        return this
    }
}
fun main(){
    var c1 = Coordenadas(5, 5)
    c1.actualizar(10, 20).mover(3, -5)
    println("x: ${c1.x}, y: ${c1.y}")

    val c2 = Coordenadas(0, 0)
    c2.mover(10, 10).actualizar(5, 5)
    println("x: ${c2.x}, y: ${c2.y}")

    c1 = Coordenadas(5, 5)
    c1.mover(3, -5).mover(1,1).mover(1,1)
    println("x: ${c1.x}, y: ${c1.y}")
}