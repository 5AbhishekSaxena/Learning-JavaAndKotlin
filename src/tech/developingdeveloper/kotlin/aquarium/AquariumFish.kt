package tech.developingdeveloper.kotlin.aquarium


/**
 * Created by Abhishek Saxena on 28-06-2020.
 */

abstract class AquariumFish : FishAction {
    abstract val color: String
}

class Shark : AquariumFish() {
    override val color: String = "gray"

    override fun eat() {
        println("hunt and eat fish")
    }
}

class ClassPlecostomus : AquariumFish() {
    override val color: String = "gold"

    override fun eat() {
        println("munch on algae")

    }
}

interface FishAction {
    fun eat()
}
