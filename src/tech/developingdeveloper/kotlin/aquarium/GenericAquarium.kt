package tech.developingdeveloper.kotlin.aquarium


/**
 * Created by Abhishek Saxena on 29-06-2020.
 */

abstract class WaterSupply(var needsProcessed: Boolean) {
    /*open fun addChemicalCleaners(){
        println("from WaterSupply class")
    }*/

    fun testFun() {
        //this function is available in all the sub classes
    }
}

class TapWater : WaterSupply(true) {

    /*override*/ fun addChemicalCleaners() {
        println("from TapWater class")
        needsProcessed = false
    }
}

class FishStoreWater : WaterSupply(false)

class LakeWater : WaterSupply(true) {
    fun filter() {
        needsProcessed = false
    }
}

// generic way
// able to directly access the sub-class methods

// out - T can only be returned from functions. One special case: Constructors can take out type as parameters
// in - T can only be passed as a parameter to a function and cannot be returned

// generics types are only used at compile time by Kotlin this makes sure that the code correctly generated without errors.
// However, at runtime, all the generic types are erased as compiler can create completely correct code without
// keeping the generics to the runtime

class GenericAquarium<out T : WaterSupply>(val waterSupply: T){


    fun addWater(cleaner: Cleaner<T>) {
        if (!waterSupply.needsProcessed) {
            cleaner.clean(waterSupply)
        }

        println("adding water from $waterSupply")
    }
}

// inheritance way
// need to override methods to access the methods of the subclass
class InheritanceAquarium(val waterSupply: WaterSupply)

fun genericExample() {
    val aquarium1 = GenericAquarium(TapWater())
    aquarium1.waterSupply.addChemicalCleaners()

    /*// error
    val aquarium2 = GenericAquarium("string")
    println(aquarium2.waterSupply)

    // error
    val aquarium3 = GenericAquarium(null)
    println(aquarium3.waterSupply)*/


    val aquarium4 = InheritanceAquarium(TapWater()) // NOT same as aquarium1
    //aquarium4.waterSupply.addChemicalCleaners() //cannot access - To access it, we need to override the method
    //aquarium4.waterSupply.testFun() //testFun in tap water will be called

    val aquarium5 = GenericAquarium(TapWater())
    addItemTo(aquarium5)

    val cleaner = TapWaterCleaner()
    val aquarium6 = GenericAquarium(TapWater())
    aquarium6.addWater(cleaner)
    isWaterClean(aquarium6) // true
    aquarium6.hasWaterSupplyOfType<TapWater>() // true
    aquarium6.hasWaterSupplyOfType<LakeWater>() // false
}

interface Cleaner<in T: WaterSupply> {
    fun clean(waterSupply: T)
}

class TapWaterCleaner: Cleaner<TapWater>{
    override fun clean(waterSupply: TapWater) {
        waterSupply.addChemicalCleaners()
    }
}

fun addItemTo(aquarium: GenericAquarium<WaterSupply>) = GenericAquarium(TapWater())

fun <T: WaterSupply>isWaterClean(aquarium: GenericAquarium<T>){
    println("aquarium water is clean: ${aquarium.waterSupply.needsProcessed}")
}

// reified means real, a reified type is a real type
// to yse reified, use keyword `inline` before `fun` and `reified` before `R`
inline fun <reified R: WaterSupply> GenericAquarium<*>.hasWaterSupplyOfType() = waterSupply is R

fun main() {
    genericExample()
}