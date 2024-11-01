class Lingkaran(val jariJari: Double) {

    fun hitungLuas(): Double {
        return Math.PI * jariJari * jariJari
    }
}

fun main() {
    val lingkaran = Lingkaran(5.0)

    val luas = lingkaran.hitungLuas()
    println("Luas lingkaran dengan jari-jari ${lingkaran.jariJari} adalah: $luas")
}
