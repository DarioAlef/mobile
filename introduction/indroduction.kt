fun main() {
    // declaração de variável
    var idade: Int = 29
    val nome: String = "João"
    var estado: String
    var cidade: String? = null
    var pais = "Brasil"
    var continente = "América do Sul"
    estado = "SP"

    //tipos de dados - numéricos
    val mes: Int = 7
    val ano: Short = 2023
    val distancia: Long = 150000L  //'L' indica o tipo Long
    val altura: Float = 1.75F  //'F' indica o tipo Float
    val peso: Double = 70.5  //'Double' é o tipo padrão para números de ponto flutuante

    //tipos de dados - caracteres
    val inicial: Char = 'J'
    val apelido: String = "Jão"

    //tipos de dados - booleanos
    val estaAtivo: Boolean = true
    var endereco: String? = null  //pode ser nulo

    println("$idade, $nome, $estado, $cidade, $pais, $continente, $mes, $ano, $distancia, $altura, $peso, $inicial, $apelido, $estaAtivo, $endereco")

}

/* 
   Any: supertipo de todos os tipos não nulos. “Qualquer coisa”;

   Unit: indica que uma função não retorna um valor significativo. Similar ao void em Java);

   Nothing: indica que uma função não retorna normalmente. Lança exceção  
*/
fun olaMundo(): Unit {
    println("Olá, Mundo!")
}

fun imprimir(qualquerCoisa: Any) {
    println(qualquerCoisa)
}

fun lancarErro(): Nothing {
    throw Exception("Erro inesperado")
}


// Classe “container” para armazenar dados. 
// Gera métodos como equals(), hashCode() e toString().
data class Pessoa (val nome: String, val idade: Int)
val joao = Pessoa("João", 29)