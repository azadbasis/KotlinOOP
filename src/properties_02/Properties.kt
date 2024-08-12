package properties_02

class City{
    var name:String=""
        get() = field
        set(value) {
            if (value.isNotBlank()){
                field=value
            }
        }
    var population:Int=0


}

fun main() {
    val dhaka=City()
    dhaka.name="Dhaka"
    dhaka.population=20_00_000
    dhaka.name="Mymensingh"
    dhaka.name=""
    println("The city name is ${dhaka.name} and it's population is ${dhaka.population}" )
}