fun main() {
    val x = 7
    val y = 7
    val z = if(x + y == 14) 3 else 4

    if (x < y) {
        println("X is less than y")
    } else if (x > y) {
        println("X is greater than y")
    } else {
        println("X is equal to y")
    }
    println("This will always be executed.")
}