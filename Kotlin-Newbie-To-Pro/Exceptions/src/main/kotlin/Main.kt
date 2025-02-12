fun main() {
//    println(dividee(5.0, 0.0))

    println("Please enter a number:")
    val input = try {
        readLine()?.toInt()
    } catch (e: NumberFormatException) {
        0
    } finally {
        println("This is from the finally block")
    }

    println("You entered: $input")
}

class DivisionByZeroException: Exception("You cannot divide by zero. Please choose a different number")

fun dividee(a: Double, b: Double): Double {
    if (b == 0.0) {
        throw DivisionByZeroException()
    }
    return a / b
}