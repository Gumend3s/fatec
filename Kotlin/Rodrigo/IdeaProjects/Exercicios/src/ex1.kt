class Pessoas{
    var nome: String = ""
    var idade: Int = 0
    var peso: Float = 0F
    var altura: Float = 0F

    fun cadastrarNome(novoNome: String){
        nome = novoNome
    }
    fun mostrarNome(): String {
        return nome
    }
    fun cadastrarIdade(novaIdade: Int){
        idade = novaIdade
    }
    fun mostrarIdade(): Int {
        return idade
    }
    fun cadastrarPeso(novoPeso: Float){
        peso = novoPeso
    }
    fun mostrarPeso(): Float {
        return peso
    }
    fun cadastrarAltura(novaAltura: Float){
        altura = novaAltura
    }
    fun mostrarAltura(): Float {
        return altura
    }
    fun calcularIMC(): Float{
        return peso/(altura * altura)
    }
    fun obterSituacao(): String {
        val imc = calcularIMC()
        return when {
            imc < 18.5 -> "Abaixo do peso ideal"
            imc in 18.5..24.9 -> "Peso normal"
            imc in 25.0..29.9 -> "Acima do peso"
            imc in 30.0..34.9 -> "Obesidade grau I"
            imc in 35.0..39.9 -> "Obesidade grau II"
            else -> "Obesidade grau III"
        }
    }
}

fun main() {
    val pessoa1 = Pessoas()
    pessoa1.cadastrarNome("Carlos")
    pessoa1.cadastrarIdade(28)
    pessoa1.cadastrarPeso(70.0f)
    pessoa1.cadastrarAltura(1.75f)

    val pessoa2 = Pessoas()
    pessoa2.cadastrarNome("Mariana")
    pessoa2.cadastrarIdade(34)
    pessoa2.cadastrarPeso(85.5f)
    pessoa2.cadastrarAltura(1.62f)

    println("--- Dados da Pessoa 1 ---")
    println("Nome: ${pessoa1.mostrarNome()}")
    println("Idade: ${pessoa1.mostrarIdade()} anos")
    println("Peso: ${pessoa1.mostrarPeso()} kg")
    println("Altura: ${pessoa1.mostrarAltura()} m")
    println("IMC: %.2f".format(pessoa1.calcularIMC()))
    println("Situação: ${pessoa1.obterSituacao()}")

    println() // Linha em branco para separar

    // Exibindo as informações da Segunda Pessoa
    println("--- Dados da Pessoa 2 ---")
    println("Nome: ${pessoa2.mostrarNome()}")
    println("Idade: ${pessoa2.mostrarIdade()} anos")
    println("Peso: ${pessoa2.mostrarPeso()} kg")
    println("Altura: ${pessoa2.mostrarAltura()} m")
    println("IMC: %.2f".format(pessoa2.calcularIMC()))
    println("Situação: ${pessoa2.obterSituacao()}")
}