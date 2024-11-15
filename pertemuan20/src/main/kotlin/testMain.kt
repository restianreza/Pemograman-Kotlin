// Fungsi untuk menghasilkan bulleted list dengan format "- item"
fun List<String>.toBulletedList(): String {
    val separator = "\n - "
    return this.joinToString(separator, prefix = separator, postfix = "\n")
}

// Fungsi untuk menghasilkan ordered list dengan format "1. item", "2. item", dsb.
fun List<String>.toOrderedListTest(): String {
    var index = 1
    return this.map { "${index++}. $it" }.joinToString(separator = "\n")
}

// Fungsi untuk menghasilkan numbered list dengan format "1. item", "2. item", dsb.
fun List<String>.toNumberedListTest(): String {
    return this.mapIndexed { index, item -> "${index + 1}. $item" }.joinToString(separator = "\n")
}

// Fungsi generik untuk menghasilkan bulleted list yang bisa menerima berbagai tipe data (misalnya Int, String)
fun <T> List<T>.toBulletedListTest(): String {
    val separator = "\n - "
    return this.joinToString(separator, prefix = separator, postfix = "\n")
}

fun main() {
    // List dengan data bertipe String
    val names: List<String> = listOf("Bob", "Carol", "Ted", "Alice")
    println("Names (Bulleted List):\n${names.toBulletedListTest()}")
    println("Names (Ordered List):\n${names.toOrderedListTest()}")
    println("Names (Numbered List):\n${names.toNumberedListTest()}")

    // Menampilkan nama pertama
    val firstName = names.first()
    println("\nFirst name: $firstName")

    // List dengan data bertipe Int
    val numbers: List<Int> = listOf(100, 200, 300, 400, 500, 600)
    println("\nNumbers (Bulleted List):\n${numbers.toBulletedListTest()}")
}
