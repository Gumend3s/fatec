open class BankAccount {
    var customer: String = ""
        set(value) {
            if (value != "")
                field = value
        }
        get() {
            return if(field != "")
                field
            else
                "Cliente não cadastrado"
        }

    var account: Int = 0
        set(value) {
            if (value >= 0)
                field = value
        }

    var balance: Double = 0.0
        set(value) {
            if (value > 0.0)
                field = value
        }

    open public fun withdraw(value: Double) {
        if (value < 0.0) {
            println("Valor inválido")
            return
        }
        if (value <= balance) balance -= value
        else println("Saldo insuficiente")
    }

    public fun deposit(value: Double) {
        if (value < 0.0) {
            println("Valor inválido")
            return
        }
        balance += value
    }

    constructor(customer: String, account: Int, balance: Double) {
        this.customer = customer
        this.account = account
        this.balance = balance
    }
}