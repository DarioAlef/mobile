

import kotlin.Int//lambda function (anonymous)
val saudacao: (String) -> String = { nome -> "Olá, $nome!" }
println(saudacao("João"))  // Output: Olá, João!

fun main () {
    // array
    val numeros: Array<Int> = arrayOf(1, 2, 3, 4, 5)
    val novoArray = numeros + 6
    for (numero in novoArray) {
        println(numero)
    }

    // lista - imutável
    val lista = listOf(1, 2, 3, 4, 5)
    val listaVazia = listOf<Int>()

    println(lista.size) //Tamanho da lista
    println(listaVazia.isEmpty()) // lista vazia?
    println(listaVazia.isNotEmpty()) // lista não vazia?
    println(lista.contains(3)) // contém o elemento 3?
    println(lista.indexOf(3)) // índice do elemento 3
    println(lista.lastIndexOf(3)) // último índice do elemento 3
    println(lista.subList(1, 4)) // sublista do elemento 1 ao 4
    println(lista.sorted()) // lista ordenada
    println(lista.reversed()) // lista invertida
    println(lista.map { it * 2 }) // lista multiplicada por 2
    println(lista[0]) // acesso por índice
    println(lista.last()) // acesso ao último elemento
    println(lista.first()) // acesso ao primeiro elemento
    println(listaVazia.firstOrNull()) // acesso ao primeiro elemento (ou nulo)
    println(listaVazia.lastOrNull()) // acesso ao último elemento (ou nulo)
    println(listaVazia.getOrNull(0)) // acesso ao primeiro elemento (ou nulo)


    // lista - mutável
    val listaMutavel = mutableListOf(1, 2, 3, 4, 5)
    listaMutavel.add(6)
    listaMutavel.removeAt(0)
    listaMutavel.set(0, 10)
    println(listaMutavel) 

    // mapa - imutavel
    val mapaImutavel = mapOf(1 to "um", 2 to "dois", 3 to "três")
    println(mapaImutavel[1]) // acesso ao valor da chave 1

    // mapa - mutavel
    val mapaMutavel = mutableMapOf(1 to "um", 2 to "dois", 3 to "três")
    mapaMutavel[4] = "quatro"
    mapaMutavel.remove(2)
    println(mapaMutavel)
}