fun main(){
    var numCliente : Int
    var saldo : Float
    var debito : Float
    var credito : Float
    var saldoAtual : Float

    println("Digite o numero do cliente: ")
    numCliente = readln().toInt()

    println("Digite o saldo do cliente: ")
    saldo = readln().toFloat()

    println("Digite o debito do cliente: ")
    debito = readln().toFloat()

    println("Digite o credito do cliente: ")
    credito = readln().toFloat()

    saldoAtual = saldo - debito + credito
    println("Saldo atual: $saldoAtual")

    if(saldoAtual > 0){
        println("Saldo Positivo")
    }else{
        println("Saldo Negativo")
    }
}