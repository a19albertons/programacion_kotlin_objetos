class MiniSB(entrada: String = "") {
    var buffer: CharArray
        private set
    var contentSize:Int
        private set

    init {
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
        if (numero>=0 && numero<= contentSize){
            contentSize=numero
        }
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
        return String(buffer,0,contentSize)
    }
}
fun main(){
    var miniSB = MiniSB("123")
    println(""+miniSB.buffer.size + ", " + miniSB.contentSize)
    println(miniSB)
    miniSB.append("456")
    println(""+miniSB.buffer.size + ", " + miniSB.contentSize)
    println(miniSB)
    miniSB.append("7")
    println(""+miniSB.buffer.size + ", " + miniSB.contentSize)
    println(miniSB)
    miniSB = MiniSB()
    println(""+miniSB.buffer.size + ", " + miniSB.contentSize)
    println(miniSB)
    miniSB.append("12")
    println(""+miniSB.buffer.size + ", " + miniSB.contentSize)
    println(miniSB)


    miniSB = MiniSB("Eran dos tipos requete finos")
    println(""+miniSB.buffer.size + ", " + miniSB.contentSize)
    miniSB.deleteFromIndex(4)
    println(""+miniSB.buffer.size + ", " + miniSB.contentSize)
    println(miniSB)
    miniSB.reverse()
    println(miniSB)
}