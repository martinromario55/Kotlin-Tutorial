fun main() {
//    val names: Array<String> = arrayOf("John", "Stephen", "Megan")
    val names = arrayOf("John", "Stephen", "Megan")
    val diffDataTypes = arrayOf(4,5,6,7,"Peter", "a")
    println(names[0])
    println("The size of the array is: ${names.size}")

//    Loop through the array
//    for (name in names) {
//        println(name)
//    }
//
//    for (i in diffDataTypes) {
//        println(i)
//    }

//    Filter array data
//    for (item in diffDataTypes) {
//        if (item is Int) {
//            println(item) // Returns Integers only
//        }
//    }


    val numArr = arrayOf(1,2,3,4,5,6,7,8,9,10,9,-8,7,6,5,4,3,2,1,20,21,22,23,24,25,11,12,32,13,14,15)
    val maxNum = findMax(numArr)
    val minNum = findMin(numArr)

    println("Max number in Array is: $maxNum")
    println("Min number in Array is: $minNum")
}

//  Return the max number in the array
fun findMax(numbers: Array<Int>): Int {
    var max = numbers[0]

    for (number in numbers) {
        if (number > max) {
            max = number
        }
    }

    return max
}

fun findMin(numbers: Array<Int>): Int {
    var min = numbers[0]
    for (number in numbers) {
        if (number < min) {
            min = number
        }
    }

    return  min
}