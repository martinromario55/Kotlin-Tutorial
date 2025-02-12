import java.lang.Math.pow

fun main() {
//    var x = 3
//    while (x > 0) {
//        println("Hello")
//        x--
//    }
//    println("What's up!")
//    val myArray = arrayOf("Mathew", "Mark", "Luke", "John")
//    val arrLength = myArray.size
//    var i = 0
//
//    while (i < arrLength) {
//        println(myArray[i])
//        i++
//    }

//    var userInput = readLine()?.toInt()
//
//    if (userInput != null) {
//        while (userInput >= 0) {
//            println(userInput)
//            userInput--
//        }
//    }

    val num1 = readLine()?.toInt()
    val num2 = readLine()?.toInt()

    if (num1 != null && num2 !== null) {
        println("$num1 to the power of $num2 is ${pow(num1.toDouble(), num2.toDouble()).toInt()}")
    }
}