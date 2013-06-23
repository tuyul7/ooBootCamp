package test.java;

import main.java.PrimeNumberGenerator;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class PrimeNumberGeneratorTest {

    PrimeNumberGenerator primeNumberGenerator = new PrimeNumberGenerator();

    @Test
    public void shouldFindThreeAsAPrimeNumber(){
        assertThat(primeNumberGenerator.isPrime(3), is(true));
    }

    @Test
    public void shouldFindFourAsNotAPrimeNumber(){
        assertThat(primeNumberGenerator.isPrime(4), is(false));
    }
}
