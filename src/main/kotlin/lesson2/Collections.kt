package lesson2

fun main () {
    val names = arrayOf("James", "John", 30)

    val listOfStudents = arrayListOf<Student>()

    val map = hashMapOf<Int, String>()
    var set = setOf(2, 4, 6, 6)

    map.put(2, "James")
    map.put(4, "Peter")

    set = set.plus(setOf(2,4,6,7,8,9))

    println(set.joinToString("---"))

    println(map)

    println(map.mapValues { it.key * 20 })
    println(set.map {  })

}

class Student(val name: String)