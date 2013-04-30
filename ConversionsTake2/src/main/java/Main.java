package main.java;

import static main.java.Unit.*;

public class Main {

    public static void main(String[] args) {
        basicVolumeConversion();

        multipleInputsVolumeConversion();

        basicLengthConversion();
    }

    private static void basicVolumeConversion() {
        Measurement measurement = new Measurement(1, CUP);
        Measurement result = measurement.convertTo(TBSP);
        System.out.println(measurement.displayValue() + " = " + result.displayValue());
    }

    private static void multipleInputsVolumeConversion() {
        Measurement measurement = new Measurement(1, CUP);
        Measurement measurement2 = new Measurement(4, TBSP);
        MeasurementCombiner mCombiner = new MeasurementCombiner().add(measurement).add(measurement2);
        Measurement result = mCombiner.convertTo(TBSP);
        System.out.println(mCombiner.displayValue() + " = " + result.displayValue());
    }

    private static void basicLengthConversion() {
        Measurement measurement = new Measurement(36, YARD);
        Measurement result = measurement.convertTo(INCH);
        System.out.println(measurement.displayValue() + " = " + result.displayValue());
    }
}
