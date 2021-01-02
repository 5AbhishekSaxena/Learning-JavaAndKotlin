package tech.developingdeveloper.kotlin.aquarium


/**
 * Created by Abhishek Saxena on 28-06-2020.
 */

class Fish(volumeNeeded: Int, val friendly: Boolean = true){
    val size: Int

    init{
        println("first init block")
    }

    constructor(): this( 9){
        println("running secondary constructor")
    }

    init {
        println("second init block")

        size = if (friendly) {
            volumeNeeded
        } else {
            volumeNeeded * 2
        }
    }

    init {
        println("third init block, constructed fish of size $volumeNeeded final size ${this.size}")
    }

    init {
        println("last init block")
    }
}

private fun makeDefaultFish() = Fish( 50, true)

private fun fishExample(){
    val fish = Fish(20)
    println("Is the fish friendly? ${fish.friendly}. It needs volume ${fish.size}")
}

fun main(){
    makeDefaultFish()
}


