// Classe base
open class ContaBancaria(
    val cliente: String,
    val numConta: Int,
    saldoInicial: Float = 0f
) {
    var saldo: Float = saldoInicial
        protected set

    // Retorna true se o saque foi realizado (o saldo não pode ficar negativo)
    open fun sacar(valor: Float): Boolean {
        if (valor <= 0f || valor > saldo) return false
        saldo -= valor
        return true
    }

    fun depositar(valor: Float): Boolean {
        if (valor <= 0f) return false
        saldo += valor
        return true
    }

    open fun exibirDados() {
        println("Cliente: $cliente | Conta: $numConta | Saldo: ${"%.2f".format(saldo)}")
    }
}

class ContaPoupanca(
    cliente: String,
    numConta: Int,
    saldoInicial: Float = 0f,
    val diaRendimento: Int
) : ContaBancaria(cliente, numConta, saldoInicial) {

    // taxa em porcentagem (ex.: 0.5f = 0,5%)
    fun calcularNovoSaldo(taxa: Float) {
        saldo += saldo * (taxa / 100f)
    }

    override fun exibirDados() {
        println("[Poupança] Cliente: $cliente | Conta: $numConta | Saldo: ${"%.2f".format(saldo)} | Dia rendimento: $diaRendimento")
    }
}

class ContaEspecial(
    cliente: String,
    numConta: Int,
    saldoInicial: Float = 0f,
    val limite: Float
) : ContaBancaria(cliente, numConta, saldoInicial) {

    // Permite saldo negativo até o valor do limite
    override fun sacar(valor: Float): Boolean {
        if (valor <= 0f || valor > saldo + limite) return false
        saldo -= valor
        return true
    }

    override fun exibirDados() {
        println("[Especial] Cliente: $cliente | Conta: $numConta | Saldo: ${"%.2f".format(saldo)} | Limite: ${"%.2f".format(limite)}")
    }
}

// ---------- "Contas" (main) ----------

val contas = mutableListOf<ContaBancaria>()

// a) Incluir dados de conta(s) de um cliente
fun incluirConta(conta: ContaBancaria) {
    contas.add(conta)
    println("Conta ${conta.numConta} incluída para ${conta.cliente}.")
}

fun contasDoCliente(cliente: String) = contas.filter { it.cliente.equals(cliente, ignoreCase = true) }

// b) Sacar valor de uma conta do cliente
fun sacar(cliente: String, numConta: Int, valor: Float) {
    val conta = contasDoCliente(cliente).find { it.numConta == numConta }
    if (conta == null) {
        println("Conta $numConta não encontrada para $cliente.")
    } else if (conta.sacar(valor)) {
        println("Saque de %.2f realizado na conta $numConta. Novo saldo: %.2f".format(valor, conta.saldo))
    } else {
        println("Saque de %.2f NÃO permitido na conta $numConta.".format(valor))
    }
}

// c) Depositar valor em uma conta do cliente
fun depositar(cliente: String, numConta: Int, valor: Float) {
    val conta = contasDoCliente(cliente).find { it.numConta == numConta }
    if (conta == null) {
        println("Conta $numConta não encontrada para $cliente.")
    } else if (conta.depositar(valor)) {
        println("Depósito de %.2f realizado na conta $numConta. Novo saldo: %.2f".format(valor, conta.saldo))
    } else {
        println("Valor de depósito inválido.")
    }
}

// d) Mostrar novo saldo das contas poupança a partir da taxa de rendimento
fun mostrarRendimentoPoupanca(cliente: String, taxa: Float) {
    val poupancas = contasDoCliente(cliente).filterIsInstance<ContaPoupanca>()
    if (poupancas.isEmpty()) {
        println("$cliente não possui conta poupança.")
        return
    }
    for (p in poupancas) {
        p.calcularNovoSaldo(taxa)
        println("Novo saldo da poupança ${p.numConta} (taxa $taxa%%): %.2f".format(p.saldo))
    }
}

// e) Mostrar dados das contas do cliente
fun mostrarDados(cliente: String) {
    val lista = contasDoCliente(cliente)
    if (lista.isEmpty()) println("Nenhuma conta encontrada para $cliente.")
    else lista.forEach { it.exibirDados() }
}

fun main() {
    println("--- a) Incluir contas ---")
    incluirConta(ContaBancaria("João", 1, 500f))
    incluirConta(ContaPoupanca("João", 2, 1000f, diaRendimento = 10))
    incluirConta(ContaEspecial("Maria", 3, 200f, limite = 300f))

    println("\n--- b) Sacar ---")
    sacar("João", 1, 200f)      // ok
    sacar("João", 1, 1000f)     // negado (saldo insuficiente)
    sacar("Maria", 3, 400f)     // ok (usa limite)
    sacar("Maria", 3, 200f)     // negado (estoura o limite)

    println("\n--- c) Depositar ---")
    depositar("João", 1, 150f)
    depositar("Maria", 3, 500f)

    println("\n--- d) Rendimento da poupança ---")
    mostrarRendimentoPoupanca("João", 0.5f)
    mostrarRendimentoPoupanca("Maria", 0.5f)

    println("\n--- e) Dados das contas ---")
    mostrarDados("João")
    mostrarDados("Maria")
}