import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    @Test public void canAdd() {
        assertEquals(6.0, Calculator.add(4.0, 2.0), 0.01);
    }
    @Test public void canSubtract() {
        assertEquals(2.0, Calculator.subtract(4.0, 2.0), 0.01);
    }
    @Test public void canMultiply() {
        assertEquals(8.0, Calculator.multiply(4.0, 2.0), 0.01);
    }
    @Test public void canDivide() {
        assertEquals(2.0, Calculator.divide(4.0, 2.0), 0.01);
    }
}
