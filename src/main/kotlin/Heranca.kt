open class Pessoa1(val nome: String, val idade: Int, val endereco: String) {
    fun imprimirInformacoes() {
        println("Nome: $nome")
        println("Idade: $idade anos")
        println("Endereço: $endereco")
    }
}

class Empregado(nome: String, idade: Int, endereco: String, val cargo: String, val salario: Double) : Pessoa1(nome, idade, endereco) {
    fun imprimirDetalhesEmpregado() {
        imprimirInformacoes() // Chamamos o método da classe base para imprimir informações pessoais
        println("Cargo: $cargo")
        println("Salário: R$$salario")
    }
}

fun main() {
    val empregado = Empregado("Maria", 25, "Rua Secundária, 456", "Desenvolvedor", 5000.0)

    empregado.imprimirDetalhesEmpregado()
}
