class SpecialAccount: BankAccount() {
    var limit: Double = 0.0
        set(value) {
            if (value > 0.0)
                field = value
        }

    override fun withdraw(value: Double) {
        if (value < 0.0) {
            println("Valor inválido")
            return
        }
        if (value <= balance + limit) {
            balance -= value
        } else {
            println("Saldo insuficiente")
        }
    }

}