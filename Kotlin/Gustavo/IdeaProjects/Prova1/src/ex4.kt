fun main () {
    print("Digite a temperatura em Fahrenheit: ")
    val tempF = readln().toFloat();

    var tempC = celsius(tempF);

    print("A temperatura em Celsius é: " + tempC);
}

fun celsius(tempF: Float): Float {
    return (tempF - 32) / 1.8f
}