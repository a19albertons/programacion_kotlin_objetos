import kotlin.concurrent.thread
fun asinc() {
    thread {
        println("yo soy asinc")
    }
}


fun main(){
    asinc()
    println("yo soy main")
}