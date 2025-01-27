fun main() {
    val num1 = 5
    val num2 = 3

    val result = num1 + num2

//    println("Result = $result")

    println("num1 + num2 = ${num1 + num2}")
    println("num1 - num2 = ${num1 - num2}")
    println("num1 * num2 = ${num1 * num2}")
    println("num1 / num2 = ${num1 / num2}")
    println("num1 % num2 = ${num1 % num2}")

    var num = 2

    num += 2

    println(num)

//    Increment
    var num3 = 0
    println("num3 = ${num3++}")
    println("num3 = ${++num3}")

//    Decrement
    println("num3 = ${num3--}")
    println("num3 = ${--num3}")

//    If Condition Statement
    val myNum = 100

    if (myNum >= 150) {
        println("Greater than or equal to 150")
    } else if (myNum >= 90) {
        println("Greater than or equal to 90")
    } else {
        println("All conditions failed.")
    }

//    Logical Operator

    val isActive = true

    if (!isActive) {
        println("The user is active")
    } else {
        println("The user is not active")
    }

//    AND Operator
    val isPlaying = true
    val score = 100

    if (isPlaying && score == 100) {
        println("Next level opened")
    } else {
        println("Still at the same level.")
    }

//    OR Operator
    val num5 = 5
    val num6 = 6

    if (num5 > 0 || num6 > 0) {
        println("The condition is true")
    } else {
        println("The condition is false")
    }

//    Expression
    val num7 = 7
    val num8 = 8
    val text = if (num7 > 0 || num8 > 0) "This is text 1" else "This is text 2"

    println("${text}")
}
