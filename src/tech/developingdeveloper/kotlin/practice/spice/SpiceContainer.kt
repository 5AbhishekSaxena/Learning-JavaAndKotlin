package tech.developingdeveloper.kotlin.practice.spice


/**
 * Created by Abhishek Saxena on 29-06-2020.
 */

data class SpiceContainer(var spice: Spice) {
    val label = spice.name

}

fun main(){
    val spiceCabinet = listOf(
            SpiceContainer(Curry("Yellow Curry")),
            SpiceContainer(Curry("Red Curry", SPICES.MEDIUM)),
            SpiceContainer(Curry("Green Curry", SPICES.SPICY))
    )

    spiceCabinet.forEach { println(it.label) }
}