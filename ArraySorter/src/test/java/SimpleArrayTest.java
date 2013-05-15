package test.java;

import main.java.SimpleArray;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class SimpleArrayTest {

    @Test
    public void shouldHoldAValueInAnArray(){
        SimpleArray simpleArray = new SimpleArray();
        simpleArray.add(1);
        assertThat(simpleArray.size(), is(1));
    }

    @Test
    public void shouldHold3ValuesInArray(){
        SimpleArray simpleArray = new SimpleArray();
        simpleArray.add(1).add(2).add(3);
        assertThat(simpleArray.size(), is(3));
    }

    @Test
    public void shouldReturn3AsTheLargestInteger(){
        SimpleArray simpleArray = new SimpleArray();
        simpleArray.add(1).add(2).add(3);
        assertThat(simpleArray.largest(), is(3));
    }
}
