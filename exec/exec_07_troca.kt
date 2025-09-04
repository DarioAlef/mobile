// 7. Faça um programa que troque os valores de duas variáveis.
fun main() {
    var a = 5
    var b = 10

    println("Antes da troca: a = $a, b = $b")

    // Troca os valores
    val temp = a
    a = b
    b = temp

    println("Depois da troca: a = $a, b = $b")
}