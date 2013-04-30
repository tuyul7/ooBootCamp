package test.java;

import main.java.Measurement;
import org.junit.Test;

import static main.java.Unit.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class MeasurementTest {

    @Test
    public void shouldCalculate1TbspTo3Tsp(){
        Measurement measurement = new Measurement(1, TBSP);
        assertThat(measurement.convertTo(TSP).getAmt(), is(3.f));
    }

    @Test
    public void shouldCalculate2TbspTo6Tsp(){
        Measurement measurement = new Measurement(2, TBSP);
        assertThat(measurement.convertTo(TSP).getAmt(), is(6.f));
    }

    @Test
    public void shouldCalculate3TspTo1Tbsp(){
        Measurement measurement = new Measurement(3, TSP);
        assertThat(measurement.convertTo(TBSP).getAmt(), is(1.f));
    }

    @Test
    public void shouldSetDisplayForSingleAmt(){
        Measurement measurement = new Measurement(1, CUP);
        assertThat(measurement.displayValue(), is("1 cup"));
    }

    @Test
    public void shouldSetDisplayForManyAmt(){
        Measurement measurement = new Measurement(2, CUP);
        assertThat(measurement.displayValue(), is("2 cups"));
    }

    @Test
    public void shouldSetDisplayForZeroAmt(){
        Measurement measurement = new Measurement(0, CUP);
        assertThat(measurement.displayValue(), is("0 cups"));
    }
}
