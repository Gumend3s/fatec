open class Pessoa(
    var nome: String = "",
    var rua: String = "",
    var telefone: String = "",
    var numero: Int = 0,
    var bairro: String = "",
    var cidade: String = ""
) {
    var agencia: String = ""
    var conta: Int = 0
    var salario: Float = 0.0f
}

class PessoaFisica: Pessoa() {
    var cpf: String = ""
}

class PessoaJuridica: Pessoa() {
    var cnpj: String = ""
}