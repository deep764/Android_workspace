package Task

fun main()
{
    print("Enter a number: ")
    val number = readLine()?.toIntOrNull()

    if (number != null)
    {
        println("Multiplication Table for $number:")
        for (i in 1..10)
        {
            println("$number x $i = ${number * i}")
        }
    } else
    {
        println("Please enter a valid integer.")
    }
}