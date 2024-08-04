fun main()
{
    var reversed = 0
    println("Enter Your num1:")
    var num:Int = readLine()!!.toInt()

    while (num != 0)
    {
        val digit = num % 10
        reversed = reversed * 10 + digit
        num /= 10
    }

    println("Reversed Number: $reversed")

}