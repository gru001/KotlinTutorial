package javatokotlin

/**
 * Created by pranit on 25/7/17.
 */
class KotlinTask1 {
    fun doSomethingWithThread() {
        Thread { println("do something") }.start()
    }

    fun doSomethingWithInterface() {
        val doable = object : Doable {
            override fun task1() {

            }

            override fun task2(str1: String, str2: String, int1: Int?) {

            }
        }
    }
}