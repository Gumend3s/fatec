class Manager: Employee {

    override fun calculateBonus(): Double {
        return salary * 0.20
    }

    constructor(name: String, salary: Double) : super(name, salary)
}
