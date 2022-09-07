fun main()
{
    var x : String
    x = readLine()!!
    var len = x.length
    for(i in 1..len)
    {
        for(j in 1..len)
    {
        if(i==j)
            print(i)
        else if((i+j) == (len+1))
            print(i)
        else
            print(" ")
    }
    println(" ")
    }
}
