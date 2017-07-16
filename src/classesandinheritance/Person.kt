package classesandinheritance

/**
 * Created by pranit on 16/7/17.
 */
class Person public constructor(name : String, age: Int) { // constructor keyword can be omitted. If constructor has annotation or visibility modifiers
    val customerId = name.toUpperCase() // parameter of the primary constructor can be used in property initializer

    init {
        println("Persons name $name and age $age")
    }

    constructor(name : String, age: Int, address: String) :this(name, age){
       println("Persons name $name and age $age address $address")
    }
}