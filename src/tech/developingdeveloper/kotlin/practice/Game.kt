package tech.developingdeveloper.kotlin.practice


/**
 * Created by Abhishek Saxena on 29-06-2020.
 */

enum class Direction {
    NORTH,
    SOUTH,
    EAST,
    WEST,
    START,
    END
}

class Game {
    private var path = mutableListOf(Direction.START)

    //lambda
    private val north: () -> Boolean = { path.add(Direction.NORTH) }

    private val south = { path.add(Direction.SOUTH) }

    private val east = { path.add(Direction.EAST) }

    private val west = { path.add(Direction.WEST) }

    private val end = {
        path.add(Direction.END)
        println("Game Over: $path")
        path.clear()
        false
    }

    // where takes a lambda function that do not take any parameter and return a boolean value
    private inline fun move(where: () -> Boolean) {
        where()
    }

    fun makeMove(command: String?) {
        if (command.equals("n", true) || command.equals("north", true))
            move(north)
        else if (command.equals("s", true) || command.equals("south", true))
            move(south)
        else if (command.equals("e", true) || command.equals("east", true))
            move(east)
        else if (command.equals("w", true) || command.equals("west", true))
            move(west)
        else
            move(end)
    }
}

fun main() {
    val newGame = Game()
    while (true) {
        println("Enter a direction: n/s/e/w: ")
        val input = readLine()
        if (input.equals("exit", ignoreCase = true)) {
            newGame.makeMove("end")
            break
        }
        newGame.makeMove(input)
    }
}