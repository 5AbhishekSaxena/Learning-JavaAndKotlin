package tech.developingdeveloper.kotlin.practice.spice

import tech.developingdeveloper.kotlin.Color


/**
 * Created by Abhishek Saxena on 28-06-2020.
 */

// Making Spice a sealed class helps keep all the spices together in one file.
sealed class Spice(
        var name: String,
        var spiciness: SPICES = SPICES.MILD,
        color: SpiceColor
) : SpiceColor by color {
    val heat: Int
        get() {
            return when (spiciness) {
                SPICES.MILD -> 1
                SPICES.MEDIUM -> 3
                SPICES.SPICY -> 5
                SPICES.VERY_SPICY -> 7
                SPICES.EXTREMELY_SPICY -> 10
            }
        }

    fun getSpiciness() = spiciness.value.capitalize()

    abstract fun prepareSpice()

    override fun toString(): String {
        return "{ Spice " +
                " Name: $name, " +
                "Spices: ${getSpiciness()}, " +
                "Heat: $heat" +
                " }"
    }
}

class Curry(name: String, spiciness: SPICES = SPICES.MILD, color: SpiceColor = YellowSpiceColor) :
        Spice(name = name, spiciness = spiciness,
                color = color),
        Grinder {

    override fun grind() {

    }

    override fun prepareSpice() {
        grind()
    }

    constructor(curry: Curry) : this(curry.name, curry.spiciness, YellowSpiceColor)

}

interface Grinder {

    fun grind() {

    }
}

interface SpiceColor {
    val color: Color
}

object YellowSpiceColor : SpiceColor {
    override val color: Color
        get() = Color.YELLOW
}


enum class SPICES(val value: String) {
    MILD("mild"),
    MEDIUM("medium"),
    SPICY("spicy"),
    VERY_SPICY("very spicy"),
    EXTREMELY_SPICY("extremely spicy")
}