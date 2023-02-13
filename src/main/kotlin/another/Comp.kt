package another

import lesson5.reversed as customReversed

fun main() {
    val result = Calculator.add(2, 4)

    println(result)

    val name = "james"
    println(name.reversed())

    val result2 = Calculator.subtract(2, 4)

    println(result2)

    val calc = Calculator()
    println(calc.name())

}

class Calculator {
    companion object {
        fun add(a: Int, b: Int): Int {
            return a + b
        }
    }

    fun name(): String {
        return "Calculator"
    }
}

fun Calculator.Companion.subtract(a: Int, b: Int) : Int {
    return b - a;
}

