package helloworld

import org.testng.Assert
import org.testng.annotations.Test

/**
 * Created by pranit on 20/7/17.
 */
class TaskTest {

    @Test fun testStart(){
        Assert.assertEquals("OK", start())
    }

}