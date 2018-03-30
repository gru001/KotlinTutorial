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

    private val students = listOf(Student("Bob",30), Student("Alice", 52), Student("Sam",25))

    val max = students.maxBy(Student::age)

    val maxLambda = students.maxBy { it.age }

    fun temp() {
        val list = arrayListOf(1, 2, 3)
        print(list.joinToString ("#", "@"))
    }

    fun printMessageWithPrefix(list : Collection<String>, prefix : String) {
        list.forEach {
            println("$prefix $it")
        }
    }

    fun printProblemStatement(responses: Collection<String>) {
        var clientError : Int = 0
        var serverError : Int = 0

        responses.forEach {
            if(it.startsWith("4")) {
                clientError++
            }else if(it.startsWith("5")) {
                serverError++
            }
        }

        print("\n $clientError client errors, $serverError server errors")
    }

}

fun main(args: Array<String>){
    println(Foo().max)
    print(Foo().temp())

    val errors = arrayListOf("403 forbidden", "404 not found","200 OK", "500 server error")
    Foo().printMessageWithPrefix(errors, "Error:")

    Foo().printProblemStatement(errors)
    print(Student::age)
}