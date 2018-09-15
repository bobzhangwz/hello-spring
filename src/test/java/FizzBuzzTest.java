import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FizzBuzzTest {

    @Test
    public void testPrint() {
        assertEquals(FizzBuzz.print(3), "Fizz");
        assertEquals(FizzBuzz.print(5), "Buzz");
        assertEquals(FizzBuzz.print(15), "FizzBuzz");
        assertEquals(FizzBuzz.print(16), "");
    }

    @Test
    public void it_should_return_Fizz_when_given_by_3_or_3products() {
        assertEquals(FizzBuzz.print(3), "Fizz");
        assertEquals(FizzBuzz.print(6), "Fizz");
        assertEquals(FizzBuzz.print(9), "Fizz");
    }

}