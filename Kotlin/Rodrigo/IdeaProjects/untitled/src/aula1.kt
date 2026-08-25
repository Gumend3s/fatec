fun main(){
    var nota1: Float
    var nota2: Float
    var media: Float
    print("Entre com a nota 1: ")
    nota1 = readln().toFloat()
    print("Entre com a nota 2: ")
    nota2 = readln().toFloat()
    media = (nota1 + nota2) / 2
    println("Sua média foi " + media)
    if(media >= 6)
        println("Aprovado")
    else if(media >= 4 && media < 6)
        println("Em exame")
    else
        println("Reprovado")
}