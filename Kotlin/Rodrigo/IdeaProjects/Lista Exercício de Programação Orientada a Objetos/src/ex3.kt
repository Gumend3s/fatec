class Carro(val modelo: String, val ano: Int, val placa: String) {
    var disponivel: Boolean = true

    fun exibirInfo() {
        println("Modelo: $modelo | Ano: $ano | Placa: $placa | Disponível: ${if (disponivel) "Sim" else "Não"}")
    }
}

class Cliente(val nome: String, val cpf: String) {
    fun exibirInfo() {
        println("Nome: $nome | CPF: $cpf")
    }
}

class Locadora {
    private val carros = mutableListOf<Carro>()
    private val clientes = mutableListOf<Cliente>()
    // controla quem está com cada carro (placa -> cliente)
    private val alugueis = mutableMapOf<String, Cliente>()

    fun adicionarCarro(carro: Carro) {
        carros.add(carro)
        println("Carro ${carro.modelo} (${carro.placa}) adicionado.")
    }

    fun registrarCliente(cliente: Cliente) {
        clientes.add(cliente)
        println("Cliente ${cliente.nome} registrado.")
    }

    fun alugarCarro(placa: String, cliente: Cliente) {
        val carro = carros.find { it.placa == placa }
        when {
            cliente !in clientes -> println("Cliente ${cliente.nome} não está registrado.")
            carro == null -> println("Carro com placa $placa não encontrado.")
            !carro.disponivel -> println("O carro ${carro.modelo} não está disponível.")
            else -> {
                carro.disponivel = false
                alugueis[placa] = cliente
                println("${cliente.nome} alugou o carro ${carro.modelo}.")
            }
        }
    }

    fun devolverCarro(placa: String, cliente: Cliente) {
        val carro = carros.find { it.placa == placa }
        when {
            carro == null -> println("Carro com placa $placa não encontrado.")
            alugueis[placa] != cliente -> println("O carro $placa não está alugado por ${cliente.nome}.")
            else -> {
                carro.disponivel = true
                alugueis.remove(placa)
                println("${cliente.nome} devolveu o carro ${carro.modelo}.")
            }
        }
    }

    fun listarCarros() {
        println("--- Carros da locadora ---")
        carros.forEach { it.exibirInfo() }
    }
}

fun main() {
    val locadora = Locadora()

    locadora.adicionarCarro(Carro("Fiat Uno", 2015, "ABC-1234"))
    locadora.adicionarCarro(Carro("VW Gol", 2020, "DEF-5678"))
    locadora.adicionarCarro(Carro("Chevrolet Onix", 2022, "GHI-9012"))

    val c1 = Cliente("Lucas", "111.111.111-11")
    val c2 = Cliente("Fernanda", "222.222.222-22")
    locadora.registrarCliente(c1)
    locadora.registrarCliente(c2)

    println()
    locadora.listarCarros()

    println()
    locadora.alugarCarro("ABC-1234", c1)
    locadora.alugarCarro("ABC-1234", c2)   // já alugado -> não permite
    println()
    locadora.listarCarros()

    println()
    locadora.devolverCarro("ABC-1234", c1)
    println()
    locadora.listarCarros()
}