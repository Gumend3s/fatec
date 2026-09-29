class Aluno(val nome: String, val idade: Int) {
    private val notas = mutableListOf<Double>()

    fun adicionarNota(nota: Double) {
        notas.add(nota)
    }

    fun calcularMedia(): Double {
        return if (notas.isEmpty()) 0.0 else notas.sum() / notas.size
    }

    fun mostrarInformacoes() {
        println("Nome: $nome | Idade: $idade | Média: ${"%.2f".format(calcularMedia())}")
    }
}

fun main() {
    val aluno1 = Aluno("Ana", 20)
    val aluno2 = Aluno("Bruno", 22)
    val aluno3 = Aluno("Carla", 19)

    aluno1.adicionarNota(8.5)
    aluno1.adicionarNota(7.0)
    aluno1.adicionarNota(9.0)

    aluno2.adicionarNota(6.0)
    aluno2.adicionarNota(5.5)
    aluno2.adicionarNota(7.5)

    aluno3.adicionarNota(10.0)
    aluno3.adicionarNota(9.5)

    aluno1.mostrarInformacoes()
    aluno2.mostrarInformacoes()
    aluno3.mostrarInformacoes()
}