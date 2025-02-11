fun main() {
    val userInput = readLine()
//    println("You entered ${userInput?.uppercase()}")
//    if (userInput != null) {
//        println(userInput.toInt() - 5)
//    }
    if (userInput != null) {
        if (userInput.toInt() != null) {
            if (userInput.toInt() < 18) {
                println("You're still a child")
            } else if (userInput.toInt() >= 18 && userInput.toInt() < 65) {
                println("You are an adult")
            } else if (userInput.toInt() >= 65) {
                println("You're really old")
            }
        }
    }
}