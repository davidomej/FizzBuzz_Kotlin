package Test

import Main.FizzBuzz
import org.junit.Test
import kotlin.test.assertEquals


class FizzBuzzShould {
    @Test
    fun test_library(){
        val fb = FizzBuzz();
        assertEquals(2,fb.play(2));
    }

}