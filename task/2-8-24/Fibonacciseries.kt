fun main()
{
    var a=0
    var b=1

    println("Enter Your number:")
    var n:Int = readLine()!!.toInt()
    println("Fibonacci series:$a $b")
    for(i in 3..n)
    {
        var c=a+b
        println("$c")
        a=b
        b=c
    }
}