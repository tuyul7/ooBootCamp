package test.java;

import main.java.Calculator;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class CalculatorTest {

    @Test
    public void shouldSumMultipleValues(){
        Calculator calculator = new Calculator();
        assertEquals(3, calculator.sum(1, 2));
    }


}
