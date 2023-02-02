package lesson2

private val name = "james"

fun main() {
    val kia = Bike("Suzuki")

    println(kia.color)
    println(kia.brand)

}

open class Vehicle(val brand: String = "volvo", val color : String = "green") {
    var year:Int = 0
    var mileage: Double = 0.0

    constructor(brand: String,year: Int) : this(brand, "") {
        this.year = year
    }

    constructor(brand: String,year: Int, mileage: Double) : this(brand, "") {
        this.year = year
        this.mileage = mileage
    }

    open fun move() {
        println("Driving")
    }
}

class Bike(name: String) : Vehicle(name, ) {
    override fun move() {
        super.move()
        println("Riding")
    }

}
