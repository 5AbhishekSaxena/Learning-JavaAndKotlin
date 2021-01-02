package tech.developingdeveloper.kotlin.aquarium2_advance


/**
 * Created by Abhishek Saxena on 29-06-2020.
 */

val numbers = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 0)

fun main() {
    //val  = mutableListOf<Int>()
    println(
            numbers.divisibleBy { num ->
                println("item.rem: ${num.remainder(3)}")
                num.remainder(3)

                //block - it.remainder(3)
            }
    )

    println(
            numbers.divisibleBy { num -> num.remainder(5) } // [5, 0]
    )

    println(numbers.divisibleBy { 3 }) //[]
    println(numbers.divisibleBy { 0 }) //[1, 2, 3, 4, 5, 6, 7, 8, 9, 0]

}

// (Int) -> Int, taking Int as argument and returning Int
fun Int.remainder(divisor: Int) = this % divisor

fun List<Int>.divisibleBy(block: (Int) -> Int): List<Int> {
    val result = mutableListOf<Int>()
    for (item in this) {
        if (block(item) == 0)
            result.add(item)
    }

    return result
}