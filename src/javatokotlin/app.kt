package javatokotlin

import java.util.*

/**
 * Created by pranit on 22/7/17.
 */
fun main(ar: Array<String>){
    val javaCode = KotlinCode()

    print("JavaCode ${javaCode.toJSON(Arrays.asList(1, 2,3))}")
}