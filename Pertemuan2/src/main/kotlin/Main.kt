import org.w3c.dom.css.Counter
import kotlin.math.*

fun main() {
    // Shift Operation
    println("Shift Operation -----------------------------")
    println(1 shl 3)
    // SHL to Left Menggeser biner 1= 00000001 -> 00001000 =8
    println(32 shr 2)
    // SHR to right Menggeser biner 1= 00000001 -> 00001000 =8
    println(103 shr 3)

    //Order Operation
    /* - Parenthese ()
    *  - Exponents pangkat
    *  - Multiplication *
    *  - Division + -
    *  - Addition
    *  - Substraction */
    println()
    println("Order Operation -----------------------------------")
    println(((8000 / (5 * 10)) - 32) shr (29 % 5))
    println(5 * 10) //=50
    println(8000 / 50) //=160
    println(160 - 32) //=128 1.0.0.0.0.0.0.0
    println(29 % 5)//=4
    println(128 shr 4) //=8 0.0.0.0.1.0.0.0

    // Math Function (import kotlin.math.*)
    println()
    println("Math Function ----------------------------------")
    println(sin(45 * PI / 180))
    println(cos(45 * PI / 180))
    println(sqrt(2.0))
    println(max(5, 10))
    println(min(-5, -10))
    println(max(sqrt(2.0), PI / 2))

    val number: Int = 10
    val pi: Double = 3.14159
    //number = 0 --> variabel number tidak dapat diubah lagi nilainya
    println(number)
    println(reallyConstant)

    //Variables VAL
    println()
    println("Variables VAL-----------------------------------")
    var x: Int = 42
    println(x) // 42
    x = 0
    println(x) // 0
    x = 1_000_000
    println(x) // 1000000

    //Meaningfull Names
    //1.Good Meaningfull Names
    //  personAge
    //  numberOfPeople
    //  gradePointAverage
    //2.Bad Meaningfull Names
    //  a
    //  temp
    //  average

    // Increment dan Decrement
    println()
    println("Increment dan Decrement-----------------------------------")
    var counter: Int = 0
    counter += 1 // sama saja dengan counter = counter + 1
    println(counter)
    counter -= 1 // sama saja dengan counter = counter - 1
    println(counter)

    counter = 10
    counter *= 3 // sama saja dengan counter = counter * 3
    println(counter)
    counter /=2 //sama saja dengan counter = counter / 2
    println(counter)
}

// Compile-time constant
const val reallyConstant: Int = 42