fun main() {
//    For Loop
//    for (i in 1..10) {
//        println("i = $i")
//    }
//    for (i in 1 until 10){
//        println(i)
//    }

//    for (i in 10 downTo 1) {
//        println(i) // Counts backwards
//    }

//    for (i in 1 until 10 step 2) {
//        println(i) // Skips at every second iteration
//    }

//    WHILE LOOP

//    var number = 0
//
//    while (number < 10) {
//        println(number)
//        number++
//    }

//    DO WHILE

//    var number = 10
//
//    do {
//        println(number)
//    } while (number < 10)

//    CONTINUE

//    var number = 0
//    while (number < 10) {
//        number++
//
//        if (number == 7) {
//            continue
//        }
//
//        println(number)
//    }

//    BREAK
//    for (i in 0..10) {
//        if (i == 7) {
//            break
//        }
//        println(i)
//    }

//    EXERCISE
    /*
    Find and print the even numbers in a range of numbers
    * */
    for (i in 1..10) {
        if (i%2 == 0) {
            println(i)
        }
    }
}