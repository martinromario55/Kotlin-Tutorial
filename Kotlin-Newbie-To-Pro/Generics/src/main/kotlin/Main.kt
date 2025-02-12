fun main() {
    var integers = (1..10).toList().customFilter { it > 5 }
    var triple = Triple(3, "hello", true)
    var customTriples = CustomTripple<Int, String, Boolean>(3, "world", false)
    customTriples.printTypes()

    println(integers)
}

fun <T> List<T>.customFilter(filterFunction: (T) -> (Boolean)): List<T> {
    val resultList = mutableListOf<T>()
    for (item in this) {
        if (filterFunction(item)) {
            resultList.add(item)
        }
    }
    return resultList
}