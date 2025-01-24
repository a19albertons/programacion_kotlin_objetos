class MyScanner(var datos:String){
    var pos:Int=0

    fun hasNextLine(): Boolean{
        return pos<datos.length
    }
    fun hasNext(): Boolean {
        var devolver = false
        if (datos.length == 0) {
            return false
        }
        if (pos >= datos.length-1){
            return false
        }
//        val division_oficial=datos.toList().dropLast(1).drop(0)
//        if (pos > division_oficial.lastIndex){
//            return false
//        }
        var i = pos
        while (i in pos..datos.length-1) {
            var temporal=datos[i]
            if (!(datos[i] == '\n' || datos[i] == '\t' || datos[i] == ' ')) {
                devolver = true

            }


            if (devolver == true) {
//                pos=i
                break
            }
            i++
        }

        return devolver
    }
    fun nextLine(): String {
        var devolver = StringBuilder()
        if (datos.length==0){
            return ""
        }
        var salir=false
        for (i in pos..datos.length-1){
//            print(datos[i])
//            print(i)
            if ((datos[i] == '\n')){
                salir=true
            }
            else {
                devolver.append(datos[i])
            }
            if (salir==true){
                pos=i+1
                break
            }
            if (datos.length-1==i){
                pos=i+1
                break
            }

        }
        return devolver.toString()
    }
    fun next(): String {
        var devolver = StringBuilder()
        if (datos.length==0){
            return ""
        }
        var i:Int=pos
        var regulador=false
        while (i in pos..datos.length-1) {
            var temporal=datos[i]
            if (!(datos[i] == '\n' || datos[i] == '\t' || datos[i] == ' ')) {
                regulador = true

            }


            if (regulador == true) {
//                pos=i
                break
            }
            i++
        }


        var control=false
        while (i in pos..datos.length-1){
            if ((datos[i] == '\n' || datos[i] == '\t'|| datos[i]==' ')){
                control =true

            }

            if (control==true){
                pos=i
                break
            }
            devolver.append(datos[i])
            i++
        }
        return devolver.toString()
    }
    fun nextInt(): Int{
        var devolver = ""
        var temporal=datos.split("")
        if (datos.length==0){
            return 0
        }
        if (pos >= datos.length-1){
            return 0
        }
        var i:Int=pos
        var regulador=false
        while (i in pos..datos.length-1) {
            var temporal=datos[i]
            if (!(datos[i] == '\n' || datos[i] == '\t' || datos[i] == ' ')) {
                regulador = true

            }


            if (regulador == true) {
                pos=i
                break
            }
            i++
        }
        var control=false
        while (i in pos..datos.length-1){
            var temporal=datos[i]
            if ((datos[i] == '\n' || datos[i] == '\t' || datos[i]==' ')){
//                i++
                control =true

            }

            if (control==true){
                pos=i
                break
            }
            devolver=devolver+(datos[i])
//            pos=i
            i++
        }
        if (devolver==""){
            return 0
        }
        else{
            return devolver.toInt()
        }
    }
}
fun main(){
    var ms=MyScanner("hola a todas")
    println(ms.pos)
    println(ms.datos)
    println(ms.hasNextLine())
    ms= MyScanner("")
    println(ms.pos)
    println(ms.hasNextLine())

    println()

    ms= MyScanner("hola a todos\ny adios")
    println(ms.hasNextLine())
    ms.nextLine()
    println(ms.pos)
    println(ms.datos)
    ms= MyScanner("hola a todas\n y hola a todos")
    println(ms.hasNextLine())
    println(ms.nextLine())
    println(ms.hasNextLine())
    println(ms.nextLine())
    println(ms.hasNextLine())
    println(ms.pos)
    ms= MyScanner("hola a todas\n y hola a todos\n")
    println(ms.nextLine())
    println(ms.nextLine())
    println(ms.pos)
    println(ms.hasNextLine())

    println()

    ms= MyScanner("hola a todos")
    while(ms.hasNextLine()){
        println(ms.nextLine())
    }
    ms= MyScanner("hola a todas \ny también hola a todos")
    while(ms.hasNextLine()){
        println(ms.nextLine())
    }
    ms=  MyScanner("hola a todas \ny también hola a todos\n")
    while(ms.hasNextLine()){
        println(ms.nextLine())
    }
    ms= MyScanner("hola a todas \n\ny también hola a todos\n");
    while(ms.hasNextLine()){
        println(ms.nextLine());
    }

    println()

    ms= MyScanner("hola a todos")
    println(ms.pos)
    println(ms.next())
    println(ms.next())
    println(ms.pos)

    println()

    ms= MyScanner("2 3 4")
    var suma=0
    while(ms.hasNext()) suma+=ms.nextInt()
    println(suma)
    ms= MyScanner("2 \t3 \n4\n")
    suma=0
    while(ms.hasNext()) suma+=ms.nextInt()
    println(suma)
    ms=  MyScanner("2 3 4\n\t")
    suma=0
    while(ms.hasNext()) suma+=ms.nextInt()
    println(suma)
    ms= MyScanner("2 \nmi mama me mima")
    println(ms.nextInt())
    ms.nextLine()//limpiar enter
    println(ms.nextLine())
}