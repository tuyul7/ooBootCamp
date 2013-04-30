package main.java;

public class Measurement {

    private Unit unit;
    private float amt;

    public Measurement(float amt, Unit unit) {
        this.amt = amt;
        this.unit = unit;
    }


    public Measurement convertTo(Unit newUnit) {
        return new Measurement(newUnit.convertFrom(this), newUnit);
    }

    public float getAmt() {
        return amt;
    }

    public Unit getUnit() {
        return unit;
    }

    public String displayValue() {
        return amt + " " + unit.displayUnit(amt);
    }
}
