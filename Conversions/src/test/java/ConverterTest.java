package test.java;

import main.java.Converter;
import main.java.Pair;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ConverterTest {

    Converter converter = new Converter();

    @Test
    public void shouldConvert12InchesTo1Foot(){
        assertThat(converter.convert(new Pair("INCHES", 12), "FEET"), is(1.0));
    }

    @Test
    public void shouldConvert24InchesTo2Feet(){
        assertThat(converter.convert(new Pair("INCHES", 24), "FEET"), is(2.0));
    }

    @Test
    public void shouldRound18InchesTo1Point5Feet(){
        assertThat(converter.convert(new Pair("INCHES", 18), "FEET"), is(1.5));
    }

    @Test
    public void shouldRound15InchesTo1Point3(){
        assertThat(converter.convert(new Pair("INCHES", 15), "FEET"), is(1.3));
    }

    @Test
    public void shouldConvert1FootTo12Inches(){
        assertThat(converter.feetToInches(1), is(12.0));
    }

    @Test
    public void shouldConvert1CupTo8Tbsps(){
        assertThat(converter.cupsToTbsp(1), is(8.0));
    }

    @Test
    public void shouldConvert2CupTo16Tbsps(){
        assertThat(converter.cupsToTbsp(2), is(16.0));
    }
}
