package test.java;

import main.java.Converter;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ConverterTest {

    Converter converter = new Converter();

    @Test
    public void shouldConvert12InchesTo1Foot(){
        assertThat(converter.inchesToFeet(12), is(1.0));
    }

    @Test
    public void shouldConvert24InchesTo2Feet(){
        assertThat(converter.inchesToFeet(24), is(2.0));
    }

    @Test
    public void shouldRound18InchesTo1Point5Feet(){
        assertThat(converter.inchesToFeet(18), is(1.5));
    }
}
