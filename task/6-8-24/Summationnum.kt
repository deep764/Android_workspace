fun main() {

    println("Enter Any Number")
    var num = readLine()!!.toInt()
    var sum = 0

    while (num > 0)
    {

        var rem = num % 10
        sum+=rem
        num = num/10
    }
    print("summation of given num is $sum")

}