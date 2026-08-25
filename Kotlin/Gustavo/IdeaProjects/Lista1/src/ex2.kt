fun main() {
    print("Digite o valor n: ")
    val n = readln().toInt();
    print("Digite o valor a: ")
    val a = readln().toFloat();
    print("Digite o valor b: ")
    val b = readln().toFloat();
    print("Digite o valor c: ")
    val c = readln().toFloat();

    var highest: Float
    var lowest: Float
    var middle: Float

    if (a >= b) {
        highest = a
        if (c > a) highest = c
    } else if (b >= c) highest = b
    else highest = c

    if (a <= b) {
        lowest = a
        if (c < a) lowest = c
    } else if (b <= c) lowest = b
    else lowest = c

    middle = a + b + c - lowest - highest

    if (n == 1) print("" + lowest + ", " + middle + ", " + highest)
    if (n == 2) print("" + highest + ", " + middle + ", " + lowest)
    if (n == 3) print("" + lowest + ", " + highest + ", " + middle)

}