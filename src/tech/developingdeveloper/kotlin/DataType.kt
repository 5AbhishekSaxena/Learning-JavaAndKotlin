package tech.developingdeveloper.kotlin

import kotlin.math.pow


/**
 * Created by Abhishek Saxena on 14-06-2020.
 */


fun main(args: Array<String>) {

    val myNumber = 1000_21

    println("${Short.MAX_VALUE}") //32767
    println("${Short.MIN_VALUE}") //-32768

    println("${Byte.MAX_VALUE}")
    println("${Byte.MIN_VALUE}")

    val number: Short = 32769.toShort()

    println("number: $number")

    val array = Array(5) { it * 2 }
    println(array.asList())

    val swarm = mutableListOf(12, 5)
    //basic for loop
    for ((index, element) in swarm.withIndex())
        println("Fish at $index is $element")

    //ranges in alphabet
    for (i in 'b'..'g') print(i)
    println()

    for (i in 1..5) print(i)
    println()

    //downwards range
    for (i in 5 downTo 1) print(i)
    println()

    //upward range with increment of 2
    for (i in 3..6 step 2) print(i)
    println()

    val byteArray = Array(7) { 1000.0.pow(it) }// initalize array here
    val sizes = arrayOf("byte", "kilobyte", "megabyte", "gigabyte",
            "terabyte", "petabyte", "exabyte")
    for ((i, value) in byteArray.withIndex()) {
        println("1 ${sizes[i]} = ${value.toLong()} bytes")
    }

    val list3 : MutableList<Int> = mutableListOf()
    for (i in 0..100 step 7) list3.add(i)
    println("list3 last: ${list3.last()}")
    for(i in list3) print("$i ")
    println()

}