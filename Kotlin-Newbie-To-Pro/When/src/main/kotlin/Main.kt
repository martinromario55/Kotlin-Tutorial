fun main() {
//    The WHEN expression is similar to the SWITCH statement in JavaScript
//    The WHEN expression also depends on one single variable. It cannot be used with multiple variables.
//    val age = readLine()?.toInt()
//
//    when(age) {
//        in 0..12 -> println("You're a young kid")
//        in 13..17 -> println("You're a teenager")
//        18 -> println("Finally, you're 18")
//        19, 20 -> println("You're a young adult")
//        in 21..65 -> println("You're an adult")
//        else -> println("You're really old")
//    }

    val country = readLine()

    when (country) {
        "USA" -> println("Hello!")
        "UK" -> println("Hey mate!")
        "France" -> println("Bonjour!")
        "Kenya" -> println("Jambo!")
        "Uganda" -> println("Oli otya!")
        "Portugal" -> println("Ola!")
        else -> println("I don't know that.")
    }
}