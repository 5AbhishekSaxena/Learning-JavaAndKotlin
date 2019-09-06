package `in`.abhisheksaxena.Kotlin


fun helloMessage(vararg names : String, prefix: String) {
    for (name in names) println("$prefix, $name")
}

fun describeString(maybeString: String?): String {              // 1
  /*  if (maybeString != null && maybeString.isNotEmpty()) {        // 2
        return "$maybeString: String of length ${maybeString.length}"
    } else {
        return "Empty or null string"                           // 3
    }*/
    return if (maybeString != null && maybeString.isNotEmpty()) {        // 2
        "$maybeString: String of length ${maybeString.length}"
    } else {
        "Empty or null string"                           // 3
    }
}

fun main() {

    infix fun Int.times(str: String) = str.repeat(this)        // 1
    println(5 times "Bye ")                                    // 2

    val pair = "Ferrari" to "Katrina"                          // 3
    println(pair)
    println(pair.first)
    println(pair.second)

    infix fun String.onto(other: String) = Pair(this, other)   // 4
    val myPair = "McLaren" onto "Lucas"
    println(myPair)

    val sophia = Person("Sophia")
    val claudia = Person("Claudia")
    sophia likes claudia                                       // 5

    infix fun String.cat(other: String) = "$this $other"
    println("Abhishek" cat "Saxena")

    helloMessage("Abhishek", "Sambit", "Vivek", "Abhinav", prefix = "Greetings")

    println(describeString(null))
    println(describeString(""))
    println(describeString("Hello Abhishek"))

}

class Person(val name: String) {
    private val likedPeople = mutableListOf<Person>()
    infix fun likes(other: Person) { likedPeople.add(other) }  // 6
}