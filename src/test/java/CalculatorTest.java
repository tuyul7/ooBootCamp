package test.java;

import main.java.Calculator;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class CalculatorTest {

    @Test
    public void shouldSumOnePlusTwo(){
        Calculator calculator = new Calculator();
        assertEquals(3, calculator.sum(1, 2));
    }

    @Test
    public void shouldSumTwoPlusThree(){
        Calculator calculator = new Calculator();
        assertEquals(5, calculator.sum(2, 3));
    }
}
