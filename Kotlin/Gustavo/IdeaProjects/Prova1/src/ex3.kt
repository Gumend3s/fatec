fun main () {
    print("Digite o raio: ")
    val radius = readln().toFloat();

    var area = calcArea(radius);

    print("A área é: " + area);
}

fun calcArea(radius: Float): Float {
    return 3.14f * radius * radius;
}