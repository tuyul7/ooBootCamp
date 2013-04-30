package main.java;

import java.util.ArrayList;

public class MeasurementCombiner {


    private ArrayList<Measurement> measurements = new ArrayList<Measurement>();

    public ArrayList<Measurement> getMeasurements() {
        return measurements;
    }

    public MeasurementCombiner add(Measurement measurement) {
        this.measurements.add(measurement);
        return this;
    }

    public Measurement convertTo(Unit unit) {
        float sum = 0.f;
        for(Measurement measurement : measurements) {
            sum += measurement.convertTo(unit).getAmt();
        }
        return new Measurement(sum, unit);
    }

    public String displayValue() {
        String display = "";
        for(Measurement measurement : measurements) {
            display += measurement.displayValue() + " + ";
        }
        return display.substring(0, display.length() - 3);
    }
}
