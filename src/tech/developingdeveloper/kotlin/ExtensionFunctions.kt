package tech.developingdeveloper.kotlin


/**
 * Created by Abhishek Saxena on 29-06-2020.
 */

fun main() {

    extensionsExample()

    val greenPlant = GreenLeafyPlant(10)
    println("isGreen: ${greenPlant.isGreen()}")
    println("isGreenAsRegularProperty: ${greenPlant.isGreenAsRegularProperty}")
    println("isGreenCaseSensitive: ${greenPlant.isGreenCaseSensitive()}")
    println("isRed: ${greenPlant.isRed()}")

    staticExample()
}

fun String.hasSpace(): Boolean{
    val found = find{ it == ' '}
    return found != null
}

fun String.hasSpacesBetter() = find{ it == ' ' } != null

fun extensionsExample(){
    println("Does it have spaces?".hasSpace()) //true
    println("Does it have spaces?".hasSpacesBetter()) //true
}

open class AquariumPlant(val color: String, private val size: Int)
class GreenLeafyPlant(size: Int): AquariumPlant("Green", size)

fun AquariumPlant.isRed() = color.equals("red", ignoreCase = true)
fun AquariumPlant.isGreen() = color.equals("green", ignoreCase = true)
fun AquariumPlant.isGreenCaseSensitive() = color == "green"

fun AquariumPlant.println() = println("AquariumPlant")
fun GreenLeafyPlant.println() = println("GreenLeafyPlant")

val AquariumPlant.isGreenAsRegularProperty: Boolean
    get() = color.equals("green", ignoreCase = true)

fun AquariumPlant?.pull(){
    this?.apply {
        println("removing $this")
    }
}

fun nullableExample(){
    val plant: AquariumPlant? = null
    plant.pull() //ok
}

fun staticExample(){
    val plant = GreenLeafyPlant(size = 50)
    plant.println() // GreenLeafyPlant

    val aquariumPlant: AquariumPlant = plant
    aquariumPlant.println() //AquariumPlant
}