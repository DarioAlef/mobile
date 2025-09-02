class Carro {
    // construtor primário da classe
    var marca: String? = null
    var modelo: String? = null
    var ano: Int? = null

    fun dirigir() {
        println("Dirigindo o $modelo de $ano")
    }
}


class ContaBancaria(public var nomeCliente: String, private var saldo: Double) {
    fun depositar(valor: Double) { saldo += valor }

    fun obterSaldo() = saldo
}


fun main () {
    val meuCarro = Carro()
    meuCarro.ano = 2025
    println(meuCarro)
    meuCarro.marca = "Toyota"
    meuCarro.modelo = "Corolla"
    println(meuCarro)
}