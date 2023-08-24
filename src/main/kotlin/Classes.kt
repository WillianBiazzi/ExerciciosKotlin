class Pessoa(val nome: String, val idade: Int, val endereco: String) {

    fun imprimirInformacoes() {
        println("Nome: $nome")
        println("Idade: $idade anos")
        println("Endereço: $endereco")
    }
}

fun main() {
    val pessoa = Pessoa("Willian Biazzi De Oliveira", 19, "Carazinho, Rio Grande Do Sul, Brasil")

    pessoa.imprimirInformacoes()
}
