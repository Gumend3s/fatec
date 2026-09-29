open class Funcionario{
    var matricula: Int = 0
        set(value) {
            if(value > 0){
                field = value
            }
        }
    var nome: String = ""
        set(value){
            if(value != "")
                field = value
        }
    var salario: Double = 0.0
        set(value){
            if(value > 0)
                field = value
        }
    constructor(matricula: Int, nome: String,
        salario: Double){
        this.matricula = matricula
        this.nome = nome
        this.salario = salario
    }
    fun aumentoSalario(porcentagem: Double){
        if(porcentagem > 0){
            var valor = salario * porcentagem/100
            salario += valor
        }
    }
}