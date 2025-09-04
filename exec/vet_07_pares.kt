/*07. leia um vetor de 10 posições. Conte e escreva quantos valores pares ele possui */

fun main() {
    val vetor = IntArray(10)
    var contadorPares = 0

    for (i in 1..10) {
        vetor[i - 1] = i
        if (vetor[i - 1] % 2 == 0) {
            contadorPares++
        }
    }

    println("O vetor possui $contadorPares valores pares.")
}