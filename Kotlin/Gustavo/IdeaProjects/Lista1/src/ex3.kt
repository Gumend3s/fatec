fun main () {
    print("Digite o tipo de combustível(G ou A: ")
    val fuel_type = readln();
    print("Digite quantos litros: ")
    val fuel_amount = readln().toFloat();

    var cost = 0f;
    if(fuel_type == "A") {
        if (fuel_amount < 20) cost = ((3.39 * 0.97) * fuel_amount).toFloat()
        else ((3.39 * 0.95) * fuel_amount).toFloat()
    }
    if(fuel_type == "G") {
        if (fuel_amount < 20) cost = ((5.39 * 0.96) * fuel_amount).toFloat()
        else ((5.39 * 0.94) * fuel_amount).toFloat()
    }

    print("O custo total é: " + cost)

}