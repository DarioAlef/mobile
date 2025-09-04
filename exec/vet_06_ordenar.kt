/*06. Leia um vetor de 15 elementos inteiros. Ordene o vetor em ordem crescente e exiba-o */

fun main() {
    val vetor = mutableListOf<Int>()
    for (i in 1..15) {
        vetor.add((Math.random() * 100).toInt())
    }
    println("Vetor original: ${vetor}")

    vetor.sort()
    println("Vetor ordenado: ${vetor}")
}