import kotlin.math.roundToInt

class Car(val make: String, val color: String)

class Contact(var fullName: String, var emailAdd: String)

class Contact2(val fullName: String, val emailAdd: String)

class Contact3(val fullName: String, val emailAdd: String, var type: String = "Friend")

class Person(val firstName: String, val lastName: String){
    val fullName = "$firstName $lastName"
}

class Address {
    var address1: String
    var address2: String
    var city: String
    var state: String

    init {
        address1 = ""
        address2 = ""
        city = ""
        state = ""
    }
}

class TV(var height: Double, var width: Double) {
    var diagonal: Int
        get() {
            val result = Math.sqrt(height * height + width * width)
            return result.roundToInt()
        }
        set(value) {
            val ratioWidth = 16.0
            val ratioHeight = 9.0
            val ratioDiagonal = Math.sqrt(ratioWidth * ratioWidth + ratioHeight * ratioHeight)
            height = value * ratioHeight / ratioDiagonal
            width = height * ratioWidth / ratioHeight
        }
}

class Level(val id: Int, var boss: String, var unlocked: Boolean) {
    companion object {
        var highestLevel = 1
    }
}


fun main() {
    val contact = Contact(fullName = "Reza DR", emailAdd = "rezarestian03")
    val name = contact.fullName
    val email = contact.emailAdd

    contact.fullName = "Restian Reza"
    val reza = contact.fullName

    var contact2 = Contact2(fullName ="Restian Reza", emailAdd = "rezarestian03@drr.cpm")
    var contact22 = Contact2("Restian Reza", "rezarestian03@drr.cpm")

//    contact2.emailAdd = "reza@gmail.com"
    //default values
    var contact3 = Contact3(fullName = "sfdhgweauyfdg", emailAdd = "kajqshd")

    //property init
    val person = Person("Reza", "sdefba@sd.com")
    person.fullName

    val address = Address()
    println(contact3)

    // custom asseors
    val tv = TV(height = 53.93, width = 95.87)
    val size = tv.diagonal

    tv.width = tv.height
    val diagonal = tv.diagonal

    tv.diagonal = 70
    println(tv.height)
    println(tv.width)

    // companion object properties
    val level1 = Level(1, "Charmander", true)
    val level2 = Level(1, "Mewtwo", true)
    val level3 = Level(1, "Pikachu", true)
    val level4 = Level(1, "Mandrill", true)
    //  Error: can't acces members of the companion object on an instance
    //  val highestLevel = level3.highestLevel
    val highestLevel = Level.highestLevel // 1
    println(highestLevel)



}








/*
teori= function, nullability, save call, elvis operator, counter, smart case, collection(array, list, map, set,),
class, object, property, method, [class, data class], function as argument, function as an fariabel, companion object,
perbedaan antara onject dan companion object contoh masing-masing
*/
