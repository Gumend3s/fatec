class RentalCompany {

    var cars = mutableListOf<Car>()

    var customers = mutableListOf<Customer>()

    fun addCar(car: Car) {
        cars.add(car)
    }

    fun registerCustomer(customer: Customer) {
        customers.add(customer)
    }

    fun rentCar(plate: String, customer: Customer) {

        for (car in cars) {

            if (car.plate == plate) {

                if (car.available) {
                    car.available = false

                    println("Carro alugado com sucesso.")
                    println("Cliente: ${customer.name}")
                    println("Carro: ${car.model}")
                    println("Placa: ${car.plate}")
                } else {
                    println("Carro não está disponível.")
                }

                return
            }
        }

        println("Carro não encontrado.")
    }

    fun returnCar(plate: String, customer: Customer) {

        for (car in cars) {

            if (car.plate == plate) {

                car.available = true

                println("Carro devolvido com sucesso.")
                println("Cliente: ${customer.name}")
                println("Carro: ${car.model}")
                println("Placa: ${car.plate}")

                return
            }
        }

        println("Carro não encontrado.")
    }

    fun listCars() {
        for (car in cars) {
            car.showInfo()
            println("-------------------------")
        }
    }
}
