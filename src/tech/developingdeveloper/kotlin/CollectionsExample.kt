package tech.developingdeveloper.kotlin


/**
 * Created by Abhishek Saxena on 29-06-2020.
 */

fun main(){

    val testList = listOf(11, 12, 14, 15, 16, 17, 18, 19, 20)

    println(testList.reverseList())
    println(testList.reverseListAgain())
    println(testList.reversed())

    val symptoms = mutableListOf("white spots", "red spots", "not eating", "bloated", "belly up")

    symptoms.add("white fungus")
    symptoms.remove("white fungus")

    symptoms.contains("red") //false
    symptoms.contains("red spots") //true

    println(symptoms.subList(4, symptoms.size)) //belly up

    listOf(1, 5, 3).sum() //9

    listOf("a", "b", "cc").sumBy { it.length } //4

    val cures = mapOf("white spots" to "Ich", "red sores" to "hole disease")

    println(cures["white spots"]) // Or cures.get("white spots")
    println(cures.getOrDefault("bloating", "sorry I don't know"))

    cures.getOrElse("bloating") { "No cure for this" }

    val inventory = mutableMapOf("fish net" to 1)
    inventory["tank scrubber"] = 3 // Or inventory.put("tank scrubber", 3)
    inventory.remove("fish net")
}

fun <T> List<T>.reverseList(): List<T>{
    val list = this
    val result = mutableListOf<T>()
    for (i in list.indices) {
        result.add(list[list.size-i-1])
    }
    return result
}

fun <T> List<T>.reverseListAgain(): List<T>{
    val list = this
    val result = mutableListOf<T>()
    for(i in list.size-1 downTo 0){
        result.add(list[i])
    }
    return result
}