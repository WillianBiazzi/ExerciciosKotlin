fun <T, R> transformarLista(lista: List<T>, transformacao: (T) -> R): List<R> {
    val resultado = mutableListOf<R>()
    for (item in lista) {
        resultado.add(transformacao(item))
    }
    return resultado
}

fun main() {
    val nomes = listOf("Willian", "Eduarda", "Lucas", "João", "Amanda", "Alana")

    // Define uma função de transformação que converte uma string em maiúsculas
    val transformarParaMaiusculas: (String) -> String = { nome -> nome.toUpperCase() }

    // Aplica a função de transformação para obter uma lista de nomes em maiúsculas
    val nomesMaiusculos = transformarLista(nomes, transformarParaMaiusculas)

    println("Lista original: $nomes")
    println("Nomes em maiúsculas: $nomesMaiusculos")
}
