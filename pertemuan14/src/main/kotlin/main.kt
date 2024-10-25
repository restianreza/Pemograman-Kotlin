class MyMath {
    companion object {
        fun factorial(number: Int): Int {
            return (1..number).fold(1) { a, b -> a * b}
        }
    }
}

fun main () {
    val numbers = arrayListOf(1, 2, 3,)
    numbers.removeAt(numbers.lastIndex)
//    numbers.removeLast()
    println(numbers)

    val months = arrayOf(
        "Januari", "Februari", "Maret",
        "April", "Mei", "Juni", "Juli",
        "Agustus", "September","Oktober", "November", "Desember"
    )

    class SimpleDate1 (var month: String)

    fun monthsUntilWinterBreak(from: SimpleDate1): Int {
        return months.indexOf("Desember") - months.indexOf(from.month)

    }

    class SimpleDate2 (var month: String) {
        fun monthsUntilWinterBreak(from: SimpleDate2): Int {
            return months.indexOf("Desember") - months.indexOf(from.month)

        }
    }

    val date2 = SimpleDate2( "Oktober")
    println(date2.monthsUntilWinterBreak(date2))

    // Introducing this
    class SimpleDate3 (var month: String) {
        fun monthsUntilWinterBreak(): Int {
            return months.indexOf("Desember") - months.indexOf(this.month)

        }
    }
    val date3 = SimpleDate3("September")
    println(date3.monthsUntilWinterBreak())

    //companion object method
    println(MyMath.factorial(6)) // 720

    class SimpleDate() {
        var month: String = "Januari"

        fun monthsUntilWinterBreak(): Int {
            return months.indexOf("Desember") - months.indexOf(this.month)

        }
    }
 //extention methods
    fun SimpleDate.monthsUntilSummerBreak(): Int {
        val monthIndex = months.indexOf(month)
        return if (monthIndex in 0..months.indexOf("Juni")) {
            months.indexOf("Juni") - months.indexOf(month)
        } else if (monthIndex in months.indexOf("Juni")..months.indexOf("Agustus")) {
            0
        } else {
            months.indexOf("Juni") + (12 - months.indexOf(month))
        }
    }
    val date = SimpleDate()
    date.month = "Desember"
    println(date.monthsUntilSummerBreak())

    fun Int.abs(): Int {
        return if (this < 0) -this else this
    }
    println(4.abs())
    println((-4).abs())
}