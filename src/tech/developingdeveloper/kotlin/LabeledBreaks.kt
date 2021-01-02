package tech.developingdeveloper.kotlin


/**
 * Created by Abhishek Saxena on 29-06-2020.
 */

fun labels(){

    loop@ for (i in 1..100){
        for(j in 1..100){
            if ( i > 10) break@loop
        }
    }
}