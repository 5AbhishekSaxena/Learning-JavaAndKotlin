package tech.developingdeveloper.kotlin


object MobyDickWhale {

    val author = "Herman Melville"

    fun jump(){

    }
}

enum class Color(val rgb: Int){
    RED(0xFF0000),
    GREEN(0x00FF00),
    BLUE(0x0000FF),
    YELLOW(0xFFFF00)
}

//classes and sub classes are declared in the same file
//cannot subclass Seal anywhere else and compiler knows about the subclasses at the compile time
sealed class Seal{
    object SeaLion : Seal()
    object Walrus : Seal()

    fun matchSeal(seal: Seal): String{
        return when(seal){
            is Walrus -> "Walrus"
            is SeaLion -> "Sea Lion"
        }
    }
}

