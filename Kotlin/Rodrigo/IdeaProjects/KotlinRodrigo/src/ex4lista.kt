fun main(){
    var temperatura: Float

    println("Qual a temperatura em Celsius?")
    temperatura = readln().toFloat()
    temperatura = (temperatura * 1.8f) + 32f
    println("São $temperatura graus Fahrenheit")
}