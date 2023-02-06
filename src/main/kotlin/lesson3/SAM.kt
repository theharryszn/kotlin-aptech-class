package lesson3

fun interface Format {
    fun format(str: String): String
}

fun main() {
    val formatter = Format { "$it- formatted" }

    println(formatter.format("Name"))
}