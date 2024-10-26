import kotlin.math.abs
import kotlin.math.pow
import kotlin.math.sqrt

open class Triangle (x1: Double, x2: Double, x3: Double, y1: Double, y2: Double, y3: Double){
    private val st1= sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1))
    private val st2= sqrt((x2-x3)*(x2-x3) + (y2-y3)*(y2-y3))
    private val st3= sqrt((x3-x1)*(x3-x1) + (y3-y1)*(y3-y1))

    private val per= (st1+st2+st3)/2
    private val pl= abs((x2-x1)*(y3-y1)-(x3-x1)*(y2-y1)) /2
    open fun znach() {
        val tochka = Dott(1.0,5.0,5.0,0.0, 3.0, 0.0,st1, st2, st3, per,pl)
        "радиус " + println(tochka.znachRad())
    }

}