import kotlin.math.*

fun main() {
    val A = Dott(1.0, 0.0)
    val B = Dott(5.0, 3.0)
    val C = Dott(5.0, 0.0)

    val triangle = Triangle(A, B, C)

    val center = triangle.Center()
    val radius = triangle.Radius()

    println("Координаты центра вписанной окружности: (${center.x}, ${center.y})")
    println("Радиус вписанной окружности: $radius")
}
