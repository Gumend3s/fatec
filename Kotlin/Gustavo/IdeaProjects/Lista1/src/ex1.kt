fun main () {
    print("Digite sua altura: ")
    val height = readln().toFloat();
    print("Digite seu sexo(H ou M): ")
    val sex = readln();

    if(sex == "H") {
        print("Seu peso ideal é: " + ((72.7 * height) - 58.0))
    }
    if(sex == "M") {
        print("Seu peso ideal é: " + ((62.1 * height) - 44.7))
    }
};
