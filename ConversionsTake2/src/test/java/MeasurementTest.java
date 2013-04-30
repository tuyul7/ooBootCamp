package test.java;

import main.java.Measurement;
import org.junit.Test;

import static main.java.Unit.TBSP;
import static main.java.Unit.TSP;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MeasurementTest {

    @Test
    public void shouldCalculate1TbspTo3Tsp(){
        Measurement measurement = new Measurement(1, TBSP);
        assertThat(measurement.toUnit(TSP), is(3));
    }

    @Test
    public void shouldCalculate2TbspTo6Tsp(){
        Measurement measurement = new Measurement(2, TBSP);
        assertThat(measurement.toUnit(TSP), is(6));
    }
}
