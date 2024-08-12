package dataclasses_06

//todo: hashcode(),equals(),toString(),copy,destructuring
data class Address(val name: String, val post: String, val city: String, val age: Int)

fun main() {
    val address1 = Address("Kharia para", "Kharia para", "Mymensingh", 45)
    val address2 = Address("Kharia para", "Kharia para", "Mymensingh", 45)

    // toString()
    println(address1)

    //Referential equality
    println(address1 === address2)

    //structural equality, equal
    println(address1 == address2)

    //copy
    val address = address1.copy(age = 50)
    println(address)

    //destructuring operator
    address.component1()
    val (name,city,post,age)=address
    println("$name, $post, $city, $age")

    println( address.hashCode())
    println( address1.hashCode())
    println( address2.hashCode())
}
