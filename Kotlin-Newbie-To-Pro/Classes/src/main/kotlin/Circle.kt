import kotlin.math.PI

class Circle (val radius: Double) {
    val pi = PI
    init {
        println("Circle created with radius = $radius")
        println("Circle area is = ${area()}")
        println("Circle perimeter is = ${peremeter()}")
    }

    fun area() = radius * radius * pi

    fun peremeter() = 2 * radius * pi
}