package tech.developingdeveloper.kotlin.practice

import java.util.*


/**
 * Created by Abhishek Saxena on 28-06-2020.
 */


// val - value can be determined at runtime
// const val - value determined at compile time

// companion objects are initialized from the static constructor of the containing class
// which means that they are created when the object is created

// plain objects are initialized lazily which means they are created when the object is first used

const val MAX_NUMBER_BOOKS = 20

open class Book(val title: String, val author: String, private val year: Int, var pages:Int = 200) {

    var currentPage = 1

    open fun readPage() {
        currentPage++
    }

    companion object {
        val BASE_URL = "http://www.turtlecare.net/"
    }

    fun getTitleAuthor(): Pair<String, String> {
        return (title to author)
    }

    fun getTitleAuthorYear(): Triple<String, String, Int> {
        return Triple(title, author, year)
    }

    fun canBorrow(hasBooks: Int): Boolean {
        return (hasBooks < MAX_NUMBER_BOOKS)
    }

    fun printUrl() {
        println(BASE_URL + title + ".html")
    }
}

class eBook(title: String, author: String, year: Int, var format: String = "text") : Book(title, author, year) {

    var wordsRead = 0

    override fun readPage() {
        wordsRead += 250
    }
}

fun main() {
    val book = Book("An Amazing Book", "Abhishek Saxena", 2020)

    val bookTitleAuthor = book.getTitleAuthor()
    val bookTitleAuthorYear = book.getTitleAuthorYear()

    val (title, author, year) = book.getTitleAuthorYear()
    println("Here is your book ${bookTitleAuthor.first} by ${bookTitleAuthor.second}")

    println("Here is your book ${bookTitleAuthorYear.first} " +
            "by ${bookTitleAuthorYear.second} written in ${bookTitleAuthorYear.third}")

    println("Here is your book $title " +
            "by $author written in $year")

    val allBooks = setOf("Macbeth", "Romeo and Juliet", "Hamlet", "A Midsummer Night's Dream")
    val library = mapOf("Shakespeare" to allBooks)
    val key = "Shakespeare"
    library[key]?.forEach { bookName -> println("$key: $bookName") }

    // any() is applied to a collection and takes a lambda as its argument
    println("Does Library has hamlet? ${if (library.any { it.value.contains("Hamlet") }) "Yes" else "No"}")

    // getOrPut() is a handy function that will check whether a key is in a map, and if it is, will return the value.
    // Otherwise, it will add the key with the supplied value to the map.
    val moreBooks = mutableMapOf("Wilhelm Tell" to "Schiller")
    println("moreBooks: $moreBooks")
    moreBooks.getOrPut("Jungle Book") { "Kipling" }
    println("moreBooks: $moreBooks")
    moreBooks.getOrPut("Hamlet") { "Shakespeare" }
    println("moreBooks: $moreBooks")

    implementPuppy()
}

fun Book.tornPages(torn: Int) = if (pages >= torn) pages -= torn else pages = 0

fun Book.weight() : Double { return (pages * 1.5) }

class Puppy {
    fun playWithBook(book: Book) {
        book.tornPages(Random().nextInt(12))
    }
}

fun implementPuppy(){
    val puppy = Puppy()
    val book = Book("Oliver Twist", "Charles Dickens", 1837, 540)

    while (book.pages > 0) {
        puppy.playWithBook(book)
        println("${book.pages} left in ${book.title}")
    }
    println("Sad puppy, no more pages in ${book.title}. ")
}