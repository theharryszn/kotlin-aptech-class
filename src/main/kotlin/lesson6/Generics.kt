//package lesson6
//
//import java.util.Objects
//
//fun main() {
//    val container = Container("Hello")
//    println(container.getContent())
//
//    val intContainer = Container(2);
//
//
//    val names= arrayListOf("james")
//
//    names.addAll(arrayListOf(""))
//
//
//}
//
//

//
//
//class Container<T>(private val content: T) {
//    fun getContent(): T {
//        return this.content
//    }
//}
//
//class Attribute<K, V>(val key: K,val value: V)
//
//class ErrorDoer<T: List<Object>>(val error: T)
//

class CustomError : Error() {

}

fun main() {
    val container = CustomContainer(CustomError())
    val container2 = CustomContainer<Error>(CustomError())
    val container3 = CustomContainer("Hello")

    container2.setFrom(container)
}
class CustomContainer<E>(var value: E) {
    fun <T: E> setFrom(container: CustomContainer<T>) {
        this.value = container.value
    }
}