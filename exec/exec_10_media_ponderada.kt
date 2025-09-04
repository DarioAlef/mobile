/*10. Escreva um programa para calcular e exibir a média ponderada entre duas notas 
dadas. Essas notas serão digitadas pelo usuário. Considere que a nota 1 tem peso 2 e 
a nota 2 tem peso 3 */

fun main () {
    val nota1 = readLine()?.toDoubleOrNull() ?: 0.0
    val nota2 = readLine()?.toDoubleOrNull() ?: 0.0
    val peso1 = 2
    val peso2 = 3

    val mediaPonderada = (nota1 * peso1 + nota2 * peso2) / (peso1 + peso2)

    println("A média ponderada é: %.2f".format(mediaPonderada))
}