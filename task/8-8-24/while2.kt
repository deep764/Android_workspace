package test

fun main()
{
    var i=0
    while(i<=4)
    {
        i++
        var j=5
            while(j>=1)
            {
                if(j>i)
                {
                    print(" ")
                }
                else
                {
                    print("*")
                }
                j--
            }
        println()
    }
}
