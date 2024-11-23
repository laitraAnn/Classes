import kotlin.math.pow
import kotlin.math.sqrt

class Triangle(val A: Dott, val B: Dott, val C: Dott) {
    private fun side(dot1: Dott, dot2: Dott): Double {
        return sqrt((dot2.x - dot1.x).pow(2) + (dot2.y - dot1.y).pow(2))
    }
    val a = side(A, B)
    val b = side(B, C)
    val c = side(C, A)
    private fun area(): Double {

        val p = (a + b + c) / 2
        return sqrt(p * (p - a) * (p - b) * (p - c))
    }

    fun Center(): Dott {
        val a = side(B, C)
        val b = side(A, C)
        val c = side(A, B)
        val p = a + b + c

        val I_x = (a * A.x + b * B.x + c * C.x) / p
        val I_y = (a * A.y + b * B.y + c * C.y) / p

        return Dott(I_x, I_y)
    }

    fun Radius(): Double {
        val S = area()
        val p = (a + b + c) / 2

        return S / p
    }
}
