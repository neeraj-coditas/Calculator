package SelfAssignment
import java.util.*

class Calculator {
    fun add(a:Int,b:Int){
        println(a+b)
    }

}

fun main()
{
    var sc = Scanner(System.`in`)
    var n1 = sc.nextInt()
    var n2 = sc.nextInt()

    var op = sc.next()

    var ob1 = Calculator()
    ob1.add(n1,n2)
}