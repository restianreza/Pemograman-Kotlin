fun main() {
    val nilaiSiswa = mapOf(
        "Reza" to 99,
        "Dwi" to 90,
        "Restian" to 78,
        "Doni" to 92,
        "Eka" to 88
    )
    val nilaiTertinggi = getNilaiTertinggi(nilaiSiswa)
    println("Nilai tertinggi adalah: $nilaiTertinggi")
}
fun getNilaiTertinggi(nilaiSiswa: Map<String, Int>): Int? {
    return nilaiSiswa.values.maxOrNull()
}
