package main.java;

import static main.java.Unit.CUP;
import static main.java.Unit.TBSP;

public class Main {

    public static void main(String[] args) {
        basicVolumeConversion();

        multipleInputsVolumeConversion();
    }

    private static void basicVolumeConversion() {
        Measurement measurement = new Measurement(1, CUP);
        Measurement newMeasurement = measurement.convertTo(TBSP);
        System.out.println(measurement.displayValue() + " = " + newMeasurement.displayValue());
    }

    private static void multipleInputsVolumeConversion() {
        Measurement measurement = new Measurement(1, CUP);
        Measurement measurement2 = new Measurement(4, TBSP);
        Measurements measurements = new Measurements().add(measurement).add(measurement2);
        Measurement result = measurements.convertTo(TBSP);
        System.out.println(measurements.displayValue() + " = " + result.displayValue());
    }
}
