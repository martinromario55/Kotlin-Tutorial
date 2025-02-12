fun main() {
    val array = intArrayOf(83,33, 29)
    val max = getMax(1,2,3,5,6,7,9,*array,14,15,19,52,11,22,53,23,12,32)
    println("The maximum is $max")
}

fun getMax(vararg  numbers: Int): Int {
    var max = numbers[0]
    for (number in numbers) {
        if (number > max) {
            max = number
        }
    }
    return max
}