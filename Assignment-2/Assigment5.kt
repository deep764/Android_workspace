fun main()
{

    print("Enter Dividend:")
    var dividend:Int = readLine()!!.toInt()

    print("Enter Divisor:")
    var divisor:Int = readLine()!!.toInt()

    var quotient = dividend / divisor
    var reminder = dividend % divisor


    println("Quotient is $quotient")
    println("Reminder is $reminder")


}