class Administrativo: Funcionario {
    var departamento: String = ""
        set(value) {
            if (value != "")
                field = value
        }
        get() {
            return  if(field != "")
                field
            else
                "Departamento não cadastrado"
        }

    constructor(matricula: Int, nome: String, salario: Double, departamento: String): super(matricula, nome, salario) {
        this.departamento = departamento
    }
}