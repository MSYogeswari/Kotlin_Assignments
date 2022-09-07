fun main() {
    var x: Int
    println("Enter any number!")
    x = Integer.valueOf(readLine())
    for(i in 1..10)
    {
    println("$x * $i =  ${i*x}")
}
}
