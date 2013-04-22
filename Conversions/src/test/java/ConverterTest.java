package test.java;

import main.java.Converter;
import main.java.Length;
import main.java.Pair;
import main.java.Volume;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ConverterTest {

    Converter converter = new Converter();

    @Test
    public void shouldConvert12InchesTo1Foot(){
        assertThat(converter.convert(new Pair(Length.INCHES, 12), Length.FEET), is(1.0));
    }

    @Test
    public void shouldConvert24InchesTo2Feet(){
        assertThat(converter.convert(new Pair(Length.INCHES, 24), Length.FEET), is(2.0));
    }

    @Test
    public void shouldRound18InchesTo1Point5Feet(){
        assertThat(converter.convert(new Pair(Length.INCHES, 18), Length.FEET), is(1.5));
    }

    @Test
    public void shouldRound15InchesTo1Point3(){
        assertThat(converter.convert(new Pair(Length.INCHES, 15), Length.FEET), is(1.3));
    }

    @Test
    public void shouldConvert1FootTo12Inches(){
        assertThat(converter.convert(new Pair(Length.FEET, 1), Length.INCHES), is(12.0));
    }

    @Test
    public void shouldConvert1CupTo16Tbsps(){
        assertThat(converter.convert(new Pair(Volume.CUPS, 1), Volume.TABLESPOONS), is(16.0));
    }

    @Test
    public void shouldConvert2CupTo32Tbsps(){
        assertThat(converter.convert(new Pair(Volume.CUPS, 2), Volume.TABLESPOONS), is(32.0));
    }
}
