fun main() {
    var mediasalarios = 0.0
    var mediafilhos = 0.0
    var maiorsalario = 0.0
    data class Pessoa(
        val salario: Double,
        val filhos: Int
    )

    val pessoas = listOf(
        Pessoa(1800.00, 0),
        Pessoa(2500.00, 2),
        Pessoa(3200.00, 1),
        Pessoa(4500.00, 3),
        Pessoa(2100.00, 0),
        Pessoa(6000.00, 2),
        Pessoa(3800.00, 4),
        Pessoa(1500.00, 1),
        Pessoa(7200.00, 3),
        Pessoa(2900.00, 2)
    )

    for (p in pessoas) {
        mediasalarios += p.salario
        mediafilhos += p.filhos
        if (maiorsalario < p.salario){
            maiorsalario = p.salario
        }
    }
    mediasalarios = mediasalarios / pessoas.size
    mediafilhos = mediafilhos / pessoas.size

    println(mediasalarios)
    println(mediafilhos)
    println(maiorsalario)

}