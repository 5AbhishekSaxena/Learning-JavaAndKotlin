package tech.developingdeveloper.kotlin.aquarium

import kotlin.math.PI


/**
 * Created by Abhishek Saxena on 28-06-2020.
 */

open class Aquarium(var width: Int = 20, var length: Int = 40, var height: Int = 100) {

    //in kotlin everything is public by default

    open var volume: Int
        get() = width * height * length / 1000
        set(value) {
            height = (value * 1000) / width * length
        }

    open var water = volume * 0.9

    private var numberOfFish: Int = 0

    constructor(numberOfFish: Int) : this() {
        val water = numberOfFish * 2000 //cm3
        val tank = water + water * 0.1
        height = (tank / (length * width)).toInt()
        this.numberOfFish = numberOfFish
    }
}

class TowerTank(): Aquarium(){

    override var water = volume * 0.8

    override var volume: Int
        get() = (width * height * length / 1000 * PI).toInt()
        set(value) { height = (value * 1000) / (width * length) }


}