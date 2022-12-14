import java.io.File
import java.math.BigInteger
import java.security.MessageDigest

/**
 * Reads lines from the given input txt file.
 */
fun readInput(name: String) = File("src", "$name.txt")
    .readLines()

/**
 * Reads whole input txt file as string
 */
fun getInput(name: String) = File("src", "$name.txt").readText()

/**
 * Converts string to md5 hash.
 */
fun String.md5() = BigInteger(1, MessageDigest.getInstance("MD5").digest(toByteArray()))
    .toString(16)
    .padStart(32, '0')

fun <T> MutableList<T>.prepend(element: T) {
    add(0, element)
}
fun <T> MutableList<T>.append(element: T) {
    add(element)
}

fun <T> MutableCollection<T>.removeFirst()
        = first().also{ remove(it) }

fun <T> MutableCollection<T>.removeFirstOrNull()
        = firstOrNull().also{ remove(it) }
