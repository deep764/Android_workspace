fun main()
{
    var max = 0
    println("Enter Any Number")
    var num = readLine()!!.toInt()
    while(num>0)
    {
        var rem = num%10
        if(rem>max)
        {
            max = rem
        }
        num/=10
    }
    println("max digit is $max")

}