import kotlin.math.roundToInt

fun main() {
    println(converte(80))
}
fun converte(temperatura: Int): Int {
    return ((temperatura - 32)/1.8).roundToInt()
}