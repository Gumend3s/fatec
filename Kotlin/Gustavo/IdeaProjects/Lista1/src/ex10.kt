fun main() {
    print("Digite a altura: ")
    val height = readln().toFloat();
    print("Digite a largura: ")
    val width = readln().toFloat();
    print("Digite o comprimento: ")
    val length = readln().toFloat();

    val volume = height * width * length

    print("O volume é: " + volume)

}