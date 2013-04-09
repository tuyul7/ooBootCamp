package test.java;

import main.java.Calculator;
import org.junit.Test;

public class CalculatorTest {

    @Test
    public void shouldSumMultipleValues(){
        Calculator calculator = new Calculator();
        calculator.sum(1, 2);
    }
}
