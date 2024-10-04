fun main() {
    // array
    val angkaGenap = arrayOf(2, 4, 6, 8) //Array<Int>
    val limaAngkaLima = Array(5, {5}) // 5, 5, 5, 5, 5
    val hurufFokal = arrayOf("a", "i", "u", "e", "o") // Array<String>

    val angkaGanil = intArrayOf(1, 3, 5, 7) // array tipe primitif
    val angkaDesimal = floatArrayOf(1.2f, 1.3f, )

    //intArrayOf(), fLoatinfarrayOf(), doubleArrayOf(), BooleanArrayOf()
    //IntArray(), FloatArray(), DoubleArray(), BooleanArray()
    val zeros = DoubleArray(4) // 0.0, 0.0, 0.0, 0.0,
    val angkaGanjil2 = arrayOf(1, 3, 5, 7).toIntArray()

    for (angka in angkaGenap) {
        println(angka)
    }

    angkaGanil.forEach { angka -> println(angka) }

    //List
    val innerPlanets = listOf("merkurius", "venus", "Bumi", "Mars") //list<String>
    val innerPlanetsArrayList = arrayListOf("Mercury", "Venus", "Earth", "Mars")//ArrayList<String>

    //val x: List<String> = listOf(
    val x = listOf<String>()

    val outerPlanets = mutableListOf("Jupiter", "Saturn", "Uranus", "Neptune")
    val outerPlanets1 = mutableListOf<String>()
    if (outerPlanets.size < 2) {
        println("Outer Planet Kurang Dari 2")
    } else {
        println("Outer Planet Lebih Dari 2")
    }

    println(outerPlanets.first())
    println(outerPlanets.last())

    val containsPlanet = outerPlanets.let {
        println("${outerPlanets.contains("Uranus")}")
    }

    println("Nama Planet 1 : ${outerPlanets.get(0)}") // first
    println("Nama Planet 2 : ${outerPlanets.get(1)}")
    println("Nama Planet 3 : ${outerPlanets.get(2)}")
    println("Nama Planet 4 : ${outerPlanets.get(3)}") //Last

    println()
    println("Nama Planet 1 : ${outerPlanets[0]}") // first
    println("Nama Planet 2 : ${outerPlanets[1]}")
    println("Nama Planet 3 : ${outerPlanets[2]}")
    println("Nama Planet 4 : ${outerPlanets[3]}") // Last

    //Membatasi Range dengan menggunakan slice
    val filterPlanet = innerPlanets.slice(1 .. 2)
    println(filterPlanet.joinToString (" | "))

    fun isEliminated(planet: String): Boolean {
        return planet !in outerPlanets
    }
    println(isEliminated("pluto")) //True
    println(isEliminated("Uranus")) // false

    println(outerPlanets.slice(1 .. 3).contains("Saturn")) // true

    // mwnambahkan element dengan menggunakan add()
    outerPlanets.add("Pluto")
    outerPlanets += "Pluto 2"
    println(outerPlanets.joinToString (" || "))
//-----------------------------------------------------------
    outerPlanets.remove("Pluto")
    println(outerPlanets.joinToString (" ||| "))

    outerPlanets[4] = "New Pluto"
    println(outerPlanets.joinToString (" ||| "))

    outerPlanets.sort()
    println(outerPlanets.joinToString (" ||| "))

    outerPlanets.removeAt(1)
    println(outerPlanets.joinToString (" ||| "))
}