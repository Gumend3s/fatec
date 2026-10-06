class SavingAccount: BankAccount {
    var incomeDay: Int = 1
        set(value) {
            if (value > 0 || value <= 31)
                field = value
        }

    fun newBalance(yealdRate: Float) {
        balance *= (1f + yealdRate/100)
    }

    constructor(customer: String, account: Int, balance: Double, incomeDay: Int) : super(customer, account, balance) {
        this.incomeDay = incomeDay
    }
}