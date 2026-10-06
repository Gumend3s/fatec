class Developer: Employee {

    override fun calculateBonus(): Double {
        return salary * 0.10
    }

    constructor(name: String, salary: Double) : super(name, salary)
}
