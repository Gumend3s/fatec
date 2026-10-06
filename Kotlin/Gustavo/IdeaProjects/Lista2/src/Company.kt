object Company {

    var employees = mutableListOf<Employee>()

    fun addEmployee(employee: Employee) {
        employees.add(employee)
    }

    fun listEmployees() {

        for (employee in employees) {

            employee.showInfo()

            println("Bônus: ${employee.calculateBonus()}")
        }
    }
}
