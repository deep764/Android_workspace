fun main()
{

    print("Enter Number:")
    var number:Int = readLine()!!.toInt()

    if (number % 2 == 0)
    {
        println("Number Is Even")
    }
    else
    {
        println("Number Is Odd")
    }
}