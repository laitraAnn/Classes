import kotlin.math.pow
import kotlin.math.sqrt

class Dott(x1: Double, x2: Double, x3: Double, y1: Double, y2: Double, y3: Double, st1: Double, st2: Double, st3: Double, per: Double, pl: Double): Triangle(x1, x2, x3, y1, y2, y3){
    private val rad = pl/per
    fun znachRad() = "радиус " + "$rad"
}