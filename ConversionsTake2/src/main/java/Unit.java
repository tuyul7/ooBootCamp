package main.java;

public enum Unit implements Comparable<Unit> {

    TSP(1.f),
    TBSP(3.f),
    CUP(24.f);

    private float multiplier;

    Unit(float multiplier) {
        this.multiplier = multiplier;
    }

    private float asBase(float amt) {
        return amt * multiplier;
    }

    private float multiplyForConversion() {
        return 1/multiplier;
    }

    public float convertFrom(Measurement measurement){
        float base = measurement.getUnit().asBase(measurement.getAmt());
        return base * multiplyForConversion();
    }
}
