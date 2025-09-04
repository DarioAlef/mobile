/*01. Escreva um programa que leia um vetor com 7 posições de números inteiros e verifique se um determinado valor, digitado
pelo usuário está presente no vetor. Se tiver, apresente a posição desse elemento no vetor. Caso o elemento não esteja no vetor,
apresente uma mensagem informando tal situação */

fun main () {
    val vetor: Array<Int> = arrayOf(10, 20, 30, 40, 50, 60, 70)
    val valorProcurado = readLine()?.toIntOrNull()

    if (valorProcurado != null) {
        val posicao = vetor.indexOf(valorProcurado)
        if (posicao != -1) {
            println("O valor $valorProcurado está na posição $posicao.")
        } else {
            println("O valor $valorProcurado não está presente no vetor.")
        }
    } else {
        println("Valor inválido.")
    }
}