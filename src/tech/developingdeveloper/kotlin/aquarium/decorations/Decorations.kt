package tech.developingdeveloper.kotlin.aquarium.decorations


/**
 * Created by Abhishek Saxena on 28-06-2020.
 */

fun main() {
    makeDecorations()
}

fun makeDecorations() {
    val d1 = Decorations("granite")
    println(d1)

    val d2 = Decorations("slate")
    println(d1)

    val d3 = Decorations("slate")
    println(d1)

    println(d1 == d2)
    println(d3 == d2)

    val d4 = d3.copy()
    println(d3)
    println(d4)
    val d5 = d4.copy(rocks = "granite")
    println(d5 == d1)
    println("hashCode, d5: ${d5.hashCode()}, d1: ${d1.hashCode()}")

    val d6 = Decorations2("crystal", "wood", "diver")
    println(d6)

    val (rock, wood, diver) = d6
    println(rock)
    println(wood)
    println(diver)

}

data class Decorations(val rocks: String)

private data class Decorations2(val rocks: String, val wood: String, val diver: String)

