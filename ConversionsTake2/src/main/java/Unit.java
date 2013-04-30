package main.java;

public enum Unit implements Comparable<Unit> {

    TSP(1.f, "TSPS"),
    TBSP(3.f, "TBSPS"),
    CUP(24.f, "CUPS"),
    INCH(1.f, "INCHES"),
    YARD(36.f, "YARDS");

    private float multiplier;
    private String plural;

    Unit(float multiplier, String plural) {
        this.multiplier = multiplier;
        this.plural = plural;
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

    public String displayUnit(float amt){
        if(amt == 0 || amt > 1) {return plural.toLowerCase(); }
        else { return this.toString().toLowerCase();}
    }

}
