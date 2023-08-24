import java.util.Scanner
fun verificarParOuImpar(numero: Int) {
    if (numero % 2 == 0) {
        println("$numero é um número par.")
    } else {
        println("$numero é um número ímpar.")
    }
}
fun main() {
    val scanner = Scanner(System.`in`)

    // Inicializa uma variável para controlar o loop
    var continuar = true

    while (continuar) {
        print("Digite um número: ")
        val numero = scanner.nextInt()
        verificarParOuImpar(numero)

        // Pergunta ao usuário se ele quer verificar outro número
        print("Deseja verificar outro número? (S/N): ")
        val resposta = scanner.next()

        // Verifica se a resposta é 'N' para sair do loop
        if (resposta.equals("N", ignoreCase = true)) {
            continuar = false
        }
    }

    // Fecha o scanner após o loop
    scanner.close()
}





