package main.java;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Converter {

    private double round(double val) {
        BigDecimal bigDecimal = new BigDecimal(val);
        return bigDecimal.setScale(1, RoundingMode.CEILING).doubleValue();
    }

    public double inchesToFeet(double inches) {
        return round(inches / 12);
    }

    public double feetToInches(double val) {
        return round(val * 12);
    }

    public Double cupsToTbsp(double val) {
        return val * 8;
    }

    public Double convert(Pair pair, String newType){
        return inchesToFeet(pair.getValue());
    }
}
