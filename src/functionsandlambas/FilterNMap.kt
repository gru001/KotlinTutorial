package functionsandlambas

class FilterNMap {

    fun exampleFilter1() {
        var list = listOf(1,2,3,4,5,6)
        println(list.filter { it % 2 == 0 })
    }

    fun exampleFilter2() {
        var list = listOf(Student("Bob", 26) ,Student("Alice", 29),Student("Sam", 22))
        println(list.filter{ it.age < 25 })
    }

    fun exampleMap() {
        var list = listOf(1,2,3,4,5,6)
        println(list.map { it * it })
    }

    fun exampleMap1() {
        var list = listOf(Student("Bob", 26) ,Student("Alice", 29),Student("Sam", 22))
        println(list.map { it.name })
    }

    fun exampleMap2() {
        var list = listOf(Student("Bob", 26) ,Student("Alice", 29),Student("Sam", 22))
        println(list.map (Student::name))
    }

    fun exampleFilterNMap(){
        var list = listOf(Student("Bob", 26) ,Student("Alice", 29),Student("Sam", 22))
        println(list.filter { it.age < 30 }.map (Student::name))
    }
}

fun main(args: Array<String>) {
    val example = FilterNMap()

    example.exampleFilter1()
    example.exampleFilter2()
    example.exampleMap()
    example.exampleMap1()
    example.exampleMap2()
    example.exampleFilterNMap()
}