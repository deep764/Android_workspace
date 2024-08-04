fun main()
{
    var k=1
    println("Enter the factorial number:")
    var num:Int = readLine()!!.toInt()
    for(i in 1..num)
    {
        k=k*i
    }
    println("Factorial $k")
}