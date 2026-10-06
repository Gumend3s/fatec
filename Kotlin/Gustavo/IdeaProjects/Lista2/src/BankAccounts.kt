fun main() {

    val accounts = mutableListOf<BankAccount>()

    val account1 = BankAccount("João", 1001, 1000.0)
    val account2 = SavingAccount("João", 1002, 2000.0, 10)
    val account3 = SpecialAccount("João", 1003, 500.0, 1000.0)

    accounts.add(account1)
    accounts.add(account2)
    accounts.add(account3)

    val withdrawAccount = 1001
    val withdrawValue = 200.0

    for (account in accounts) {
        if (account.account == withdrawAccount) {
            account.withdraw(withdrawValue)
            println("Saque de R$ $withdrawValue realizado.")
        }
    }

    val depositAccount = 1002
    val depositValue = 500.0

    for (account in accounts) {
        if (account.account == depositAccount) {
            account.deposit(depositValue)
            println("Depósito de R$ $depositValue realizado.")
        }
    }

    val yieldRate = 5.0f

    for (account in accounts) {
        if (account is SavingAccount) {
            account.newBalance(yieldRate)

            println("Novo saldo da conta poupança: R$ ${account.balance}")
        }
    }

    println("\nDados das contas:")

    for (account in accounts) {

        println("Cliente: ${account.customer}")
        println("Número da conta: ${account.account}")
        println("Saldo: R$ ${account.balance}")

        if (account is SavingAccount) {
            println("Tipo: Conta Poupança")
            println("Dia do rendimento: ${account.incomeDay}")
        }

        if (account is SpecialAccount) {
            println("Tipo: Conta Especial")
            println("Limite: R$ ${account.limit}")
        }

        if (account !is SavingAccount && account !is SpecialAccount) {
            println("Tipo: Conta Bancária")
        }

        println("-------------------------")
    }
}
