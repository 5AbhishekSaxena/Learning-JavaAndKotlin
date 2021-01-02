package tech.developingdeveloper.kotlin

import java.util.*


/**
 * Created by Abhishek Saxena on 28-06-2020.
 */

fun main() {
    //println(dayOfWeek())

    feedTheFish()

    dirtyProcessor()

    //playing with some lambda functions
    /*println(gamePlay(6){
      ("No Custom function, sides: $it")
    })

    println(gamePlay(6, rollDice))
    println(gamePlay(6, rollDice0))
    println(gamePlay(6, rollDice1))
    println(gamePlay(6, rollDice2))
    println(gamePlay(6, rollDice2))*/

    //println("\nYour fortune is: ${getFortuneCookie()}")
    /*var fortune: String
    for (i in 1..10) {
        fortune = getFortuneCookie()
        println("\nYour fortune is: $fortune")
        if (fortune.contains("Take it easy")) break
    }

    //using repeat
    repeat (10) {
       fortune = getFortune(getBirthday())
      println("\nYour fortune is: $fortune")
      if (fortune.contains("Take it easy")) break;
   }

   //using while
    while (!fortune.contains("Take it easy")) {
       fortune = getFortune(getBirthday())
      println("\nYour fortune is: $fortune")
   }

    eagerExample()
    filterSpices()

    // random1 has a value assigned at compile time, and the value never changes when the variable is accessed.
    //
    // random2 has a lambda assigned at compile time,
    // and the lambda is executed every time the variable is referenced, returning a different value.

    val random1 = random()
    val random2 = {random()}

    */

    println(funWithFish())
}

fun dayOfWeek(): String {
    println("What day is it today?")
    return when (Calendar.getInstance().get(Calendar.DAY_OF_WEEK)) {
        1 -> "Sunday"
        2 -> "Monday"
        3 -> "Tuesday"
        4 -> "Wednesday"
        5 -> "Thursday"
        6 -> "Friday"
        7 -> "Saturday"
        else -> "Time has stopped"
    }
}

fun feedTheFish() {
    val day = randomWeekDay()
    val food = fishFood(day)
    println("Today is $day and the fish eat $food")

    if (shouldChangeWater(day)) {
        println("Change the water today")
    }
}

fun fishFood(day: String): String {
    return when (day) {
        "Monday" -> "flakes"
        "Tuesday" -> "pellets"
        "Wednesday" -> "redworms"
        "Thursday" -> "granules"
        "Friday" -> "mosquitoes"
        "Saturday" -> "lettuce"
        "Sunday" -> "plankton"
        else -> "fasting"
    }
}

fun randomWeekDay(): String {
    val daysOfWeek = listOf("Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday")
    return daysOfWeek[Random().nextInt(daysOfWeek.size)]
}

fun shouldChangeWater(
        day: String,
        temperature: Int = 22,
        dirty: Int = getDirtySensorReading()): Boolean {

    /*
    val isTooHot = temperature > 30
    val isDirty = dirty > 30
    val isSunday = day == "Sunday"
    */

    return when {
        isTooHot(temperature) -> true
        isDirty(dirty) -> true
        isSunday(day) -> true
        else -> false
    }
}

//another way
fun isTooHot(temperature: Int) = temperature > 30
fun isDirty(dirty: Int) = dirty > 30
fun isSunday(day: String) = day == "Sunday"

fun getDirtySensorReading() = 20

var dirty = 20

// anonymous function or lambda function
val waterFilter: (Int) -> Int = { dirty -> dirty / 2 } // or { it / 2 }

val sandFilter: (Int) -> Int = { it / 10 }

// simple function
fun feedFish(dirty: Int) = dirty + 10


//Higher order function is a function that takes the function as an argument
fun updateDirty(dirty: Int, operation: (Int) -> Int): Int {
    return operation(dirty)
}

fun dirtyProcessor() {
    println("Dirty Processor start, dirty: $dirty")
    if (dirty == 20)
        dirty = updateDirty(dirty, waterFilter)

    println("Dirty Processor after waterFilter, dirty: $dirty")
    // to pass a simple function instead of a lambda function
    dirty = updateDirty(dirty, ::feedFish)
    println("Dirty Processor after feedFish, dirty: $dirty")

    dirty = updateDirty(dirty, sandFilter)
    println("Dirty Processor after sandFilter, dirty: $dirty")

    // combination of higher order function with lambda without any predefined lambda function
    // returns the last line
    dirty = updateDirty(dirty) { dirty ->
        //println("Hello")  - no error
        dirty + 50
        //"hello" - error as it will return String and dirty is of type Int
    }
    println("Dirty Processor after combination of higher order function with lambda, dirty: $dirty")

}


/**----EXTRA CODE FOR REFERENCE -- */
fun getFortuneCookie(): String {
    val fortunes = listOf("You will have a great day!",
            "Things will go well for you today.",
            "Enjoy a wonderful day of success.",
            "Be humble and all will turn out well.",
            "Today is a good day for exercising restraint.",
            "Take it easy and enjoy life!",
            "Treasure your friends, because they are your greatest fortune.")
    //print("\nEnter your birthday: ")
    val birthday = 31 //readLine()?.toIntOrNull() ?: 1
    return fortunes.shuffled()[birthday.rem(fortunes.size)]
}

fun getBirthday(): Int {
    print("\nEnter your birthday: ")
    return readLine()?.toIntOrNull() ?: 1
}

fun getFortune(birthday: Int): String {
    val fortunes = listOf("You will have a great day!",
            "Things will go well for you today.",
            "Enjoy a wonderful day of success.",
            "Be humble and all will turn out well.",
            "Today is a good day for exercising restraint.",
            "Take it easy and enjoy life!",
            "Treasure your friends, because they are your greatest fortune.")
    val index = when (birthday) {
        in 1..7 -> 4
        28, 31 -> 2
        else -> birthday.rem(fortunes.size)
    }
    return fortunes[index]
}

fun isVeryHot(temperature: Int) = temperature > 35
fun isSadRainyCold(mood: String, weather: String, temperature: Int) =
        mood == "sad" && weather == "rainy" && temperature == 0

fun isHappySunny(mood: String, weather: String) = mood == "happy" && weather == "sunny"
fun whatShouldIDoToday(mood: String, weather: String = "sunny", temperature: Int = 24): String {
    return when {
        isVeryHot(temperature) -> "go swimming"
        isSadRainyCold(mood, weather, temperature) -> "stay in bed"
        isHappySunny(mood, weather) -> "go for a walk"
        else -> "Stay home and read."
    }
}

/**
 *
 * List Filtering
 *
 */
fun eagerExample() {
    val decorations = listOf("rock", "pagoda", "plastic plant", "alligator", "flowerpot")
    val eager = decorations.filter { it.startsWith("p") }
    println("eagerlist: $eager")

    val filtered = decorations.asSequence().filter { it.startsWith("p") }
    println("filteredlist: ${filtered.toList()}")

    val lazyMap = decorations.asSequence().map {
        println("map: $it")
        it
    }

    println("lazyMap: $lazyMap") // prints nothing
    println("lazyMap first: ${lazyMap.first()}")
    println("lazyMap full list: ${lazyMap.toList()}")

}

fun filterSpices() {
    val spices = listOf("curry", "pepper", "cayenne", "ginger", "red curry", "green curry", "red pepper")

    //sort by length
    println(spices.filter { it.contains("curry") }.sortedBy { it.length })

    //startsWith 'c' and endsWith 'e'
    println(spices.filter { it.startsWith('c') }.filter { it.endsWith('e') })

    //another way
    println(spices.filter { it.startsWith('c') && it.endsWith('e') })

    //take first 3 items by 'c'
    println(spices.take(3).filter { it.startsWith('c') })

}

val rollDice = { _: Int -> Random().nextInt(12) + 1 }

//or
val rollDice0 = { sides: Int ->
    Random().nextInt(sides) + 1
}

val rollDice1 = { sides: Int ->
    if (sides == 0) 0
    else Random().nextInt(sides) + 1
}

val rollDice2: (Int) -> Int = { sides ->
    if (sides == 0) 0
    else Random().nextInt(sides) + 1
}

fun <T> gamePlay(diceRoll: Int, generateNumber: (Int) -> T): T {
    return generateNumber(diceRoll)
    //println("diceRoll: $diceRoll")
}

data class Fish(val name: String)

val fishes = listOf(Fish("Flipper"), Fish("Moby Dick"), Fish("Dory)"))

fun funWithFish(): String {
    val filteredListOfFishes = fishes.filter { it.name.contains("i") }
    val nameOfFishes = filteredListOfFishes.joinToString(" ") { it.name }
    return nameOfFishes
}