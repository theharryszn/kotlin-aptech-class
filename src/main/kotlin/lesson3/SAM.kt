package lesson3

fun interface Format {
    fun format(str: String): String
}

fun main() {
    val formatter = object : Format {
        override fun format(str: String): String {
            TODO("Not yet implemented")
        }

    }

    println(formatter.format("Name"))
}