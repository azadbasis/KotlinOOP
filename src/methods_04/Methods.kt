package methods_04

class Robot(val name:String){
    fun greetHuman(){
        println("Hello human, my name is $name")
    }
    fun knowsItsName()=name.isNotBlank()
}

fun main() {
    val  robot=Robot("Bangla10002")
    if (robot.knowsItsName())
        robot.greetHuman()
}