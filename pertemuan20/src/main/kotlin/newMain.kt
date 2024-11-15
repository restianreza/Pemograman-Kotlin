//fun List<String>.toBulletedList(): String {
//    val separator = "\n - "
//    return this.map { it }.joinToString (separator, prefix = separator, postfix = "\n")
//}

//fun List<String>.toOrderedList(): String {
//    var index = 1
//    return this.map { "${index++}.$it" }.joinToString(separator = "\n")
//}

//fun List<String>.toNumberedList(): String {
//    return this.mapIndexed { index, item -> "${index + 1}. $item" }.joinToString(separator = "\n")
//}

//fun List<Int>.toBulletedListInt(): String {
//    val separator = "\n - "
//    return this.map { it }.joinToString (separator, prefix = separator, postfix = "\n")
//}

fun <T> List<T>.toBulletedList(): String {
    val separator = "\n - "
    return this.map { it }.joinToString (separator, prefix = separator, postfix = "\n")
}

fun <T> List<T>.toOrderedList(): String {
    var index = 1
    return this.map { "${index++}.$it" }.joinToString(separator = "\n")
}

fun main() {
    val names: List<String> = listOf("Bob", "Carol", "Ted", "Alice")
    println("Names: ${names.toBulletedList()}")
    println("Names: \n${names.toOrderedList()}")

    val firstName = names.first()
    println(firstName)

    val numbers: List<Int> = listOf(100, 200, 300, 400, 500, 600)
    println("Numbers: ${numbers.toBulletedList()}")

    val currency: List<Number> = listOf(1_000_000, 50.15, 3000, 0.4, 0.55)
    println("Currency: ${currency.toBulletedList()}")

    val things = mutableListOf<Any>(1,2)
    things.add("Steve")
    println("Things: ${things.toBulletedList()}")

    val map = listOf(
        Pair("One", 1),
        Pair("Two", "II"),
        Pair("Three", 3.0f)
    )
//    val one = map.get(1)
//    val one = map [1]

    val valuesForKeyWithE = map
        .filter { it.first.contains("e") }
        .map { "Value for ${it.first}: ${it.second}" }

    println("Values for keys with E: $valuesForKeyWithE")

//    fun <T> List<T>.first() : T
//    fun <K, V> mapOf(pair: Pair<K, V>): Map<K, V>
    



}