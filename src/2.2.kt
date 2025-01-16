class TimeLapse(var h: Int, var m: Int, var s: Int){
    init {
        if (this.m>59){
            this.m = 59
        }
        else if (this.m<0){
            this.m =0
        }
        if (this.s>59){
            this.s = 59
        }
        else if (this.s<0){
            this.s =0
        }
    }

    constructor():this(0,0,0,) {

    }
    constructor(s:Int): this(){
        var m = s/60
        var s_final=s-m*60
        var h_final = m/60
        var m_final=m-h_final*60

        this.h=h_final
        this.m=m_final
        this.s=s_final
    }
    constructor(t: TimeLapse): this(){

        this.h=t.h
        this.m=t.m
        this.s=t.s
    }
    fun totalSec(): Int{
        return h*60*60+m*60+s
    }
    fun reset(){
        this.h=0
        this.m=0
        this.s=0
    }
    fun addSec(sec: Int){
        var total_sec = this.h*60*60+this.m*60+this.s+sec
        var m = total_sec/60
        var s_final=total_sec-m*60
        var h_final = m/60
        var m_final=m-h_final*60

        this.h=h_final
        this.m=m_final
        this.s=s_final
    }
    fun addTime(t:TimeLapse){
        var h=0
        var m=0
//        segundos
        if (this.s+t.s>=60){
            m=1
            this.s=(this.s+t.s)-60
        }
        if (this.m+t.m>=60){
            h=1
            this.m=(this.m+t.m+m)-60
        }
        this.h=this.h+t.h+h
    }

    override fun toString(): String {
        return "TimeLapse[${this.h}h:${this.m}m:${this.s}s]"
    }
}

fun main(){
    var t1 = TimeLapse()
    println(t1)
    t1 = TimeLapse(3, 25, 42)
    println(t1)
    val t2 = TimeLapse(t1)
    println(t2)
    val t3 = TimeLapse(12930)
    println(t3)

    var t = TimeLapse()
    t.h=5
    t.m=20
    t.s=50
    println(t)
    println(""+t.h + " " + t.m + " " + t.s)

    println()
    t = TimeLapse(5, 20, 50)
    println(t.totalSec())

    t = TimeLapse(5, 20, 50)
    t.reset()
    println(t)

    println()
    t = TimeLapse(5, 50, 50)
    t.addSec(10000)
    println(t)

    println()
    t = TimeLapse(5, 50, 50)
    t.addTime(TimeLapse(2, 46, 40))
    println(t)
}