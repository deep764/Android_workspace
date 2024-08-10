package Task

fun main()
{
    while (true)
    {
        println("----- Menu -----")
        println("1. Addition")
        println("2. Subtraction")
        println("3. Multiplication")
        println("4. Division")
        println("5. Exit")
        print("Choose an option (1-5): ")

        when (readLine()?.toIntOrNull())
        {
            1 -> {
                val (num1, num2) = getNumbers()
                println("Result: $num1 + $num2 = ${num1 + num2}")
            }
            2 -> {
                val (num1, num2) = getNumbers()
                println("Result: $num1 - $num2 = ${num1 - num2}")
            }
            3 -> {
                val (num1, num2) = getNumbers()
                println("Result: $num1 * $num2 = ${num1 * num2}")
            }
            4 -> {
                val (num1, num) = getNumbers()
                if (num!=0)
                {
                    println("Result: $num1 / $num = ${num1 / num}")
                } else
                {
                    println("Error: Division by zero is not allowed.")
                }
            }
            5 ->
            {
                println("Exiting the program. Goodbye!")
                break
            }
            else -> println("Invalid option. Please try again.")
        }
        println()
    }
}
fun getNumbers(): Pair<Double, Double>
{
    print("Enter the first number: ")
    val num1 = readLine()?.toDoubleOrNull() ?: 0.0

    print("Enter the second number: ")
    val num2 = readLine()?.toDoubleOrNull() ?: 0.0

    return Pair(num1, num2)
}