package test.java;

import main.java.Calculator;
import org.junit.Test;

import static java.util.Arrays.asList;
import static junit.framework.Assert.assertEquals;

public class CalculatorTest {

    @Test
    public void shouldSumOnePlusTwo(){
        Calculator calculator = new Calculator();
        assertEquals(3, calculator.sum(asList(1, 2)));
    }

    @Test
    public void shouldSumTwoPlusThree(){
        Calculator calculator = new Calculator();
        assertEquals(5, calculator.sum(asList(2, 3)));
    }

    @Test
    public void shouldSumMoreThanTwoNumbers(){
        Calculator calculator = new Calculator();
        assertEquals(6, calculator.sum(asList(1, 2, 3)));
    }

}
