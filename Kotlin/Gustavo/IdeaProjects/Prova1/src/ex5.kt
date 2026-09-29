open class Person {
    var name: String = ""
        set(value) {
            if (value != "")
                field = value
        }
        get() {
            return if(field != "")
                field
            else
                "Nome não cadastrado"
        }

    var phone: String = ""
        set(value) {
            if (value != "")
                field = value
        }
        get() {
            return if(field != "")
                field
            else
                "Telefone não cadastrado"
        }

    var street: String = ""
        set(value) {
            if (value != "")
                field = value
        }
        get() {
            return if(field != "")
                field
            else
                "Rua não cadastrada"
        }

    var neighborhood: String = ""
        set(value) {
            if (value != "")
                field = value
        }
        get() {
            return if(field != "")
                field
            else
                "Bairro não cadastrado"
        }

    var city: String = ""
        set(value) {
            if (value != "")
                field = value
        }
        get() {
            return if(field != "")
                field
            else
                "Cidade não cadastrada"
        }

    var number: Int = 0
        set(value) {
            if (value > 0)
                field = value
        }

    var agency: Int = 0
        set(value) {
            if (value != 0)
                field = value
        }

    var account: Int = 0
        set(value) {
            if (value != 0)
                field = value
        }

    var salary: Float = 0f
        set(value) {
            if (value > 0)
                field = value
        }


    constructor(name: String, phone: String, street: String, neighborhood: String, city: String, number: Int) {
        this.name = name
        this.phone = phone
        this.street = street
        this.neighborhood = neighborhood
        this.city = city
        this.number = number
    }

    fun registerAccount(agency: Int, account: Int, salary: Float) {
        this.agency = agency
        this.account = account
        this.salary = salary
    }

    fun viewAccount() {
        println("Agencia: " + this.agency)
        println("Conta: " + this.account)
        println("Salário: " + this.salary)
    }
}

class PhysicalPerson: Person {
    var cpf: String = ""
        set(value) {
            if (value != "")
                field = value
        }
        get() {
            return if(field != "")
                field
            else
                "CPF não cadastrado"
        }

    constructor(name: String, phone: String, street: String, neighborhood: String, city: String, number: Int, cpf: String) : super(name, phone, street, neighborhood, city, number) {
        this.cpf = cpf
    }
}

class JuridicalPerson: Person {
    var cnpj: String = ""
        set(value) {
            if (value != "")
                field = value
        }
        get() {
            return if(field != "")
                field
            else
                "CNPJ não cadastrado"
        }

    constructor(name: String, phone: String, street: String, neighborhood: String, city: String, number: Int, cnpj: String) : super(name, phone, street, neighborhood, city, number) {
        this.cnpj = cnpj
    }
}