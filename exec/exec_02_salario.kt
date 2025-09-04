// 2. Faça um programa que receba o salário- base de um funcionário, calcule e mostre o 
// salário a receber, sabendo- se que esse funcionário tem gratificação de 5% sobre o 
// salário- base e paga imposto de 7% também sobre o salário -base.

fun salarioLiquido(salarioBase: Double): Double {
    val gratificacao = salarioBase * 0.05
    val imposto = salarioBase * 0.07
    return salarioBase + gratificacao - imposto
}

fun main () {
    println("Salario a receber: R$ %.2f".format(salarioLiquido(2000.0)))
}
