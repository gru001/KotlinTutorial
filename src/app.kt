import classesandinheritance.Person
import functionsandlambas.Foo

/**
 * Created by pranit on 16/7/17.
 */
fun main(args: Array<String>){
    println("Hello World!")

    var person = Person("pranit", 28)
    var d = Foo().double(10)
    println(d)

    Foo().foo()

    println(Foo().cube(2, {Foo().square(2)}))

    val cc = {x: Int, y :Int -> x + y}

    println(cc(5 , 4))
}
