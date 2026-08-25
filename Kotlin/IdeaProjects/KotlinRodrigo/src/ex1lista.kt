fun main() {
    var sexo: String
    var altura: Float
    val ideal: Float

    println("Digite o seu sexo (F ou M)")
    sexo = readln()

    println("Digite sua altura")
    altura = readln().toFloat()
    if(sexo == "M" || sexo == "m"){
        ideal = (72.7f * altura) - 58f
    }else if(sexo == "F" || sexo == "f"){
        ideal = (62.1f * altura) - 44.7f
    }else {
        ideal = 0f
    }

    println("Seu peso ideal é: $ideal kg")
}