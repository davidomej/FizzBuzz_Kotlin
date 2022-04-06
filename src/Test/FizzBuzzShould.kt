package Test

import org.junit.Test
import kotlin.test.assertEquals


class FizzBuzzShould {
    @Test
    fun test_library(){
        val fb = FizzBuzz();
        assertEquals(1,fb.play(1));
    }

}