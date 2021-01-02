package tech.developingdeveloper.kotlin.aquarium


/**
 * Created by Abhishek Saxena on 28-06-2020.
 */

fun main(args: Array<String>) {
    buildAquarium()
    makeFish()
}

// private - only visible in the file containing the function AND subclasses cannot see it
// protected - inside a class and subclasses CAN see it
// internal - visible anywhere in the same module
// module - is a set of kotlin files compiled together (visible in a single library)


private fun buildAquarium() {
    val myAquarium = Aquarium()

    println("Length:  ${myAquarium.length} " +
            "Width: ${myAquarium.width} " +
            "Height: ${myAquarium.height}" )

    myAquarium.height = 80

    println("Height: ${myAquarium.height} cm")
    println("Volume: ${myAquarium.volume} liters")

    val smallAquarium = Aquarium(length = 20, width = 15, height = 30)
    println("Small Aquarium: ${smallAquarium.volume} liters")

    val myAquarium2 = Aquarium(numberOfFish = 9)

    println("Small Aquarium 2: ${myAquarium2.volume} liters with " +
            "Length:  ${myAquarium2.length} " +
            "Width: ${myAquarium2.width} " +
            "Height: ${myAquarium2.height}" )
}

fun feedFish(fish: FishAction) {
    fish.eat()
}

private fun makeFish(){
    val shark = Shark()
    val pleco = Plecostomus()

    println("Shark: ${shark.color} \nPlecostomus: ${pleco.color}")

    shark.eat()
    pleco.eat()
}
