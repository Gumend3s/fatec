fun main() {
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
}