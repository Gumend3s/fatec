fun main() {
    print("Digite seu ano de nascimento: ")
    val birthYear = readln().toInt();
    print("Digite o ano atual: ")
    val currentYear = readln().toInt();

    val difference = (currentYear - birthYear)
    println("A diferença em anos é " + difference)
    println("A diferença em meses é " + (difference * 12))
    println("A diferença em semanas é " + (difference * 52))
    println("A diferença em dias é " + (difference * 365))
}