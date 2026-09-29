class Student {
    var name: String = ""
        set(value) {
            if (value != "")
                field = value
        }
        get() {
            return if(field != "")
                field
            else
                "Nome não cadastrado"
        }

    var age: Int = 0
        set(value) {
            if (value > 0)
                field = value
        }


    var grades: MutableList<Double> = mutableListOf()

    public fun addGrade(grade: Double) {
        grades.add(grade)
    }

    public fun getMedium(): Double {
        return grades.average()
    }

    public  fun showData() {
        println("===== Dados do Aluno =====")
        println("Nome: " + name)
        println("Idade: " + age)
        println("Média: " + getMedium())
    }
}