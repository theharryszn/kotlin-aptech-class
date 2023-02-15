package lesson6

fun main() {

}

sealed interface Animal {
    val name: String
}

class Dog(override val name: String): Animal {

}


