fun main () {
    print("Digite uma temperatura em celsius: ")
    val tempC = readln().toFloat();

    val tempF = tempC * 1.8 + 32

    print("Essa temperatura em Fahrenheit: " + tempF)

}