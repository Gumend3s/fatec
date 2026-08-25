fun main() {
    print("Digite a nota 1: ")
    val n1 = readln().toFloat();
    print("Digite a nota 2: ")
    val n2 = readln().toFloat();
    print("Digite a nota 3: ")
    val n3 = readln().toFloat();

    val nf = (n1 * 2 + n2 * 3 + n3 * 5)/10

    print("A nota final é: " + nf)
}