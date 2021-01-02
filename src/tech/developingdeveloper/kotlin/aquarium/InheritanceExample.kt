package tech.developingdeveloper.kotlin.aquarium


/**
 * Created by Abhishek Saxena on 28-06-2020.
 */

interface AquariumAction {
    fun eat()
    fun jump()
    fun clean()
    fun catchFish()
    fun swim(){
        println("swim")
    }
}

private interface InterfaceFishAction {
    fun eat()
}

abstract class AbstractAquariumFish: InterfaceFishAction{
    abstract val color: String
    override fun eat() = println("yum")
}

//interface delegation - lets add features using composition - learn
//this is a better way (kotlin way)

fun main(){
    delegate()
}

fun delegate(){
    val pleco = Plecostomus()
    println("Fish has color ${pleco.color}" )
    pleco.eat()
}

interface FishColor {
    val color: String
}

class Plecostomus(fishColor: FishColor = GoldColor):
        InterfaceFishAction by PrintingFishAction("a lot of algae"),
        FishColor by GoldColor

object GoldColor: FishColor{
    override val color = "gold"
}

object RedColor: FishColor{
    override val color = "red"
}

class PrintingFishAction(val food: String): InterfaceFishAction{
    override fun eat() {
        println(food)
    }
}
