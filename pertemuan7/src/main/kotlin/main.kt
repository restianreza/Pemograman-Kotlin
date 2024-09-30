fun main(){
    var name = "Reza Restian"
    var age = 21
    var occupation = ""

    // sentinel value
//    var errorCode = 0
    var errorCode: Int? //nullable Int {Int?}
    //cara memberikan pada variabel nullable
    errorCode = 100
    println(errorCode)
    //cara mengaturnya ke null
    errorCode = null
    println(errorCode)

    //cheking null
    var result: Int? = 30
    println(result)

    println(result!! + 1)

    var authorName: String? = "Reza"
    var authorAge: Int? = 21
    var ageAfterBirthday = authorAge!! + 1 //not null assertion operator

    authorAge = null
    println("After Their Next Birthday, author will be $ageAfterBirthday")
    //println("After Two Birthday, author will be ${authorAge!! + 2}")

    //smart case
    var nonNullableAuthor: String
    var nullableAuthor: String?

    if (authorName != null) {
        nonNullableAuthor = authorName
    } else{
        nullableAuthor = authorName
    }

    //safe call
    authorName = "Reza"
    var nameLength = authorName?.length
    println("Author's name has length $nameLength.")
    var nameLengthPlus5 = authorName?.length?.plus(5)
    println("Adsfswefwa $nameLengthPlus5")

    // let function
    authorName?.let {
        nonNullableAuthor = authorName
    }

    authorName?.let{
        nameLength = authorName.length
    }

    // Elvis operator (?:)
    var nullableInt: Int? = 10
    var mustHaveResult = nullableInt ?: 0
    println(mustHaveResult)

    nullableInt = null
    mustHaveResult = nullableInt ?: 0
    println(mustHaveResult)
}