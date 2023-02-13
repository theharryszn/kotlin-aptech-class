package lesson5

fun main() {
    val name = "James"
    println(name.reversed())

    var anim : Animal = Animal()

    anim.eat()

    anim.number + 1
}

fun String.reversed(): String {
    return "reversed"
}

class Animal {
    fun eat() {
        println("Eating")
    }
}

fun Animal?.eat() {
    println("This animal is eating")
}

var Animal.number
    get() = 1
    set(value) { value + 1 }