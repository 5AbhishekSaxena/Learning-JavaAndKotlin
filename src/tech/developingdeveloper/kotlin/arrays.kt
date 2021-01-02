package tech.developingdeveloper.kotlin


/**
 * Created by Abhishek Saxena on 13-06-2020.
 */

fun main(args: Array<String>) {
    val arr = arrayOf(3, 4, 2, 1, 3, 4)

    println(arr.max())
    println(arr.count { it == arr.max() })

    val max = arr.max()
    var count = 0
    for(i in arr){
        if(i == max)
            count++
    }

    println(count)
}