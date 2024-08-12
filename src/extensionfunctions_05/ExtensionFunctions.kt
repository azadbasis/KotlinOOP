package extensionfunctions_05

import properties_02.City
//todo:Avoid to use util class or function
fun Int.isEven() = this % 2 == 0
fun City.isLarge() = population >= 10_00_000

fun main() {
    println(5.isEven())
    val naturals = listOf(2, 4, 5, 76, 3)
    println(naturals.filter { it.isEven() })

    val dhaka = City()
    dhaka.name = "Dhaka"
    dhaka.population = 20_00_000
    println(dhaka.isLarge())
}