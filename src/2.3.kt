class MyLittleDecimal{
    var valor:Int

    constructor(entrada:String){
        this.valor=entrada.replace(",","").toInt()
    }

    private fun getValor2(): Int{
        return valor
    }

    override fun toString(): String {
        var primera_mitad=(valor/100).toString()
        if ("-" in valor.toString() && !primera_mitad.contains("-")){
            primera_mitad="-"+primera_mitad
        }

        var segunda_mitad=(valor%100).toString()
        if (segunda_mitad.contains("-")){
            segunda_mitad=segunda_mitad.replace("-","")
        }
        if (segunda_mitad.length==1){
            segunda_mitad="0"+segunda_mitad
        }

        return "$primera_mitad,$segunda_mitad"
    }
    fun sumar(s:MyLittleDecimal):MyLittleDecimal{
        val devolver =(this.valor+s.valor).toString()
        return MyLittleDecimal(devolver)
    }
    fun restar(r: MyLittleDecimal): MyLittleDecimal{
        val devolver=(this.valor-r.valor).toString()
        return MyLittleDecimal(devolver)
    }
    fun multiplicar(m: MyLittleDecimal):MyLittleDecimal{
        val devolver=(this.valor*m.valor).toString().dropLast(2)
        return MyLittleDecimal(devolver)
    }
    fun dividir(d:MyLittleDecimal):MyLittleDecimal{
        val devolver= (this.valor*100/d.valor).toString()
        return MyLittleDecimal(devolver)
    }


}
fun main(){
    var mld1 = MyLittleDecimal("200,22")
    var mld2 = MyLittleDecimal("10,11")
    var mld3=mld1.sumar(mld2);
    println(""+mld1.valor+" "+mld2.valor+" "+mld3.valor)
    println(mld3)
    mld1 = MyLittleDecimal("5000,05")
    mld2 = MyLittleDecimal("2,00")
    mld3=mld1.multiplicar(mld2)
    println(mld3)
    mld1 = MyLittleDecimal("100,00")
    mld2 = MyLittleDecimal("300,00")
    mld3=mld1.dividir(mld2)
    println(mld3)

    mld1 = MyLittleDecimal("-200,22")
    mld2 = MyLittleDecimal("10,11")
    mld3=mld1.sumar(mld2)
    println(""+mld1.valor+" "+mld2.valor+" "+mld3.valor)
    println(mld3)
    mld1 = MyLittleDecimal("-200,22")
    mld2 = MyLittleDecimal("10,11")
    mld3=mld1.restar(mld2)
    println(mld3)
    mld1 = MyLittleDecimal("-1,00")
    mld2 = MyLittleDecimal("3,00")
    mld3=mld1.multiplicar(mld2)
    println(mld3)
    mld1 = MyLittleDecimal("-1,00")
    mld2 = MyLittleDecimal("-3,00")
    mld3=mld1.multiplicar(mld2)
    println(mld3)



    mld1 = MyLittleDecimal("0,50")
    mld2 = MyLittleDecimal("1,25")
    mld3=mld1.sumar(mld2)
    println(mld3)
    mld1 = MyLittleDecimal("1,00")
    mld2 = MyLittleDecimal("1,00")
    mld3=mld1.restar(mld2)
    println(mld3)
    mld1 = MyLittleDecimal("0,50")
    mld2 = MyLittleDecimal("0,45")
    mld3=mld1.restar(mld2)
    println(mld3)

    var mld = MyLittleDecimal("-0,02")
    println(mld)
    mld = MyLittleDecimal("-10,11")
    println(mld)
    println(mld.valor)
}