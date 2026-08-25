fun main() {
    print("Digite o número da conta: ")
    val account_number = readln().toInt();
    print("Digite o saldo: ")
    val balance = readln().toFloat();
    print("Digite o crédito: ")
    val credit = readln().toFloat();
    print("Digite o débito: ")
    val debit = readln().toFloat();

    val newBalance = balance + credit - debit
    if (newBalance >= 0) {
        print("Saldo positivo de: " + newBalance)
    } else {
        print("Saldo negativo de: " + newBalance)
    }

}