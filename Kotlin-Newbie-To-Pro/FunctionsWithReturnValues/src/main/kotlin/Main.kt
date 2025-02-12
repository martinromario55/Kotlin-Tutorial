fun main() {
//    val pow = printPow(3, 5)
//    val list = listOf(1,2,3)
//    println("The to the power of 5 is $pow")
//    println(multiply(2,3))
//    printFirstItem(list)

//    Exercise
    val list = listOf(3,2,5,1,5,6,7)
    println("The list looks like the following: $list")
    println("Search for this number:")
    val x = readLine()?.toInt()

    if (x != null) {
        findIndex(list, x)
    }
}

fun findIndex(list: List<Int>, userInput: Int) {
    var num = 0
    for (i in list) {
        if (i == userInput) {
            return println("The index of $userInput is $num")
        }
        num++
    }
}

fun multiply(a: Int, b: Int) = a * b

fun printPow(base: Int, exponent: Int): Int {
    var result = 1
    for (i in 1..exponent) {
        result *= base
    }
    return result
}

fun printFirstItem(list: List<Int>) = println(list[0])