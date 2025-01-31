fun main() {
//    Lambdas are functions without names
//    add(5,10)

//    val myLambda = {a: Int, b: Int -> println("a + b = ${a+b}") }
    val sumLambda = {a: Int -> println(a) }

//    myLambda(7, 4)
//    add(5, 10, sumLambda)
//    add(5, 10, {a: Int -> println(a) })
//}
//
//fun add(a: Int, b: Int, action: (Int) -> Unit) {
////    println("a + b = ${a + b}")
//    action(a + b)

    val loginButton = Button("Login", 323342) {

    }

    val signUpButton = Button("Sign up", 67654) {

    }

//    upperCase("hello", {s: String, -> s.uppercase()})
//    upperCase("hello") {it.uppercase()} // Short format


//    val user = User()

//    user.firstName = "Martin"
//    user.lastName = "Romario"
//    user.age = 30
//
//    Simplified format
//    with (user) {
//        this.firstName = "Martin"
//        this.lastName = "Romario"
//        this.age = 30
//    }

//    Short format
//    with (user) {
//        firstName = "Martin"
//        lastName = "Romario"
//        age = 30
//    }

//    Scope Function
//    val user2 = User().apply {
//        firstName = "Martin"
//        lastName = "Romario"
//        age = 30
//    }
//
//    with(user2) {
//        println(firstName)
//        println(lastName)
//        println(age)
//    }

//    All Scope Function
//    val user = User("Martin", "Romario", 30)
//    println(user)

//    Concise format
    User("Martin", "Romario", 30).also { println(it) }

//    Let Scope Function
    var text: String? = null
    text = "Moon"
    text?.let {
        println(it)
    }

//    Run Scope Function
    val user: User? = null
    user?.run {
        println(firstName)
        println(lastName)
        println(age)
    }
}

//class Button(val text: String, val id: Int, val onClickListener: OnClickListener)
//
//interface OnClickListener {
//    fun onClick()
//}

//  Using Lambda
class Button(val text: String, val id: Int, val onClickListener: () -> Unit)

fun upperCase(str: String, myFunction: (String) -> String) {
    val uppercaseWord = myFunction(str)

    println(uppercaseWord)
}

//class User() {
//    var firstName = ""
//    var lastName = ""
//    var age = -1
//}

data class User(val firstName: String, val lastName: String, val age: Int)