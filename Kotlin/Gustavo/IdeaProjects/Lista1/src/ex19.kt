fun main() {
    val numeros = FloatArray(10) {
        (1..100).random().toFloat()
    }
    println(numeros.contentToString())
    println(ordena(numeros).contentToString())
}
fun ordena(desordenado: FloatArray): FloatArray {
    if (desordenado.size <= 1){
        return desordenado
    }
    val meio = desordenado.size/2
    val esquerda = ordena(desordenado.sliceArray(0 until meio))
    val direita = ordena(desordenado.sliceArray(meio until desordenado.size))
    return junta(esquerda, direita)
}
fun junta(ladoa: FloatArray, ladob: FloatArray): FloatArray {
    val resultado = FloatArray(ladoa.size + ladob.size)
    var a = 0
    var b = 0
    var r = 0
    while (a < ladoa.size && b < ladob.size) {
        if (ladoa[a] <= ladob[b]) {
            resultado[r] = ladoa[a]
            a++
        } else {
            resultado[r] = ladob[b]
            b++
        }
        r++
    }
    while (a < ladoa.size) {
        resultado[r] = ladoa[a]
        a++
        r++
    }
    while (b < ladob.size) {
        resultado[r] = ladob[b]
        b++
        r++
    }
    return resultado
}
