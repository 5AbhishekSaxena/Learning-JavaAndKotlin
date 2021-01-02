package tech.developingdeveloper.kotlin.practice.spice



/**
 * Created by Abhishek Saxena on 28-06-2020.
 */

fun main() {
    /*val spices1 = listOf(
            Spice(name = "curry", spiciness = SPICES.MILD),
            Spice(name = "pepper", spiciness = SPICES.MEDIUM),
            Spice(name = "cayenne", spiciness = SPICES.SPICY),
            Spice(name = "ginger", spiciness = SPICES.MILD),
            Spice(name = "red curry", spiciness = SPICES.MEDIUM),
            Spice(name = "green curry", spiciness = SPICES.MILD),
            Spice(name = "hot pepper", spiciness = SPICES.EXTREMELY_SPICY)
    )

    val spice = Spice(name = "cayenne", spiciness = SPICES.SPICY)

    val spiceList = spices1.filter { it.heat < 5 && it.name.contains("curry")}

    fun makeSalt() = Spice("Salt")

    spiceList.forEach { println(it) }*/

    delegate()
}

private fun delegate(){
    val curry = Curry(name = "something")
    val curry1 = Curry(curry)

    println("hashCodes: curry: ${curry.hashCode()}, curry1: ${curry1.hashCode()}")
    //curry.color
}