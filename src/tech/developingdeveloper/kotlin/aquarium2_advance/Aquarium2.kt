package tech.developingdeveloper.kotlin.aquarium2_advance


/**
 * Created by Abhishek Saxena on 29-06-2020.
 */

data class Fish(var name: String)

fun main() {
    fishExamples()
}

fun fishExamples() {
    val fish = Fish("splashy")

    myWith(fish.name) {
        capitalize()
    }

    //expanded form - withoput inline
    myWith(fish.name, object : Function1<String, Unit> {
        override fun invoke(name: String) {
            name.capitalize()
        }
    })


    // return the result of the block function
    println(fish.run { name })

    // returns the same object
    println(fish.apply {})

    val fish2 = Fish("splashy").apply { name = "Sharky" }
    println(fish2.name)

    // returns copy of the changed object
    // useful for chaining manipulations together
    println(fish.let { it.name.capitalize() }
            .let { it + "fish" }
            .let { it.length }
            .let { it + 31 }
    )

    // with inline
    fish.name.capitalize()
}

// higher order function
// with inline no object is created, and lambda is inclined here
inline fun myWith(name: String, block: String.() -> Unit) {
    name.block()
}

