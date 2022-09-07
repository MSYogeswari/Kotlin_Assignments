fun main() {
    var c : Char
    println("Enter a character")
    c = readLine()!!.single()
    c = c.uppercaseChar()
    while( c.code <= 90)
    {
        print(c++)
    }
}
