package Test

import Main.FizzBuzz
import org.junit.Test
import kotlin.test.assertEquals


class FizzBuzzShould {
    @Test
    fun test_library(){
        val fb = FizzBuzz();
        assertEquals<String>("2",fb.play(2));
        assertEquals<String>("Fizz", fb.play(3));
        assertEquals<String>("Buzz", fb.play(5));
        assertEquals<String>("FizzBuzz", fb.play(15));
    }

}