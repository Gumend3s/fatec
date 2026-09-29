fun main () {
    print("Digite o número da conta: ")
    val account_number = readln().toInt();
    print("Digite o saldo atual: ")
    val balance = readln().toFloat();
    print("Digite o crédito: ")
    val credit = readln().toFloat();
    print("Digite o débito: ")
    val debit = readln().toFloat();

    var newBalance = balance + credit - debit;

    println("O novo saldo é: " + newBalance);
    if (newBalance > 0) print("Saldo positivo");
    else if (newBalance < 0) print("Saldo negativo");
    else print("Saldo zerado");
}