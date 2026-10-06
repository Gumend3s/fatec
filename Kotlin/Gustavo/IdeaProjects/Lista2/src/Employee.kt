abstract class Employee {

    var name: String = ""
        set(value) {
            if (value != "")
                field = value
        }
        get() {
            return if (field != "")
                field
            else
                "Funcionário não cadastrado"
        }

    var salary: Double = 0.0
        set(value) {
            if (value > 0.0)
                field = value
        }

    abstract fun calculateBonus(): Double

    fun showInfo() {
        println("Nome: $name | Salário: $salary")
    }

    init {
        total++
    }

    companion object {

        private var total: Int = 0

        fun totalEmployees(): Int {
            return total
        }
    }

    constructor(name: String, salary: Double) {
        this.name = name
        this.salary = salary
    }
}
