import org.junit.Test;

import static org.junit.Assert.*;

public class FibonacciTest {

    @Test
    public void it_should_return_1_when_given_1_or_2() {
        assertEquals(FiberCalculator.calculate(1), 1);
        assertEquals(FiberCalculator.calculate(2), 1);
    }

    @Test
    public void it_should_return_result_when_given_3_to_5() {
        assertEquals(FiberCalculator.calculate(3), 2);
        assertEquals(FiberCalculator.calculate(4), 3);
        assertEquals(FiberCalculator.calculate(5), 5);
    }

}