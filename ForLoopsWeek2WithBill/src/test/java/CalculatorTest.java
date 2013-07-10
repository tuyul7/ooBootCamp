package test.java;

import main.java.Calculator;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class CalculatorTest {

    private Calculator calc;

    @Before
    public void setUp() {
        calc = new Calculator();
    }

    @Test
    public void shouldSumMultipleNumbers() {
        int[] ints = new int[2];
        ints[0] = 5;
        ints[1] = 10;

        assertThat(calc.sum(ints), is(15));
    }

    @Test
    public void shouldSumAllNumbersFrom1Through5() {
        assertThat(calc.sumUpTo(5), is(15));
    }

    @Test
    public void shouldAverageTheSumOfAllNumbersFrom1Through5() {
        assertThat(calc.avgSumUpTo(5), is(3));
    }

    @Test
    public void shouldFindAllOddNumbersFrom1Through5() {
        List<Integer> expected = new ArrayList<Integer>();
        expected.add(1);
        expected.add(3);
        expected.add(5);
        assertThat(calc.oddNumbersUpTo(5), is(expected));
    }

    @Test
    public void shouldFindSumOfAllOddNumbersFrom1Through5() {
        assertThat(calc.sumOfOddNumbersUpTo(5), is(9));
    }

    @Test
    public void shouldFindAllEvenNumbersFrom1Through5() {
        List<Integer> expected = new ArrayList<Integer>();
        expected.add(2);
        expected.add(4);
        assertThat(calc.evenNumbersUpTo(5), is(expected));
    }

    @Test
    public void shouldFindProductOfAllEvenNumbersFrom1Through5() {
        assertThat(calc.productOfEvenNumbersUpTo(5), is(8));
    }
}