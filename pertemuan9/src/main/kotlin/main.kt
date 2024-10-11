fun main (){
    // maps & sets
    // map<K, V>
    var tahunLahir = mapOf("Anna" to 2000, "Brian" to 2001, "Reza" to 2002, "Scott" to 1999)
    println(tahunLahir)

    var skorGame = mutableMapOf("Anna" to 2, "Brian" to 4, "Reza" to 10, "Scott" to 5)
    println(skorGame)

    //skorGame = mutableMapOf() // membuat map kosong
    var pairs =  HashMap<String, Int>() // membuat map kosong baru dengan memangil konstruktor map
    pairs = HashMap<String , Int>(20) // membuat map kosong baru dengan kapasitas 20

    // akses value dari map
    println(skorGame["Reza"])
    println(skorGame["Scott"])

    println(skorGame.get("Reza"))
    println(skorGame.get("Anna"))

    println(skorGame.isEmpty())
    println(skorGame.size)

    val bobData = mutableMapOf("Name" to "Bob", "Proffession" to "CardPlayer", "Country" to "USA")
    println(bobData)
    // cara menambah key dan value pada mutable map
    bobData.put("State", "CA")
    bobData["City"] = "San Andreas"
    println(bobData)
    // cara update value berdasarkan key di mutablemap
    bobData.put("Name", "Bobby")
    bobData["Proffession"] = "BallBoy"
    println(bobData)

    // Menggunakan operator infix += untuk menambahkan pasangan key atau key falue baru ke mutablemap
    val pairData = "Nickname" to "Bobby D"
    bobData += pairData
    println(bobData)
    // removing pair
    bobData.remove("City")
    bobData.remove("State", "CA")
    println(bobData)

    // iterating through
    // for - in
    for ((player, score) in skorGame) {
        println("$player - $score")
    }
    for (player in skorGame.keys) {
        println("$player, ")
    }
    println()

    // Sets
    val names = setOf("Anna", "Reza", "Craig", "Hugh", "jack")
    println(names)
    val hashSet = HashSet<Int>() // membuat satu set kosong

    // sets from array
    val bilBulatArray = arrayOf(1, 2, 3, 4, 5)
    var bilBulatSet = mutableSetOf(*bilBulatArray) // spread operator
    println(bilBulatSet)

    // menggunakan contains
    println(bilBulatSet.contains(1)) //true

    // menggunakan in
    println(7 in bilBulatSet) // false

    // menambahkan element
    bilBulatSet.add(6)
    println(bilBulatSet)

    // menghapus element
    val removedOne = bilBulatSet.remove(1)
    println(removedOne) //true
    println(bilBulatSet) // [2,3,4,5,6]


}