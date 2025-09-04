/*0.1 faça um programa que utiliza funções e classes que:
    a. Possui uma classe chamada Ponto, com os atributos x e y
    b. Possui uma classe chamada Retângulo, com os atributos largura, altura e vértice de partida (vértice é um objeto do tipo Ponto) 
    c. Possua uma função para imprimir os atributos da classe Ponto
    d. Possua uma função para encontrar o centro do Retângulo
você deve criar alguns objetos da classe Retângulo. Cada objeto da classe Retângulo deve ter um vértice de partida, por exemplo, o
vértice inferior esquerdo do retângulo, que deve ser um objeto da classe Ponto.
A função para encontrar o centro do retângulo deve retornar um objeto do tipo ponto que indique os valores x e y para o centro do
objeto. Imprimir o centro desse retângulo.
*/

class Ponto(var x: Int, var y: Int)

class Retangulo(var largura: Int, var altura: Int, var vertice: Ponto) {
    fun encontrarCentro(): Ponto {
        val centroX = vertice.x + largura / 2
        val centroY = vertice.y + altura / 2
        println("Centro do retangulo: (${centroX}, ${centroY})")
        return Ponto(centroX, centroY)
    }
}

fun imprimirAtributos(ponto: Ponto) {
    println("Ponto: (${ponto.x}, ${ponto.y})")
}

fun main() {
    val ponto1 = Ponto(2, 3)
    imprimirAtributos(ponto1)

    val retangulo1 = Retangulo(4, 5, ponto1)
    val centro = retangulo1.encontrarCentro()
    imprimirAtributos(centro)
}