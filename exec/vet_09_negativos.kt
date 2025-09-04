/*09. Leia um vetor de 10 posições e atribua o valor 0 para todos os elementos que possuírem valor negativo */

fun main() {
    val vetor = mutableListOf<Int>()

    for (i in 1..10) {
        vetor.add((Math.random() * 20 - 10).toInt())
    }

    println("Vetor original: ${vetor}")

    for (i in vetor.indices) {
        if (vetor[i] < 0) {
            vetor[i] = 0
        }
    }

    println("Vetor modificado: ${vetor}")
}