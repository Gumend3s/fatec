fun main(){
    var hTotal: Float
    var hExtra: Float
    var salarioHora: Float
    var salariomen: Float
    var bonus: Float
    var salarioTotal: Float


    println("Quantas horas trabalhou no total(mês considerado 4 semanas): ")
    hTotal = readln().toFloat()
    hExtra = hTotal - 160f
    println("Qual seu salario mensal?")
    salariomen = readln().toFloat()
    salarioHora = salariomen / 160f
    bonus = salarioHora * 1.5f * hExtra
    salarioTotal = bonus + salariomen
    println("Total Horas: $hTotal " +
            "|| Salario Hora: $salarioHora " +
            "|| Salario Mensal: $salariomen " +
            "|| Horas extra: $hExtra " +
            "|| Bonus: $bonus " +
            "|| Salario Total: $salarioTotal")
}