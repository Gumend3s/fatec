fun main(){
    var preco: Float
    var combustivel: Int
    var litros: Int

    println("Digite o numero do combustivel 1-Alcool e 2-Gasolina")
    combustivel = readln().toInt()

    println("Escolha a quantidade de litros: ")
    litros = readln().toInt()

    if(combustivel == 1){
        preco = litros * 3.99f

        if(litros <= 20){
            preco = preco * 0.97f
        }
        else {
            preco = preco * 0.95f
        }

    } else{
        preco = litros * 5.99f

        if(litros <= 20) {
            preco = preco * 0.96f
        }

        else{
            preco = preco * 0.94f
            }
    }

    println("Total a pagar: $preco")
}