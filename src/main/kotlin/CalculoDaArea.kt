import kotlin.math.PI
import java.util.Scanner

fun calcularAreaDoCirculo(raio: Double): Double {
    return PI * raio * raio
}

fun main() {
    val scanner = Scanner(System.`in`)

    print("Digite o raio do círculo: ")
    val raio = scanner.nextDouble()

    val area = calcularAreaDoCirculo(raio)

    // Formate a saída para exibir apenas duas casas decimais após a vírgula
    val areaFormatada = String.format("%.2f", area)

    println("A área do círculo com raio $raio é $areaFormatada")

    scanner.close()
}
