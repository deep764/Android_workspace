fun main()
{
    var deep= 0
    println("Enter Your num1:")
    var num:Int = readLine()!!.toInt()
    for (i in 1..num step 2)
    {

        if (num % i == 0)
        {
            deep++
        }
    }

    if (deep==2)
        println("$num is a prime number.")
    else
        println("$num is not a prime number.")
}