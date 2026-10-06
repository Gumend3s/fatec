class Car {
    var model: String = ""
        set(value) {
            if (value != "")
                field = value
        }
        get() {
            return if (field != "")
                field
            else
                "Modelo não cadastrado"
        }

    var year: Int = 0
        set(value) {
            if (value > 0)
                field = value
        }

    var plate: String = ""
        set(value) {
            if (value != "")
                field = value
        }

    var available: Boolean = true

    fun showInfo() {
        println("Modelo: $model")
        println("Ano: $year")
        println("Placa: $plate")
        println("Disponível: ${if (available) "Sim" else "Não"}")
    }

    constructor(model: String, year: Int, plate: String) {
        this.model = model
        this.year = year
        this.plate = plate
    }
}