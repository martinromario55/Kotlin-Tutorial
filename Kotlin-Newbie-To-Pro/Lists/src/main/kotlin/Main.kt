fun main() {
//    List are like arrays but their values cannot change once created
//    To change the values of a list, we have to use mutableList
//    The difference between a mutableList and an array is that you
//    can add more values to a mutable list

    val list = mutableListOf(1,2,3)
    list.add(4)
//    list.remove(2) // removes the value 2
//    list.removeAt(2) // removes the value at index 2

//    println(list)
//    val userList = mutableListOf<Int>()
//    for (i in 1..10) {
//        val x = readLine()?.toInt()
//        if (x != null) {
//            userList.add(x)
//        }
//    }
//
//    println(userList)

//    Exercise
//    Reverse the values that the user provides in the list
//    val userList = mutableListOf<Int>()
//    println("Please enter 5 numbers:")
//    for (i in 1..5) {
//        var x = readLine()?.toInt()
//        if (x != null) {
//            userList.add(x)
//        }
//    }
//    val newList = mutableListOf<Int>()
//
//    for (i in userList) {
//        newList.add(userList[userList.size - i])
//    }
//    println("The 5 numbers in reverse are:")
//    for (i in newList) {
//        println(i)
//    }

//    Exercise 2
//    User should enter a number greater than 1 (n > 1)
//    Calculate the first (n) fibonacci numbers and print them in a list

    println("Enter a number n > 1:")
    val userInput = readLine()?.toInt()
    var num = 0
    var num2 = 0
    var num3 = 0
    val fibonacciList = mutableListOf(0,1)

    while (userInput != null && fibonacciList.size < userInput) {
        num = fibonacciList[fibonacciList.size - 1]
        num2 = fibonacciList[fibonacciList.size - 2]

        num3 = num + num2

        fibonacciList.add(num3)
    }

    println(fibonacciList)
}

