fun triangle(a: Double, b: Double, c: Double): String {
    val sides = listOf(a, b, c).sorted()
    if (sides[0] > 0 && sides[0] + sides[1] > sides[2]) {
        if (a == b && a == c) {
            return "Equilateral triangle"
        } else if (a == b || a == c) {
            return "Isosceles triangle"
        } else {
            return "Scalene triangle"
        }
    } else if (sides[0] > 0 && sides[0] + sides[1] == sides[2]) {
        return "Degenerate triangle"
    } else {
        return "Not a triangle"
    }
}

fun main() {
    print("Enter the length of side a: ")
    val a: Double = readLine()!!.toDouble()
    print("Enter the length of side b: ")
    val b: Double = readLine()!!.toDouble()
    print("Enter the length of side c: ")
    val c: Double = readLine()!!.toDouble()
    print("> ${triangle(a, b, c)}")

//    triangle(4.0, 4.0, 4.0)
//    triangle(4.0, 4.0, 6.0)
//    triangle(4.0, 5.0, 6.0)
//    triangle(4.0, 5.0, 9.0)
//    triangle(4.0, 5.0, 0.0)
}
