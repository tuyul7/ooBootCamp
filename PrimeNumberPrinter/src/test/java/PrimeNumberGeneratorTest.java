package test.java;

import main.java.PrimeNumberGenerator;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class PrimeNumberGeneratorTest {

    @Test
    public void shouldFindTwoThreeAndFiveAsPrimeNumbersUnderFive(){
        PrimeNumberGenerator primeNumberGenerator = new PrimeNumberGenerator();
        List<Integer> primes = new ArrayList<Integer>();
        primes.add(5);
        primes.add(3);
        primes.add(2);
        assertThat(primeNumberGenerator.allPrimeNumbersUpTo(5), is(primes));
    }

}