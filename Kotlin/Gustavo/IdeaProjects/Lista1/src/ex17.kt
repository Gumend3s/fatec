fun main() {
    println(calculaIMC(65.0, 1.80))
}
fun calculaIMC(peso: Double, altura: Double): Double {
    return peso/(altura *altura)
}