package lesson4

fun main() {
    val name = "james bond"

    println(name.capital(3))

    val two = 2

    println(two.isEven())
}

fun Int.isEven(): Boolean {
    return this % 2 == 0
}

fun Array<Int>.wisdom() {

}

fun String.capital(index: Int): String {
    val arr = this.toCharArray()
    arr[index] = this[index].toUpperCase()

    return  arr.joinToString("")
}
