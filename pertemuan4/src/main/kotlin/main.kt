fun main() {
    // Boolean Variable
    val yes:Boolean = true
    val no = false

    // Boolean Operator
    val x = (1 == 2)
    val doesOneEqualTwo = (1 == 2)
    println(doesOneEqualTwo) // > false

    val doesOneNotEqualTwo = (1 != 2)
    println(doesOneNotEqualTwo) // > true

    val alsoTrue = !(1 == 2)
    println(alsoTrue) // > true

    val isOneGreatherThanTwo = (1 > 2)
    println(isOneGreatherThanTwo)

    val isOneLessThanTwo = (1 < 2)
    println(isOneLessThanTwo)

    //Boolean Logic
    val operasiAnd = true && true
    val operasiOr  = true || false

    val andTrue = 1 < 2 && 4 > 3 // True
    println(andTrue)
    val andFalse = 1 > 2 && 4 > 3 // false
    println(andFalse)
    val orFalse = 1 == 2 || 3==3 // True
    println(orFalse)

//    (1 < 2 && 3 > 4) || 1 < 4 --> True/false
//    (true && false) || true --> true/false

    // String Equality
    val dog = "dog"
    val cat = "cat"
    val dogEqualsCat = dog == cat
    println(dogEqualsCat)
    val order = cat < dog
    println(order)

    // Ekspresi If
    if (2 > 1){
        println("yes")
    }

    val animal = "Fox"
    if (animal == "cat" || animal == "dog") {
        println("Animal is a House Pet")
    } else {
        println("Animal is not a house pet")
    }

    // Mencari nilai maksimum dan minimum dari 2 nilai
    val a = 5
    val b = 10

//    val min: Int
//    if (a < b ) {
//        min = a
//    } else {
//        min = b
//    }
//
//    val max: Int
//    if (a > b ) {
//        max = a
//    } else {
//        max = b
//    }

    val min = if (a < b) a else b
    val max = if (a > b) a else b
    println(min)
    println(max)

    val hourOfDay = 12
    val timeOfDay = if (hourOfDay < 6 ) {
        "Early morning"
    } else if (hourOfDay < 12){
        "Morning"
    } else if (hourOfDay < 17){
        "Afternoon"
    } else if (hourOfDay < 20){
        "Night"
    } else if (hourOfDay < 24){
        "Late Night"
    } else {
        "Invalid Hour"
    }
    println(timeOfDay)

    // Loops
    var sum = 1
    while (sum < 1000) {
        sum = sum + (sum +1)
    }
    println(sum)
    //Sebelum iterasi 1, sum = 1, condition = true
    //setelah iterasi 2, sum = 3, condition = true
    //setelah iterasi 3, sum = 7, condition = true
    //setelah iterasi 4, sum = 15, condition = true
    //setelah iterasi 5, sum = 31, condition = true
    //setelah iterasi 6, sum = 63, condition = true
    //setelah iterasi 7, sum = 127, condition = true
    //setelah iterasi 8, sum = 255, condition = true
    //setelah iterasi 9, sum = 511, condition = true
    //setelah iterasi 10, sum = 1023, condition = false

    //do while loops
    sum = 1
    do {
        sum =sum + (sum + 1)
    }while (sum < 1000)
    println(sum)

    sum = 1
    while (sum < 1) {
        sum = sum + (sum + 1)
    }
    println(sum)

    sum = 1
    do {
        sum = sum + (sum + 1)
    } while (sum < 1)
    println(sum)

    // Penggunaan Break
    sum = 1
    while (true) {
        sum = sum + (sum + 1)
        if (sum >= 1000) {
            break
        }
    }
    println(sum)
}