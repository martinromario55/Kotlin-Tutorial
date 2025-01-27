fun main() {
//    sayHello("Martin", 30)

//    val hasInternetConnection = false
//    if (hasInternetConnection) {
//        getData("1,2,3,4,5,6,7,8,9")
//    } else {
//        showMessage()
//    }

//    val max = getMax(5, 9)
//
//    println(max)

//    sendMessage("Martin", "Hello World!")
//    sendMessage("Roma")
//    sendMessage()
//    sendMessage(message = "Hello message only")

    println(sum(5,6,7,8))
}

//fun sayHello(name: String, age: Int) {
//    println("Hello $name! Your age is $age")
//}
//
//fun getData(data: String) {
//    println("Your data is: $data")
//}
//
//fun showMessage() {
//    println("There is no internet connection")
//}

//fun getMax(a: Int, b: Int): Int {
//    val max = if (a > b) a else b
//    return  max
//}

//fun sendMessage(name: String = "User", message: String = "Hello") {
//    println("Name = $name and message = $message")
//}

// VarArgs

//fun sum(a: Int, b: Int, c: Int, d: Int): Int {
//    return a + b + c + d
//}

fun sum(vararg numbers: Int): Int {
    var result = 0
    for (number in numbers) {
        result += number
    }

    return result
}