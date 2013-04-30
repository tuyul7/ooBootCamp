package test.java;

import main.java.Measurement;
import main.java.Measurements;
import org.junit.Test;

import static main.java.Unit.CUP;
import static main.java.Unit.TSP;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.greaterThan;

public class MeasurementsTest {

    @Test
    public void shouldHoldMultipleMeasurements(){
        Measurements measurements = new Measurements();
        measurements.add(new Measurement(1, CUP));
        measurements.add(new Measurement(2, TSP));

        assertThat(measurements.getMeasurements().size(), greaterThan(1));
    }

    @Test
    public void shouldConvertMeasurementsToOneType(){
        Measurements measurements = new Measurements();
        measurements.add(new Measurement(1, CUP));
        measurements.add(new Measurement(2, TSP));

        assertThat(measurements.convertTo(TSP).getAmt(), equalTo(26.f));
        assertThat(measurements.convertTo(TSP).getUnit(), equalTo(TSP));
    }

}
