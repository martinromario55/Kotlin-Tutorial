fun main() {
//    Exceptions are errors that happen while executing your code.
    val a = 5
    val b = 0
    val numbers = arrayOf(2)

//    println(a / b) // Arithmetic Exception
//    println(numbers[1]) // Array Index Out of Bounds Exception

//    Avoiding Exceptions
    try {
        println(a / b)
    } catch (e: ArithmeticException) {
        println("You can't divide by zero: ${e.message}")
    } finally {
        println("... Finish up ...")
    }

}