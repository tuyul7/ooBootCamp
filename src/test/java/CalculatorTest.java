package test.java;

import main.java.Calculator;
import main.java.Rectangle;
import org.junit.Test;

import static java.util.Arrays.asList;
import static junit.framework.Assert.assertEquals;

public class CalculatorTest {

    @Test
    public void shouldSumOnePlusTwo(){
        Calculator calculator = new Calculator();
        assertEquals(3.0, calculator.sum(asList(1.0, 2.0)));
    }

    @Test
    public void shouldSumTwoPlusThree(){
        Calculator calculator = new Calculator();
        assertEquals(5.0, calculator.sum(asList(2.0, 3.0)));
    }

    @Test
    public void shouldSumMoreThanTwoNumbers(){
        Calculator calculator = new Calculator();
        assertEquals(6.0, calculator.sum(asList(1.0, 2.0, 3.0)));
    }

    @Test
    public void shouldSumAreasFromTwoRectangles(){
        Calculator calculator = new Calculator();
        assertEquals(8.0, calculator.sum(asList(new Rectangle(1, 2).area(), new Rectangle(2, 3).area())));
    }

}
