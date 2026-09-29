fun main() {
    var notas: FloatArray
    notas = floatArrayOf(10f, 5f, 6f, 7f, 5f, 10f, 5f, 7f)
    println(calculamedia(notas))
}

fun calculamedia(notas: FloatArray): Float{
    var total: Float = 0.0f
    for (i in notas.indices){
        total += notas[i]
    }
    return total/notas.size
}