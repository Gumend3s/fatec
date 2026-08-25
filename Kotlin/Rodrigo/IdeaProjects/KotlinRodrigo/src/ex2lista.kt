fun main() {
    var n: Int
    var a: Int
    var b: Int
    var c: Int

    print("Digite o número de escolha (1, 2 ou 3): ")
    n = readln().toInt()
    print("Digite o primeiro número: ")
    a = readln().toInt()
    print("Digite o segundo número: ")
    b = readln().toInt()
    print("Digite o terceiro número: ")
    c = readln().toInt()

    val ordenados = listOf(a, b, c).sorted()
    val menor = ordenados[0]
    val meio = ordenados[1]
    val maior = ordenados[2]

    if (n == 1) {
        println("Ordem crescente: $ordenados")
    } else if (n == 2) {
        println("Ordem decrescente: ${ordenados.reversed()}")
    } else if (n == 3) {
        val maiorNoMeio = listOf(menor, maior, meio)
        println("Maior no meio: $maiorNoMeio")
    } else {
        println("Opção inválida")
    }
}
