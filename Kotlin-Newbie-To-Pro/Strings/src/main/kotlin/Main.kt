import java.util.*

fun main() {
    val string = "this is an example text"
    val myName = "martin"

    println("${string.uppercase(Locale.getDefault())}")
    println(myName.uppercase().reversed())
}