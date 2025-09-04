/* Implemente uma classe chamada Carro com as seguintes propriedades:
    a. Consumo de combustível (medidos em km / litro) e uma certa quantidade de combustível no tanque.
    b. O consumo é especificado no construtor e o nível de combustível inicial é 0.
Forneça um método obterGasolina(), que retorne o nível atual de combustível.
Forneça um método adicionarGasolina(), que adicione combustível ao tanque.
Forneça um método anda(), que simule andar com um carro por uma certa distância em km fornecida como parâmetro, reduzindo
o nível de combustível no tanque.
 */

class CarroGasolina(var consumo: Double) {
    var gasolina: Double = 0.0

    fun obterGasolina(): Double {
        return gasolina
    }

    fun adicionarGasolina(quantidade: Double) {
        gasolina += quantidade
    }

    fun anda(distancia: Double) {
        val litrosConsumidos = distancia / consumo
        gasolina -= litrosConsumidos
    }
}

fun main() {
    val meuCarro = CarroGasolina(12.0)
    meuCarro.adicionarGasolina(50.0)
    println("Gasolina atual: ${meuCarro.obterGasolina()}")
    var distancia = 120.0
    meuCarro.anda(distancia)
    println("Gasolina depois de andar ${distancia}km: ${meuCarro.obterGasolina()}")
}