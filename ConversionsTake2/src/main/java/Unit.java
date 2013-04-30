package main.java;

public enum Unit {

    TSP(1),
    TBSP(3),
    CUP(24);

    private int multiplier;

    Unit(int multiplier) {
        this.multiplier = multiplier;
    }

    private int multiplyForBase() {
        return multiplier;
    }

    private int multiplyForConversion() {
        return 1/multiplier;
    }

    public int convert(Measurement measurement){
        int base = measurement.getAmt() * measurement.getUnit().multiplyForBase();
        return base * multiplyForConversion();
    }
}
