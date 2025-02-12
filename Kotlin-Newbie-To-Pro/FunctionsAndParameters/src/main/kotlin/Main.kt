fun main() {
//    printThreeLines()

//    printPower(3, 3)

//    Exercise
    printSum(100)
}

fun printSum(base: Int) {
    var i = 1
    var result = 0
    while (i <= base) {
        result += i

        i++
    }
    println("The sum of the values 1 to $base is $result")
}

fun printPower(base: Int, exponent: Int) {
    var result = 1
    for (i in 1..exponent) {
        result *= base
    }

    println("$base to the power of $exponent is $result")
}

fun printThreeLines() {
    println("First line")
    println("Second line")
    println("Third line")
}