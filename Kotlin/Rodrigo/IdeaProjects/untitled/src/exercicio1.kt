fun main(){
    var num1: Int
    var num2: Int
    var subtracao: Int
    var soma: Int
    var multiplica: Int
    var divisao: Float
    var convercaonum1: Float
    var convercaonum2: Float
    var p1: Float
    var p2: Float
    var ai1: Float
    var ai2: Float
    var media: Float

    println("digite o primeiro numero: ")
    num1 = readln().toInt()
    println("digite o segundo numero: ")
    num2 = readln().toInt()

    subtracao = num1 - num2
    println("O resultado da subtração é: " +subtracao)

    soma = num1 + num2
    println("O resultado da soma é: " +soma)

    multiplica = num1 * num2
    println("O resultado da multiplicação é: " +multiplica)

    divisao = (num1 / num2).toFloat()
    println("O resultado da divisão é: " +divisao)

    convercaonum1 = (num1 * 5.12).toFloat()
    convercaonum2 = (num2 * 5.12).toFloat()
    println("A converção de $num1 para dólar é : $convercaonum1" +
            "A converção de $num2 para dólar é : $convercaonum2")

    do {
        println("digite a nota da P1(0 a 9): ")
        p1 = readln().toFloat()
    } while(p1 < 0 || p1 > 9)
    do {
        println("digite a nota da P2(0 a 9): ")
        p2 = readln().toFloat()
    } while(p2 < 0 || p2 > 9)
    do {
        println("digite a nota da AI1(0 a 1): ")
        ai1 = readln().toFloat()
    } while(ai1 < 0 || ai1 > 1)
    do {
        println("digite a nota da AI2(0 a 1): ")
        ai2 = readln().toFloat()
    } while(ai1 < 0 || ai1 > 1)

    media = (p1 + p2 + ai1 + ai2) / 2
    println("Sua média é: $media")

    if(media >= 6)
        println("Aluno Aprovado")
    else if(media >= 4 && media <6)
        println("Aluno em exame")
    else
        println("Aluno Reprovado")
}