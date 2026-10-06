class Customer {
    var name: String = ""
        set(value) {
            if (value != "")
                field = value
        }
        get() {
            return if (field != "")
                field
            else
                "Cliente não cadastrado"
        }

    var cpf: String = ""
        set(value) {
            if (value != "")
                field = value
        }

    fun showInfo() {
        println("Nome: $name")
        println("CPF: $cpf")
    }

    constructor(name: String, cpf: String) {
        this.name = name
        this.cpf = cpf
    }
}