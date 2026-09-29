class bank_account {
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
            if (value > 0)
                field = value
        }

    var balance: Double = 0.0
        set(value) {
            if (value > 0.0)
                field = value
        }

    public fun withdraw(value: Double) {
        if (value <= balance) balance -= value
        else println("Saldo insuficiente")
    }

    public fun deposit(value: Double) {
        balance += value
    }
}