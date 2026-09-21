abstract class Funcionario(val nome: String, val salario: Double) {

    init {
        total++
    }

    abstract fun calcularBonus(): Double

    // Imprime nome e salário (sem quebra de linha, para o bônus ser adicionado na listagem)
    fun exibirDados() {
        print("Nome: $nome | Salário: $salario")
    }

    companion object {
        private var total = 0

        fun totalFuncionarios(): Int = total
    }
}

class Gerente(nome: String, salario: Double) : Funcionario(nome, salario) {
    override fun calcularBonus(): Double = salario * 0.20
}

class Desenvolvedor(nome: String, salario: Double) : Funcionario(nome, salario) {
    override fun calcularBonus(): Double = salario * 0.10
}

object Empresa {
    private val funcionarios = mutableListOf<Funcionario>()

    fun adicionarFuncionario(func: Funcionario) {
        funcionarios.add(func)
    }

    fun listarFuncionarios() {
        for (f in funcionarios) {
            f.exibirDados()
            println(" | Bônus: ${f.calcularBonus()}")
        }
    }
}

fun main() {
    val joao = Gerente("João", 5000.0)
    val maria = Desenvolvedor("Maria", 3000.0)
    val pedro = Desenvolvedor("Pedro", 3500.0)

    Empresa.adicionarFuncionario(joao)
    Empresa.adicionarFuncionario(maria)
    Empresa.adicionarFuncionario(pedro)

    Empresa.listarFuncionarios()
    println("Total de funcionários: ${Funcionario.totalFuncionarios()}")
}