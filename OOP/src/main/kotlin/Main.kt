fun main() {
//    val car1 = Car()

//    car1.name = "Tesla"
//    car1.model = "S Plaid"
//    car1.color = "Red"
//    car1.doors = 4

//    println("Name = ${car1.name}")
//    println("Model = ${car1.model}")
//    println("Color = ${car1.color}")
//    println("Doors = ${car1.doors}")
//
//    car1.move()
//    car1.stop()


//    val car2 = Car()

//    car2.name = "Ford"
//    car2.model = "Mustang"
//    car2.color = "Black"
//    car2.doors = 2

//    println("Name = ${car2.name}")
//    println("Model = ${car2.model}")
//    println("Color = ${car2.color}")
//    println("Doors = ${car2.doors}")

//    Object Constructor

//    val car1 = Car("Tesla", "S Plaid", "Red", 4)
//    val car2 = Car("Ford", "Mustang", "Black", 2)
//
//        println("Name = ${car1.name}")
//    println("Model = ${car1.model}")
//    println("Color = ${car1.color}")
//    println("Doors = ${car1.doors}")
//
//    println("\n")
//        println("Name = ${car2.name}")
//    println("Model = ${car2.model}")
//    println("Color = ${car2.color}")
//    println("Doors = ${car2.doors}")

//    val user = User("Martin", "Romario", 30)
//    val friend = User("James", "Dean", 45)


//    val friend = User("James")

//    val user = User()
//
//    val result = Calculator.sum(5,10)
//
//    println(result)

//    val instance = Database.getInstance()
//
//    println(instance)

//    println(DatabaseTwo)
//    println(DatabaseTwo)

//    println(Direction.WEST)
//    for (direction in Direction.values()) {
//        println(direction)
//    }
//    Direction.WEST.printData()

//    val listView = ListView(arrayOf("Mathew", "Mark", "Luke", "John"))
//    listView.ListViewItems().displayItems(2)

//    val car = Car("BMW", "Red", 1, 4)
//    val plane = Plane("Boeing", "White and Blue", 4,4)
//
//    car.move()
//    car.stop()
//
//    plane.move()
//    plane.stop()

//    val success = Result.Success("Success!")
//    val error = Result.Error("Failed")
//
//    getData(error)

//    val user1 = User("Martin", "Romario", 30)
//    val user2 = User("Martin", "Romario", 30)
//
//    println(user1 == user2)
//
//    println(user1)
//    println(user2)

//    val signInButton = Button("Login", 1234, object: onClickListener{
//        override fun onClick() {
//            TODO("Not yet implemented")
//        }
//    })
//
//    val signUpButton = Button("Sign Up", 4567, object: onClickListener{
//        override fun onClick() {
//            TODO("Not yet implemented")
//        }
//    })

    val user = User()
    with (user) {
        firstName = "Martin"
        lastName = "Romario"
    }
    with(user) {
        println(firstName)
        println(lastName)
    }
}

//class Car {
//    var name = ""
//    var model = ""
//    var color = ""
//    var doors = 0
//
//    fun move() {
//        println("The car $name is moving")
//    }
//
//    fun stop() {
//        println("The car $name has stopped")
//    }
//}

//  Class Constructor

//class Car (var name: String, var model: String, var color: String, var doors: Int) {
//
//    fun move() {
//        println("The car $name is moving")
//    }
//
//    fun stop() {
//        println("The car $name has stopped")
//    }
//}

fun getData(result: Result) {
    when(result) {
        is Result.Error -> result.showMessage()
        is Result.Success -> result.showMessage()
    }
}