package functionsandlambas

/**
 * Created by pranit on 16/7/17.
 */
class Foo {

    var a: String? = "may be null"

    fun setNull(){
        a = null
    }

    fun double(x: Int): Int = 2 * x

    fun Int.double(x: Int): Int = 2 * x

    fun Int.sh1(x: Int) : Int = x * 2 // extension function

    fun foo()= print("${1.sh1(3)}")

    fun doSomething(name: String = "default_name") = print("name: $name") // default parameter

    fun square(x: Int) : Int = x * x

    fun cube(num1: Int, square: (x : Int) -> Int): Int = square(num1) * num1
}