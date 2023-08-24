fun main() {
    // Declara uma variável que pode ser nula
    val nome: String? = null

    // Usando o operador de chamada segura (?.) para acessar uma função
    val tamanhoNome = nome?.length

    // Imprimindo o tamanho do nome (ou uma mensagem se for nulo)
    if (tamanhoNome != null) {
        println("O tamanho do nome é $tamanhoNome")
    } else {
        println("O nome é nulo.")
    }
}
