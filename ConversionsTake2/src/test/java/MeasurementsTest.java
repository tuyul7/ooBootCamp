package test.java;

import main.java.Measurement;
import main.java.MeasurementCombiner;
import org.junit.Test;

import static main.java.Unit.CUP;
import static main.java.Unit.TSP;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.greaterThan;

public class MeasurementsTest {

    @Test
    public void shouldHoldMultipleMeasurements(){
        MeasurementCombiner mCombiner = new MeasurementCombiner();
        mCombiner.add(new Measurement(1, CUP));
        mCombiner.add(new Measurement(2, TSP));

        assertThat(mCombiner.getMeasurements().size(), greaterThan(1));
    }

    @Test
    public void shouldConvertMeasurementsToOneType(){
        MeasurementCombiner mCombiner = new MeasurementCombiner();
        mCombiner.add(new Measurement(1, CUP));
        mCombiner.add(new Measurement(2, TSP));

        assertThat(mCombiner.convertTo(TSP).getAmt(), equalTo(26.f));
        assertThat(mCombiner.convertTo(TSP).getUnit(), equalTo(TSP));
    }

}
