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
        assertThat(measurement.convertTo(TSP), is(3.f));
    }

    @Test
    public void shouldCalculate2TbspTo6Tsp(){
        Measurement measurement = new Measurement(2, TBSP);
        assertThat(measurement.convertTo(TSP), is(6.f));
    }

    @Test
    public void shouldCalculate3TspTo1Tbsp(){
        Measurement measurement = new Measurement(3, TSP);
        assertThat(measurement.convertTo(TBSP), is(1.f));
    }
}
