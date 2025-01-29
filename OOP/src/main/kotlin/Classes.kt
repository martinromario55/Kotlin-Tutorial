import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

//class Car (name: String, var model: String, var color: String, var doors: Int) {
//    var name = name.trim()
//
//    fun move() {
//        println("The car $name is moving")
//    }
//
//    fun stop() {
//        println("The car $name has stopped")
//    }
//}

//class User(name: String, var lastName: String, var age: Int) {
//    var name: String
//
//    init {
//        if (name.lowercase().startsWith("m")) {
//            this.name = name
//        } else {
//            this.name = "User"
//            println("The name doesn't start with the letter 'm' or 'M'.")
//        }
//    }
//}

//  Secondary Constructor

//class User(var name: String, var lastName: String, var age: Int) {
//    constructor(name: String): this(name, "Last Name", 0)
//}

//class User(var firstName: String = "John", var lastName: String = "Doe", var age: Int = 0)

//  Companion Object
class Calculator() {
    companion object {
        fun sum(a: Int, b: Int): Int {
            return a + b
        }
    }
}

//  Singleton
class Database private constructor() {
    companion object {
        private var instance: Database? = null

        fun getInstance(): Database? {
            if (instance == null) {
                instance = Database()
            }

            return instance
        }
    }
}

//  Singleton Shortcode
object DatabaseTwo {
    init {
        println("Database Created")
    }
}

//  ENUM Classes
enum class Direction(var direction: String, var distance: Int) {
    NORTH("north", 10),
    SOUTH("south", 20),
    EAST("east", 15),
    WEST("west", 40);

    fun printData() {
        println("Direction = $direction and Distance = $distance")
    }
}

//  Inner Classes

class ListView(val items: Array<String>) {
    inner class ListViewItems() {
        fun displayItems(position: Int) {
            println(items[position])
        }
    }
}

//  Inheritance
//open class Vehicle(val name: String, val color: String) { // Base Class
//    open fun move() {
//        println("$name is moving")
//    }
//
//    fun stop() {
//        println("$name has stopped")
//    }
//}
//class Car(name: String, color: String, val engines: Int, val doors: Int): Vehicle(name, color) {
//}
//
//class  Plane(name: String, color: String, val engines: Int, val doors: Int): Vehicle(name, color) {
//    override fun move() {
//        flying()
////        super.move()
//    }
//
//    fun flying() {
//        println("The $name plane is flying")
//    }
//}


//  Sealed Classes

sealed class Result(val message: String) {
    fun showMessage() {
        println("Result: $message")
    }
    class Success(message: String): Result(message)
    class Error(message: String): Result(message)
}

//  Abstract Classes
abstract class Vehicle() {
    abstract fun move()

    abstract fun stop()
}

//class Car(var name: String, var color: String, val engines: Int, val doors: Int): Vehicle() {
//    override fun move() {
//        TODO("Not yet implemented")
//    }
//
//    override fun stop() {
//        TODO("Not yet implemented")
//    }
//}

//  Structural Equality
//class User(var firstName: String, var lastName: String, var age: Int) {
//
//    override fun equals(other: Any?): Boolean {
////        return super.equals(other)
//        if (this === other) { // Referential Equality
//            return true
//        }
//
//        if (other is User) {
//            return this.firstName == other.firstName && this.lastName == other.lastName && this.age == other.age
//        }
//
//        return false
//    }
//
//    override fun hashCode(): Int {
////        return super.hashCode()
//        return 0
//    }
//
//    override fun toString(): String {
////        return super.toString()
//        return "User(firstName='$firstName', lastName='$lastName', age=$age)"
//    }
//}

//  Structural Equality short code
//data class User(var firstName: String, var lastName: String, var age: Int)

//  Interface
interface Engine {
    fun startEngine()
}

class Car(var name: String, val color: String): Engine {
    override fun startEngine() {
        println("The car is starting the engine.")
    }

}

class Truck(var name: String, val color: String): Engine {
    override fun startEngine() {
        println("The truck is starting the engine.")
    }

}

class Plane(var name: String, val color: String): Engine {
    override fun startEngine() {
        println("The plane is starting the engine.")
    }

}

//  Object Expression
class Button(val text: String, val id: Int, onClickListener: onClickListener)

class ClickListener(): onClickListener {
    override fun onClick() {
        TODO("Not yet implemented")
    }

}

interface onClickListener {
    fun onClick()
}

//  Delegation
class App: A by FirstDelegate(), B by SecondDelagate() {
    override fun print() {
        TODO("Not yet implemented")
    }

    override fun print2() {
        TODO("Not yet implemented")
    }
}

interface A {
    fun print()
}

interface B {
    fun print2()
}

open class FirstDelegate: A {
    override fun print() {
        TODO("Not yet implemented")
    }

}

open class SecondDelagate: B {
    override fun print2() {
        TODO("Not yet implemented")
    }

}

//  Delegation with Properties
class User {
    var firstName by FormatDelegate()
    var lastName by FormatDelegate()
}

class FormatDelegate: ReadWriteProperty<Any?, String> {
    private var formattedString: String = ""

    override fun getValue(thisRef: Any?, property: KProperty<*>): String {
        return formattedString
    }

    override fun setValue(thisRef: Any?, property: KProperty<*>, value: String) {
        formattedString = value.lowercase()
    }


}