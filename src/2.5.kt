class MiniSB{
    var buffer: CharArray
    var contentSize:Int
    constructor(){
        this.buffer= CharArray(10)
        this.contentSize=0
    }
    constructor(entrada: String){
        this.buffer= CharArray(entrada.length *2)
        entrada.toCharArray().copyInto(buffer,0)
        this.contentSize=entrada.length
    }
    fun append(entrada: String) {
        if (entrada.length+contentSize>bufferLength()){
            var temp=buffer
            this.buffer=CharArray((entrada.length+contentSize)*2)
            if (contentSize!=0) {
                contentSize=0
                for (i in temp) {
                    this.buffer[contentSize] = i
                    contentSize++
                }
                contentSize--
            }
            for (i in entrada){
                this.buffer[contentSize]=i
                contentSize++
            }
        }
        else{
            for (i in entrada){
                this.buffer[contentSize]=i
                contentSize++
            }
        }
    }
    fun bufferLength():Int{
        return buffer.size
    }
    fun deleteFromIndex(numero: Int){

        var temp=buffer
        this.buffer=CharArray(bufferLength())
        for (i in 0..numero-1){
                this.buffer[i]=temp[i]
        }
        contentSize=numero
    }
    fun reverse(){
        var temp=buffer
        this.buffer= CharArray(bufferLength())
        var contador=0
        for (i in contentSize-1 downTo 0){
            buffer[contador] = temp[i]
            contador++
        }
    }
    fun insert(posicion:Int, texto:String){
//        Copia bufer original
        var temp = this.buffer
        var temp_contentsize=contentSize
        if (contentSize+texto.length>bufferLength()){
//            Control tamaño
            this.buffer= CharArray((contentSize+texto.length)*2)

//            Procesado
            contentSize=0
            for (i in 0..posicion-1){
                this.buffer[i]=temp[i]
                contentSize++
            }
            for (i in 0..texto.length-1){
                this.buffer[contentSize] = texto[i]
                contentSize++
            }
            for (i in posicion..temp_contentsize-1){
                this.buffer[contentSize] = temp[i]
                contentSize++
            }



        }
        else {
//            Control tamaño
            this.buffer=CharArray(bufferLength())

//            Procesado
            contentSize=0
            for (i in 0..posicion-1){
                this.buffer[i]=temp[i]
                contentSize++
            }
            for (i in 0..texto.length-1){
                this.buffer[contentSize] = texto[i]
                contentSize++
            }
            for (i in posicion..temp_contentsize-1){
                this.buffer[contentSize] = temp[i]
                contentSize++
            }
        }
    }
    fun contentSize():Int{
        return contentSize
    }

    override fun toString(): String {
        var devolver=StringBuilder()
        for (i in 0..contentSize-1) {
            devolver.append(buffer[i])
        }
        return devolver.toString()
    }
}


fun main(){
    var miniSB = MiniSB()//incializa a ""
//    println(""+miniSB.bufferLength() + ", "+ miniSB.contentSize())
//    miniSB.append("Eran dos tipos requete finos, ")
//    println(""+miniSB.bufferLength() + ", "+ miniSB.contentSize())
//    miniSB.append("eran dos tipos medio chiflaos")
//    println(""+miniSB.bufferLength() + ", "+ miniSB.contentSize())
//    miniSB.append("!.")
//    println(""+miniSB.bufferLength() + ", "+ miniSB.contentSize())
//    println(miniSB)
//
//    println()
//
//    miniSB = MiniSB("Eran dos tipos requete finos")
//    println(""+miniSB.bufferLength() + ", " + miniSB.contentSize())
//    miniSB.deleteFromIndex(4)
//    println(""+miniSB.bufferLength() + ", " + miniSB.contentSize())
//    println(miniSB)
//    miniSB.reverse()
//    println(miniSB)
//
//    println()
//
//    miniSB = MiniSB("Eran dos tipos requete finos")
//    println(""+miniSB.bufferLength() + ", " + miniSB.contentSize())
//    miniSB.deleteFromIndex(4)
//    println(""+miniSB.bufferLength() + ", " + miniSB.contentSize())
//    println(miniSB)
//    miniSB.reverse()
//    println(miniSB)
//
//    println()

    miniSB = MiniSB("Eran dos tipos requete finos")
    println(""+miniSB.bufferLength() + ", " + miniSB.contentSize())
    miniSB.insert(14, ", don Pepito y don José,")
    println(miniSB)
    println(""+miniSB.bufferLength() + ", " + miniSB.contentSize())
    miniSB.insert(46, " extra")
    println(miniSB)
    println(""+miniSB.bufferLength() + ", " + miniSB.contentSize())
}