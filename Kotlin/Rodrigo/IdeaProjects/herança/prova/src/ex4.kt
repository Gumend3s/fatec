fun main(){
    var temperatura: Float

    println("Qual a temperatura em Fahrenheit?")
    temperatura = readln().toFloat()

    temperatura = (temperatura - 32f) / 1.8f

    println("São $temperatura graus Celcius")
}