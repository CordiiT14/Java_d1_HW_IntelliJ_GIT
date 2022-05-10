import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {

    Calculator calculator;

    @Before
    public void before(){
        calculator = new Calculator();
    }

    @Test
    public void canAdd(){
        assertEquals(4, calculator.add(2, 2));
    }

    @Test
    public void canSubtract(){
        assertEquals(5, calculator.subtract(10, 5));
    }

    @Test
    public void canMultiply(){
        assertEquals(12, calculator.multiply(3, 4));
    }

    @Test
    public void canDivide(){
        assertEquals(7, calculator.divide(14, 2), 0.0);
    }

    @Test
    public void canDivideDecimals(){
        assertEquals(4, calculator.divide(10, 2.5), 0.0);
    }
    @Test
    public void divideCanHandleDecimalResult(){
        assertEquals(2.5, calculator.divide(5, 2), 0.00);
    }
}
