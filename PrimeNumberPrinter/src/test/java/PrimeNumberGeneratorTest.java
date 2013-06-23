package test.java;

import main.java.PrimeNumberGenerator;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class PrimeNumberGeneratorTest {

    @Test
    public void shouldFindThreeAsAPrimeNumber(){
        PrimeNumberGenerator primeNumberGenerator = new PrimeNumberGenerator();
        assertThat(primeNumberGenerator.isPrime(3), is(true));
    }
}
