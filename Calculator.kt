package SelfAssignment
import java.util.*

class Calculator {
    fun add(a:Int,b:Int){
        println(a+b)
    }
// here pritesh will add sub fun
    fun sub(a:Int,b:Int){
        println(a-b)
    }

//third function added by Neeraj
    fun mul(a:Int, b:Int){
        println(a*b)
    }

// fourth fun added by pritesh
    fun div(a:Int, b:Int){
        var f1 = a.toFloat()
        var f2 = b.toFloat()
        println(f1/f2)
    }

}

fun main()
{
    var sc = Scanner(System.`in`)
    var n1 = sc.nextInt()
    var n2 = sc.nextInt()

    var ob1 = Calculator()
    ob1.add(n1,n2)
    ob1.sub(n1,n2)
    ob1.mul(n1,n2)
    ob1.div(n1,n2)
}