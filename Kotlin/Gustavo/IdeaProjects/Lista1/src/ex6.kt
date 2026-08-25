fun main() {
    print("Digite as horas trabalhadas no mês: ")
    val hours = readln().toInt();
    print("Digite o salário/hora: ")
    val salaryHour = readln().toFloat();

    var salary = 0f
    if(hours <= 160) {
        salary = hours * salaryHour
    } else {
        val bonusHours = hours - 160
        salary = salaryHour * 160 + bonusHours * salaryHour * 1.5f
    }

    print("O salário é: " + salary)
}