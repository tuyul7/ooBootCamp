package test.java;

import main.java.SimpleArray;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.greaterThan;

public class SimpleArrayTest {

    @Test
    public void shouldHoldMultipleNumbersInAnArray(){
        SimpleArray simpleArray = new SimpleArray();
        assertThat(simpleArray.size(), greaterThan(0));
    }
}
