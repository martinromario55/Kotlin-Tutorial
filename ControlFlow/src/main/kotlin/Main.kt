fun main() {
    val alarm = 8

//    when (alarm) {
//        12, 13, 14 -> println("The time is ${alarm}")
//        in 1 .. 10 -> println("The number is in the range 1..10")
//        !in 1 .. 10 -> println("The time is not in the range of 1..10")
//        else -> println("The time is ${alarm}")
//    }

    val text = when (alarm) {
        12, 13, 14 -> {
            "The time is $alarm"
        }
        in 1 .. 10 -> {
            println("The number is in the range 1..10")
        }

        else -> {
            "The time is $alarm"
        }
    }
}