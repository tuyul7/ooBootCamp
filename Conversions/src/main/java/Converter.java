package main.java;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Converter {

    private double round(double val) {
        BigDecimal bigDecimal = new BigDecimal(val);
        return bigDecimal.setScale(1, RoundingMode.CEILING).doubleValue();
    }

    public double convert(Pair pair, Object newType){
        double valInInches = pair.getKey() * pair.getValue();
        return round(valInInches / (Double) newType);
    }
}
