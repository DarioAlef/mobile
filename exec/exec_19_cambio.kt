/*19. Escreva um programa que permita fazer a conversão de real em dólar. O usuário irá 
digitar o valor em real e o programa deverá exibir o resultado em dólar. Considere que 
a taxa de conversão é US$ 1 = R$ 5,44 */

fun main() {
    val valorEmReal = readLine()?.toDoubleOrNull() ?: 0.0
    val taxaConversao = 5.44
    val valorEmDolar = valorEmReal / taxaConversao

    println("O valor em dólar é: US$ %.2f".format(valorEmDolar))
}

// " ?. " -> Safe call operator (operador de chamada segura) chama um método apenas se o resultado do anterior não for nulo
// " ?: " -> Elvis operator (operador Elvis) retorna null se o valor a esquerda for nulo, serve para não dar erro