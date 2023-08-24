fun main() {
    // Cria uma lista de números de 1 a 100
    val numeros = (1..100).toList()

    // Usa a função filter para encontrar os números pares na lista
    val numerosPares = numeros.filter { it % 2 == 0 }

    // Imprime os números pares encontrados
    println("Números pares de 1 a 100:")
    println(numerosPares)
}
