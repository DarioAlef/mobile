fun main () {
    val idade: Int = 18

    // estrutura de decisão - if else
    if (idade >= 18) {
        println("Maior de idade")
    } else {
        println("Menor de idade")
    }

    // estrutura de decisão - when
    when (idade) {
        in 0..17 -> println("Menor de idade")
        18 -> println("Maior de idade")
        else -> println("Idade inválida")
    }
}