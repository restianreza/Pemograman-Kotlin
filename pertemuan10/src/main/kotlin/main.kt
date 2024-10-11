fun main () {
    // Lambda
    var multiplyLambda: (Int, Int) -> Int    // dekalrasi variabel
    multiplyLambda = { a: Int, b: Int -> Int //menetapkan lambda ke variabel
        a * b
    }

    val lambdaResult = multiplyLambda(4, 2)  // 8
    println(lambdaResult)

    //shorthand syntax
    multiplyLambda = {a, b ->
        a * b
    }

    // it keyword
    var doubleLambda = {a: Int ->
        2 * a
    }

    doubleLambda = {2 * it}
    val square: (Int) -> Int = {it * it}

    println("-----------------------------------------------------------------------------------------------------------")
    // lambda as argument
    fun operatorOnNumbers(a: Int, b: Int, operation: (Int, Int) -> Int): Int {
        val result = operation(a, b)
        //println(result)
        return result
    }

    val addLambda = {a: Int, b: Int ->
        a + b
    }

    println(operatorOnNumbers(4, 2, operation = addLambda))

    fun addFunction(a: Int, b: Int) = a + b
    println(operatorOnNumbers(4, 2, operation = ::addFunction)) // 6

    println(operatorOnNumbers(4, 2, operation = {a: Int, b:Int ->
        a + b
    }))// 6

    println(operatorOnNumbers(4, 2, {a, b ->
        a + b
    })) // 6

    println(operatorOnNumbers(4, 2, operation = Int::plus))

    // trailing lambda syntax
    println(operatorOnNumbers(4, 2) { a, b -> a + b }) // 6

    // lambda with no meaningful return value
    var unitLambda: () -> Unit = {
        println("ini Hanya Contoh!")
    }
    unitLambda()

    var nothingLambda: () -> Nothing = {
        throw NullPointerException()
    }

    // capturing from the enclosing scope
    var counter = 0
    val incrementCounter = {
        counter += 1
    }
    incrementCounter()
    incrementCounter()
    incrementCounter()
    incrementCounter()
    println(counter)

    fun countingLambda(): () -> Int {
        var counter = 0
        val incrementCounter: () -> Int = {
            counter += 1
            counter
        }
        return incrementCounter
    }
    val counter1 = countingLambda()
    val counter2 = countingLambda()
    println(counter1())//1
    println(counter2())//1
    println(counter1())
    println(counter1())
    println(counter2())

}