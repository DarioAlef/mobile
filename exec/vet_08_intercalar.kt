/*08. Leia dois vetores de 5 elementos numéricos cada um e intercale-os em um terceiro vetor. */

fun main() {
    val vetor1 = IntArray(5)
    val vetor2 = IntArray(5)
    val vetorIntercalado = mutableListOf<Int>()

    for (i in 0..4) {
        vetor1[i] = i
        vetor2[i] = i * 2 + 1
    }

    for (i in 0..4) {
        vetorIntercalado.add(vetor1[i])
        vetorIntercalado.add(vetor2[i])
    }

    println("Vetor intercalado: ${vetorIntercalado}")
}