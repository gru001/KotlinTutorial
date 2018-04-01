package functionsandlambas

class AllAnyCountFind {
    val canBeInClub27 = {s : Student -> s.age <= 27}

    val student = listOf(Student("Alice",24), Student("Bob", 26), Student("Jack", 28))

    fun checkAll() {
        // If you’re interested in whether all the elements satisfy this predicate, you use the all
        // function
        println(student.all(canBeInClub27))
    }

    fun exampleAny() {
        // If you need to check whether there’s at least one matching element, use any :
        println(student.any(canBeInClub27))
    }

    fun exampleNotAll() {
        val list = listOf(1,2,3,4,5)
        // !all (not- all ) can be replaced with any with a negated condition
        println(!list.all { it == 3 })

        // To make your code easier to understand, you should choose a function that doesn’t
        // require you to put a negation sign before it:
        println(list.any { it != 3 })
    }

    fun exampleCount() {
        // If you want to know how many elements satisfy this predicate, use count :
        println(student.count(canBeInClub27))
    }

    fun exampleSizeVsCount() {
        // intermediate collection is created to satisfy predicate
        println(student.filter(canBeInClub27).size)
        // vs
        println(student.count(canBeInClub27)) // track the matching element not element themselves
    }

    fun exampleFind() {
        // To find an element that satisfies the predicate, use the find function:
        println(student.find(canBeInClub27))
    }
}

fun main(array: Array<String>) {
    val example = AllAnyCountFind()

    example.checkAll()

    example.exampleAny()

    example.checkAll()

    example.exampleCount()

    example.exampleSizeVsCount()

    example.exampleFind()
}