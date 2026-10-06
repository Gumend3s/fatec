fun main() {
    println("=========== Funções Estudante =============")
    val student1 = Student()

    student1.name = "Gustavo"
    student1.age = 21
    student1.addGrade(9.0)
    student1.addGrade(8.0)
    student1.addGrade(8.5)

    student1.showData()

    val student2 = Student()

    student2.name = "João da Silva"
    student2.age = 18
    student2.addGrade(9.0)
    student2.addGrade(3.0)
    student2.addGrade(6.7)

    student2.showData()

    val student3 = Student()

    student3.name = ""
    student3.age = 20
    student3.addGrade(1.0)
    student3.addGrade(2.0)
    student3.addGrade(3.0)

    student3.showData()


    println("=========== Funções Carro =============")

    val rentalCompany = RentalCompany()

    val car1 = Car("Toyota Corolla", 2022, "ABC-1234")
    val car2 = Car("Honda Civic", 2023, "DEF-5678")
    val car3 = Car("Volkswagen Golf", 2021, "GHI-9012")

    rentalCompany.addCar(car1)
    rentalCompany.addCar(car2)
    rentalCompany.addCar(car3)

    val customer1 = Customer("João", "111.111.111-11")
    val customer2 = Customer("Maria", "222.222.222-22")

    rentalCompany.registerCustomer(customer1)
    rentalCompany.registerCustomer(customer2)

    println("=== CARROS ===")
    rentalCompany.listCars()

    println("\n=== ALUGUEL ===")
    rentalCompany.rentCar("ABC-1234", customer1)

    println("\n=== CARROS APÓS O ALUGUEL ===")
    rentalCompany.listCars()

    println("\n=== DEVOLUÇÃO ===")
    rentalCompany.returnCar("ABC-1234", customer1)

    println("\n=== CARROS APÓS A DEVOLUÇÃO ===")
    rentalCompany.listCars()

    val manager = Manager("João", 5000.0)

    val developer1 = Developer("Maria", 3000.0)

    val developer2 = Developer("Pedro", 3500.0)


    println("=========== Funções Funcionário =============")

    Company.addEmployee(manager)
    Company.addEmployee(developer1)
    Company.addEmployee(developer2)

    Company.listEmployees()

    println()
    println("Total de funcionários: ${Employee.totalEmployees()}")
}