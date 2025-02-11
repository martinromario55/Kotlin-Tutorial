fun main() {
    val x = 4
    val y = 5
    println("x is equal to y: ${x == y}")
    println("x is less than y: ${x < y}")
    println("x is less than or equal to y: ${x <= y}")
    println("x is greater than y: ${x > y}")
    println("x is greater than or equal to y: ${x >= y}")
    println("x is not equal to y: ${x != y}")

    val a = 10
    val b = 10

    println(x == y && a == b) // AND OPERATOR
    println(x == y || a == b) // OR OPERATOR
    println(!(x == y)) // NOT OPERATOR
}