fun secretHandshake(input: Int): List<String> {
    val output = mutableListOf<String>()
    if (input and 0b00001 != 0) output.add("\"wink\"")
    if (input and 0b00010 != 0) output.add("\"double blink\"")
    if (input and 0b00100 != 0) output.add("\"close your eyes\"")
    if (input and 0b01000 != 0) output.add("\"jump\"")
    if (input and 0b10000 != 0) output.reverse()
    return output
}

fun main() {
    print("Enter a decimal number: ")
    val input: Int = readLine()!!.toInt()
    print("> ${secretHandshake(input)}")

//    secretHandshake(3)
//    secretHandshake(19)
}
