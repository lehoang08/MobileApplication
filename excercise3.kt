fun wordCount(phrase: String): Map<String, Int> {
    return phrase
        .lowercase()
        .split("""(\\.)|[^\w']""".toRegex())
        .filter { it.isNotEmpty() }
        .groupBy { it.replace("""(^')|('$)""".toRegex(), "") }
        .mapValues { it.value.size }
}

fun main() {
    print("Enter a phrase: ")
    val phrase: String = readLine()!!
    println("> ${wordCount(phrase)}")

//    val phrase = """"That's the password: 'PASSWORD 123'!", cried the Special Agent.\nSo I fled."""
//    println("> ${wordCount(phrase)}")
}
