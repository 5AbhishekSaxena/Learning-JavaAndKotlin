package tech.developingdeveloper.kotlin.practice.buildings


/**
 * Created by Abhishek Saxena on 29-06-2020.
 */

open class BaseBuildingMaterial {
    open val numberNeeded = 1
}

class Wood : BaseBuildingMaterial() {
    override val numberNeeded = 4
}

class Brick : BaseBuildingMaterial() {
    override val numberNeeded = 8
}

class Building<out T : BaseBuildingMaterial>(private val buildingMaterial: T) {

    private val baseMaterialsNeeded = 100
    val actualMaterialsNeeded = buildingMaterial.numberNeeded * baseMaterialsNeeded

    fun build() {
        println("$actualMaterialsNeeded ${buildingMaterial::class.simpleName} required")
    }

    fun getMaterialType(): T {
        return buildingMaterial
    }
}


fun Building<*>.isSmallBuilding() {
    if (actualMaterialsNeeded < 500) {
        println("Small Building")
    } else {
        println("Large Building")
    }
}

//OR

fun <T : BaseBuildingMaterial> isSmallBuilding1(building: Building<T>) {
    if (building.actualMaterialsNeeded < 500) {
        println("Small Building")
    } else {
        println("Large Building")
    }
}

fun main() {
    val woodBuilding = Building(Wood())
    woodBuilding.build()
    val brickBuilding = Building(Brick())
    brickBuilding.build()

    woodBuilding.isSmallBuilding()
    isSmallBuilding1(woodBuilding)

    val list = listOf(woodBuilding, brickBuilding)

    for (building in list) {
        if (building.getMaterialType() is Wood)
            println("Material type is of type Wood")
        else
            println("Material type is of type Brick")

    }

}