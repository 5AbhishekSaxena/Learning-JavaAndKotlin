package tech.developingdeveloper.kotlin.single_abstract_method


/**
 * Created by Abhishek Saxena on 29-06-2020.
 */

// SAM - Single Abstract Method
// It is an interface with just 1 method

// #1
interface Runnable {
    fun run()
}

// #2
interface Callable<T> {
    fun call(): T
}


fun example() {
    // Java example
    val runnable = object : Runnable {
        override fun run() {
            // do something
            println("I'm a runnable.")
        }
    }
    JavaRun().runNow(runnable)

    // kotlin
    JavaRun.runNow {
        println("Passing a lambda as a runnable.")
    }

}

fun main(){
    example()
}
