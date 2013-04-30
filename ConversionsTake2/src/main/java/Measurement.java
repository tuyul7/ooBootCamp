package main.java;

public class Measurement {

    private Unit unit;
    private int amt;

    public Measurement(int amt, Unit unit) {
        this.amt = amt;
        this.unit = unit;
    }


    public float convertTo(Unit newUnit) {
        return newUnit.convertFrom(this);
    }

    public int getAmt() {
        return amt;
    }

    public Unit getUnit() {
        return unit;
    }
}
