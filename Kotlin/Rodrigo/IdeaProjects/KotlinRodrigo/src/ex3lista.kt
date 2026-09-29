fun main(){
    var preco: Float
    var combustivel: Int
    var litros: Int

    println("Digite o numero do combustivel que deseja, 1-Gasolina 2-Alcool")
    combustivel = readln().toInt()
    println("Digite quantos litros deseja: ")
    litros = readln().toInt()

    if(combustivel == 1){
        preco = litros * 5.39f
        if(litros <= 20)
            preco = preco * 0.96f
        else
            preco = preco * 0.94f
    } else{
        preco = litros * 3.39f
        if(litros <= 20)
            preco = preco * 0.97f
        else
            preco = preco * 0.95f
    }

    println("Total a pagar: $preco")
}