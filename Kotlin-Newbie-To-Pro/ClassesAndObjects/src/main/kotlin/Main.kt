fun main() {
//    println("Hello World!")
    var mark: Person = Person("Mark", "Twain")
    var john = Person()

    var user1 = User(1, "Luke")

//    Using a deconstruct
    val (id, name) = user1

    var myCar = Car("A3", "Audi", 200.0)
    var myECar = ElectricCar("S-Model", "Tesla", 85.0, 200.0)

    myCar.drive(200.0)
    myECar.drive(200.0)
}

class Person (firstName: String = "John", lastName: String = "Doe") {
    init {
        println("Person Created")
    }
}

data class User (val id: Long, val name: String) // Must have at least one parameter

// Super Class, Parent Class, Base Class
//open class Vehicle {
//    // Properties
//    // Methods
//}

// Sub Class, Child Class, or Derived class of Vehicle
// Super Class, Parent Class, Base Class of Electric Car
open class Car(val name: String, val brand: String, override val maxSpeed: Double): Drivable {
    open var range: Double = 0.0

    fun extendedRange(amount: Double) {
        if (amount > 0)
            range += amount
    }

    open fun drive(distance: Double) {
        println("Drove for $distance KM.")
    }

    override fun drive(): String {
        return "Driving the interface drive"
    }
}

// Sub Class, Child Class, or Derived class of Car
class ElectricCar(name: String, brand: String, batteryLife: Double, maxSpeed: Double) : Car(name, brand, maxSpeed) {
    override var range = batteryLife * 6

    override fun drive(distance: Double) {
        println("Drove for $distance KM on Electricity")
    }

    override fun drive(): String {
        return "Drove for $range KM on electricity."
    }
}
