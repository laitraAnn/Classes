import java.math.*
import kotlin.math.pow

open class Triangle (x1: Double, x2: Double, x3: Double, y1: Double, y2: Double, y3: Double){
    open val x1 = x1
    open val x2 = x2
    open val x3 = x3
    open val y3 = y3
    open val y2 = y2
    open val y1 = y1
    open fun znach() {
        val st1= ((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1))
        val st2= ((x2-x3)*(x2-x3) + (y2-y3)*(y2-y3))
        val st3= ((x3-x1)*(x3-x1) + (y3-y1)*(y3-y1))
        val per= st1.pow(0.5)+st2.pow(0.5)+st3.pow(0.5)

        val TOCHKA = Dot(1.0,5.0,5.0,0.0, 3.0, 0.0,st1, st2, st3, per)
        "радиус" + println(TOCHKA.znachRad())
    }

}