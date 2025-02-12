fun main() {

//    for (i in 1..10) {
//        println(i)
//    }

//    for (i in 'a'..'z') {
//        println(i)
//    }

//    val myArray = arrayOf(4,5,6,9,10,3,2,7)
//    var max = myArray[0]
//
//    for (i in myArray) {
//        if (i > max) {
//            max = i
//        }
//    }
//
//    println(max)

//    Exercise 1
//    Calculate the sum of the array
//    val myArray = arrayOf(1,2,3,4,5,6,7,8,9,10)
//    var sum = 0
//
//    for (i in myArray) {
//        sum += i
//    }
//
//    println(sum)

//    Exercise 2
//    Calculate the average of the user's input values
    println("Enter 5 numbers")
    val num1 = readLine()?.toInt()
    val num2 = readLine()?.toInt()
    val num3 = readLine()?.toInt()
    val num4 = readLine()?.toInt()
    val num5 = readLine()?.toInt()
    var totalNum = 0
    var avg = 0.0

    if (num1 != null && num2 != null && num3 != null && num4 != null && num5 != null) {
        totalNum = num1 + num2 + num3 + num4 + num5
        avg += totalNum / 5.0

        println("The average value is ${avg}")
    }


}