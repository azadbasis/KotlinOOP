package constructor_03

class Country(val name: String, val capital: String) {

    constructor(population: Int) : this("Myanmar", "Yangon")
    constructor(name: String) : this(name, "Islamabad")


    fun print() = "$name and $capital"
    override fun toString(): String {

        return super.toString()

    }
}


fun main() {
    val bangladesh = Country("Bangladesh", "Dhaka")
    println("My country name is ${bangladesh.name} and capital is ${bangladesh.capital}")
    val myanmar = Country(20_00_00_000)
    println("The country name is ${ myanmar.name } ")
    val pakistan=Country("Pakistan")

    println("My country was ${pakistan.name}")
}