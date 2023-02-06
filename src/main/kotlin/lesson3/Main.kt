package lesson3

import javax.security.auth.Subject

fun main() {

}

open class Shape {
    open fun draw() {
        println("Drawing a shape")
    }
}

interface Polygon {
    fun draw() {
        println("Drawing a polygon")
    }
}

class Rectangle(val width: Int, val height: Int): Shape(), Polygon {
    lateinit var subject :Subject

    val area: Int
        get() {
            return width * height
        }

    var name = ""
        private set


    override fun draw() {
        if(!::subject.isInitialized) {
            subject = Subject()
        }
        println(area)
        super<Polygon>.draw()
    }
}