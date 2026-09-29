fun main() {
    var ultimo = 0
    var atual = 1
    var auxiliar = 0
    for (i in 0 until 20){
        println(atual)
        auxiliar = atual
        atual = atual + ultimo
        ultimo = auxiliar
    }
}