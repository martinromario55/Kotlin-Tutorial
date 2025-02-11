import java.lang.Math.pow
import kotlin.math.PI

fun main() {
    var x: Float = 20F
    var y = 8F

    var z: Double = 20.6876866876876
    var p = 2.22222222

    println("The result of x / y is: ${x / y}")
    println("The result of z / p is: ${z / p}")

    var radiusNum = 5.5
    var pi = PI

    println("The volume of the sphere with the radius $radiusNum is ${0.75 * pi * pow(radiusNum, 3.0)}")
}