package lesson1

fun main() {
//    val names = arrayOf("James", "Harry", "Kelly")
//
//    for((i, name) in names.withIndex()) {
//        println("$i - $name")
//    }

//    var i = 0;

//    while (i < 4){
//        if(i == 2) {
//            break;
//        }
//        println(i);
//        i++;
//    }

//    var i = 0

//    outer@ while(i < 10) {
//        var j = 0;
//        inner@ while(j < 10) {
//            println("$i - $j");
//            if(i == 5 && j == 5) {
//                break@inner;
//            }
//            j++;
//        }
//        i++;
//    }

    println(getANumber(45))

}

fun getANumber(num: Int): Boolean {
    val scores = arrayOf(20, 40, 34, 50)

    val numFound = scores.find {
        if(it > 30) {
            return true
        }
        return@find it == num
    }

    return numFound != null
}

//class Person(val name: String?)