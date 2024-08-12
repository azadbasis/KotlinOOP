package practices

class Empty
class Student(var name: String, var roll: Int, var section: String, var department: String) {

    constructor(name: String, roll: Int, section: String) : this(name, roll, section, "Science")

    constructor(name: String, roll: Int) : this(name, roll, "A", "Science")
    constructor() : this("no", 0, "", "")

    var institute: String? = null
    var location: String? = null
        get() = field
        set(value) {
            if (!location.isNullOrBlank())
                field = value
            else
                field = "No location"
        }
}

data class Teacher(val name: String, val subject: String, var age: Int) {
    constructor(name: String, subject: String) : this(name, subject, 0)
}

fun Int.isEven() = this % 2 == 0
fun String.makeUpperCase() = this.toUpperCase()
fun Student.isScience() = department.equals("Science")

fun main() {

    val student1 = Student("Azhar", 4, "A", "Science")
    val student2 = Student("Azhar", 4, "A", "Arts")
    println(student1.name)
    val student = Student()
    student.section = "Padma"
    // student.name = "All name"
    println(student.name)

    student1.institute = "Dhaka University"
    student.institute = "Khulna University"
    student1.location = null
    student.location = null
    println(student.institute)
    println(student.location)
    println(student1.institute)
    println(student1.location)

    val teacher1 = Teacher("Azhar", "Math")
    teacher1.age = 30
    val teacher2 = Teacher("Azharul", "English")
    val teacher3 = Teacher("Azharul", "English")
    teacher2.age = 35
    teacher3.age = 35
    println(teacher1)
    println(teacher2)

    val teacher = teacher1.copy(age = 45)
    println(teacher)

    val (name, age, subject) = teacher
    println("$name,$subject,$age")

    println(teacher3 == teacher2)
    println(teacher3 === teacher2)

    println(teacher1.age.isEven())
    println(teacher.name.makeUpperCase())
    println(student1.isScience())
    println(student2.isScience())

}