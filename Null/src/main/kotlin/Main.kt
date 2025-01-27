fun main() {
    var text: String? = null

    println(text?.length)
//    println(text!!.length)

    val text2: String = text ?: "The variable is null"

    println(text2)
}